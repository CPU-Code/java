package com.cpucode.pattern.delegate.mvc;

import com.cpucode.pattern.delegate.mvc.controllers.MemberController;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * @author : cpucode
 * @date : 2021/6/2
 * @time : 12:46
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class DispatcherServlet2 extends HttpServlet {
    private List<Handler> handlerMapping = new ArrayList<Handler>();

    @Override
    public void init() throws ServletException {
        try {
            Class<?> memberControllerClass = MemberController.class;

            handlerMapping.add(new Handler()
                    .setController(memberControllerClass.newInstance())
                    .setMethod(memberControllerClass.getMethod("getMemberById", new Class[]{String.class}))
                    .setUrl("/web/getMemberById.json"));
        }catch(Exception e){
        }
    }

    private void doDispatch(HttpServletRequest request, HttpServletResponse response){
        //1、 获取用户请求的 url
        // 如果按照 J2EE 的标准、 每个 url 对对应一个 Serlvet， url 由浏览器输入
        String uri = request.getRequestURI();

        //2、 Servlet 拿到 url 以后， 要做权衡（ 要做判断， 要做选择）
        // 根据用户请求的 URL， 去找到这个 url 对应的某一个 java 类的方法

        //3、 通过拿到的 URL 去 handlerMapping（我们把它认为是策略常量）
        Handler handle = null;

        for (Handler h: handlerMapping) {
            if(uri.equals(h.getUrl())){
                handle = h;

                break;
            }
        }

        //4、 将具体的任务分发给 Method（通过反射去调用其对应的方法）
        Object object = null;

        try {
            object = handle.getMethod().invoke(handle.getController(), request.getParameter("mid"));
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        //5、 获取到 Method 执行的结果， 通过 Response 返回出去
        // response.getWriter().write();
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws
            ServletException, IOException {
        try {
            doDispatch(req, resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    class Handler{
        private Object controller;
        private Method method;
        private String url;

        public Object getController() {
            return controller;
        }

        public Handler setController(Object controller) {
            this.controller = controller;
            return this;
        }

        public Method getMethod() {
            return method;
        }

        public Handler setMethod(Method method) {
            this.method = method;

            return this;
        }

        public String getUrl() {
            return url;
        }

        public Handler setUrl(String url) {
            this.url = url;

            return this;
        }
    }

}
