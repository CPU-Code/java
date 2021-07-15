package com.cpucode.mvcframework.v1.servlet;

import com.cpucode.mvcframework.annotation.CPAutowired;
import com.cpucode.mvcframework.annotation.CPController;
import com.cpucode.mvcframework.annotation.CPRequestMapping;
import com.cpucode.mvcframework.annotation.CPService;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * 核心逻辑
 *
 * @author : cpucode
 * @date : 2021/7/15
 * @time : 20:20
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class CPDispatcherServlet extends HttpServlet {
    /**
     * IOC容器初始化
     */
    private Map<String, Object> mapping = new HashMap<String, Object>();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException,
            IOException {
        this.doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException,
            IOException {
        try {
            doDispatch(req, resp);
        } catch (Exception e) {
            resp.getWriter().write("500 Exception " +
                    Arrays.toString(e.getStackTrace()));
        }
    }

    /**
     * init方法肯定干得的初始化的工作
     *  inti首先我得初始化所有的相关的类，IOC容器、servletBean
     *
     * @param config
     * @throws ServletException
     */
    @Override
    public void init(ServletConfig config) throws ServletException{
        InputStream is = null;

        try{
            // 加载配置文件
            Properties configContext = new Properties();

            is = this.getClass().getClassLoader().
                    getResourceAsStream(config.getInitParameter("contextConfigLocation"));

            configContext.load(is);
            String scanPackage = configContext.getProperty("scanPackage");

            doScanner(scanPackage);

            for (String className : mapping.keySet()) {

                if(!className.contains(".")){
                    continue;
                }

                // 创建实例化并保存至容器 , 通过反射机制将类实例化放入IOC容器中
                Class<?> clazz = Class.forName(className);
                if(clazz.isAnnotationPresent(CPController.class)){
                    mapping.put(className, clazz.newInstance());
                    String baseUrl = "";

                    // 拿到 rul
                    if (clazz.isAnnotationPresent(CPRequestMapping.class)) {
                        CPRequestMapping requestMapping = clazz.getAnnotation(CPRequestMapping.class);
                        baseUrl = requestMapping.value();
                    }

                    // 获取类的所有方法
                    Method[] methods = clazz.getMethods();
                    for (Method method : methods) {
                        if (!method.isAnnotationPresent(CPRequestMapping.class)) {
                            continue;
                        }
                        // 初始化HandlerMapping ,
                        // 将一个 URL 和一个 Method 进行一对一的关联映射Map<String, Method>
                        CPRequestMapping requestMapping = method.getAnnotation(CPRequestMapping.class);
                        // 整合 方法路径
                        String url = (baseUrl + "/" + requestMapping.value()).
                                replaceAll("/+", "/");
                        mapping.put(url, method);

                        System.out.println("Mapped " + url + "," + method);
                    }
                }else if (clazz.isAnnotationPresent(CPService.class)){
                    CPService service = clazz.getAnnotation(CPService.class);
                    String beanName = service.value();

                    if("".equals(beanName)){
                        beanName = clazz.getName();
                    }

                    Object instance = clazz.newInstance();
                    mapping.put(beanName, instance);

                    for (Class<?> i : clazz.getInterfaces()) {
                        mapping.put(i.getName(), instance);
                    }
                }else {
                    continue;
                }
            }

            // 扫描 IOC容器中的实例, 给没有赋值的属性白动赋值
            for (Object object : mapping.values()) {
                if(object == null){
                    continue;
                }

                Class clazz = object.getClass();


                if(clazz.isAnnotationPresent(CPController.class)){
                    Field[] fields = clazz.getDeclaredFields();

                    // 类属性
                    for (Field field : fields) {
                        if(!field.isAnnotationPresent(CPAutowired.class)){
                            continue;
                        }

                        // 获取注释的参数
                        CPAutowired autowired = field.getAnnotation(CPAutowired.class);
                        String beanName = autowired.value();

                        if("".equals(beanName)){
                            // 获取类属性的名字
                            beanName = field.getType().getName();
                        }

                        field.setAccessible(true);

                        try {
                            field.set(mapping.get(clazz.getName()), mapping.get(beanName));
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }


        } catch (Exception e) {
        } finally {
            if(is != null){
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        System.out.print("CP MVC Framework is init");
    }

    private void doDispatch(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        // 从request对象中获得用户输入的url,找到其对应的Method
        String url = req.getRequestURI();
        String contextPath = req.getContextPath();
        url = url.replace(contextPath, "").replaceAll("/+", "/");

        if(!this.mapping.containsKey(url)){
            resp.getWriter().write("404 Not Found!!");
            return;
        }

        Method method = (Method) this.mapping.get(url);
        Map<String, String[]> params = req.getParameterMap();

        // 利用反射调用方法并返回结果
        method.invoke(this.mapping.get(method.getDeclaringClass().getName()),
                new Object[]{req, resp, params.get("name")[0]});
    }

    /**
     * 扫描相关的包
     * @param scanPackage
     */
    private void doScanner(String scanPackage) {
        URL url = this.getClass().getClassLoader().getResource("/" +
                scanPackage.replaceAll("\\.","/"));
        File classDir = new File(url.getFile());

        for (File file : classDir.listFiles()) {
            if(file.isDirectory()){
                // 是目录就递归
                doScanner(scanPackage + "." +  file.getName());
            } else {
                String clazzName = (scanPackage + "." +
                        file.getName().replace(".class",""));
                // 加入到容器
                mapping.put(clazzName, null);
            }
        }
    }
}
