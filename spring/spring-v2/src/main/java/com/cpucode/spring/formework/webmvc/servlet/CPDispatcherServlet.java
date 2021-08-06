package com.cpucode.spring.formework.webmvc.servlet;

import com.cpucode.spring.formework.annotation.CPController;
import com.cpucode.spring.formework.annotation.CPRequestMapping;
import com.cpucode.spring.formework.context.CPApplicationContext;
import lombok.extern.slf4j.Slf4j;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Servlet 只是作为一个 MVC 的启动入口
 *
 * @author : cpucode
 * @date : 2021/8/4
 * @time : 14:08
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
@Slf4j
public class CPDispatcherServlet extends HttpServlet {
    private final String LOCATION = "contextConfigLocation";

    /**
     * HandlerMapping 最核心的设计，也是最经典的
     */
    private List<CPHandlerMapping> handlerMappings = new ArrayList<CPHandlerMapping>();

    private Map<CPHandlerMapping, CPHandlerAdapter> handlerAdapters = new HashMap<CPHandlerMapping, CPHandlerAdapter>();

    private List<CPViewResolver> viewResolvers = new ArrayList<CPViewResolver>();

    private CPApplicationContext context;

    @Override
    public void init(ServletConfig config) throws ServletException {
        //相当于把 IOC 容器初始化了
        context = new CPApplicationContext(config.getInitParameter(LOCATION));
        initStrategies(context);
    }

    /**
     * 初始化策略
     * @param context
     */
    protected void initStrategies(CPApplicationContext context) {
        /**
         * 九大组件
         *  对于每个用户请求， 都会经过一些处理的策略之后， 最终才能有结果输出
         *  每种策略可以自定义干预， 但是最终的结果都是一致
         */

        //文件上传解析， 如果请求类型是 multipart 将通过 MultipartResolver 进行文件上传解析
        initMultipartResolver(context);
        //本地化解析
        initLocaleResolver(context);
        //主题解析
        initThemeResolver(context);

        /**
         * CPHandlerMapping 用来保存 Controller 中配置的 RequestMapping 和 Method 的一个对应关系
         * 通过 HandlerMapping， 将请求映射到处理器
         */
        initHandlerMappings(context);

        /**
         * HandlerAdapters 用来动态匹配 Method 参数， 包括类转换， 动态赋值
         * 通过 HandlerAdapter 进行多类型的参数动态匹配
         */
        initHandlerAdapters(context);
        //如果执行过程中遇到异常， 将交给 HandlerExceptionResolver 来解析
        initHandlerExceptionResolvers(context);

        //直接解析请求到视图名
        initRequestToViewNameTranslator(context);

        /**
         * 通过 ViewResolvers 实现动态模板的解析 , 解析一套模板语言 ,
         * 通过 viewResolver 解析逻辑视图到具体视图实现
         */
        initViewResolvers(context);

        //flash 映射管理器
        initFlashMapManager(context);
    }

    private void initFlashMapManager(CPApplicationContext context) {}
    private void initRequestToViewNameTranslator(CPApplicationContext context) {}
    private void initHandlerExceptionResolvers(CPApplicationContext context) {}
    private void initThemeResolver(CPApplicationContext context) {}
    private void initLocaleResolver(CPApplicationContext context) {}
    private void initMultipartResolver(CPApplicationContext context) {}


    /**
     * 将 Controller 中配置的 RequestMapping 和 Method 进行一一对应
     * @param context
     */
    private void initHandlerMappings(CPApplicationContext context) {
        //按照我们通常的理解应该是一个 Map
        //Map<String, Method> map;
        //map.put(url, Method)

        //首先从容器中取到所有的实例
        String [] beanNames = context.getBeanDefinitionNames();

        try {
            for (String beanName : beanNames) {
                //到了 MVC 层， 对外提供的方法只有一个 getBean 方法
                //返回的对象不是 BeanWrappe
                Object controller = context.getBean(beanName);

                Class<?> clazz = controller.getClass();
                if (!clazz.isAnnotationPresent(CPController.class)) {
                    continue;
                }

                String baseUrl = "";
                if (clazz.isAnnotationPresent(CPRequestMapping.class)) {
                    CPRequestMapping requestMapping = clazz.getAnnotation(CPRequestMapping.class);
                    // 获取到controller的url
                    baseUrl = requestMapping.value();
                }

                //扫描所有的 public 方法
                Method[] methods = clazz.getMethods();
                for (Method method : methods) {
                    if (!method.isAnnotationPresent(CPRequestMapping.class)) {
                        continue;
                    }

                    CPRequestMapping requestMapping = method.getAnnotation(CPRequestMapping.class);
                    String regex = ("/" + baseUrl + requestMapping.value().replaceAll("\\*",
                            ".*")).replaceAll("/+", "/");

                    Pattern pattern = Pattern.compile(regex);
                    this.handlerMappings.add(new CPHandlerMapping(pattern, controller, method));

                    log.info("Mapping: " + regex + " , " + method);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    /**
     * 在初始化阶段， 我们能做的就是， 将这些参数的名字或者类型按一定的顺序保存下来
     * 因为后面用反射调用的时候， 传的形参是一个数组
     * 可以通过记录这些参数的位置 index, 挨个从数组中填值，就和参数的顺序无关了
     * @param context
     */
    private void initHandlerAdapters(CPApplicationContext context) {
        for(CPHandlerMapping handlerMapping : this.handlerMappings){
            this.handlerAdapters.put(handlerMapping, new CPHandlerAdapter());
        }
    }

    /**
     *  在页面敲一个 http://localhost/first.html
     *   解决页面名字和模板文件关联的问题
     * @param context
     */
    private void initViewResolvers(CPApplicationContext context) {
        String templateRoot = context.getConfig().getProperty("templateRoot");
        String templateRootPath =
                this.getClass().getClassLoader().getResource(templateRoot).getFile();

        File templateRootDir = new File(templateRootPath);
        for (File template : templateRootDir.listFiles()) {
            this.viewResolvers.add(new CPViewResolver(templateRoot));
        }
    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try{
            this.doDispatch(req, resp);
        }catch(Exception e){
            resp.getWriter().write("500 Exception,Details:\r\n" + Arrays.toString(e.getStackTrace()).replaceAll("\\[|\\]", "").replaceAll(",\\s", "\r\n"));
            e.printStackTrace();
//            new GPModelAndView("500");
        }
    }

    private void doDispatch(HttpServletRequest req, HttpServletResponse resp) throws Exception{
        //根据用户请求的 URL 来获得一个 Handler
        CPHandlerMapping handler = getHandler(req);

        if(handler == null){
            processDispatchResult(req,resp,new CPModelAndView("404"));
            return;
        }

        CPHandlerAdapter ha = getHandlerAdapter(handler);

        //这一步只是调用方法， 得到返回值
        CPModelAndView mv = ha.handle(req, resp, handler);
        //这一步才是真的输出
        processDispatchResult(req, resp, mv);
    }

    /**
     * 返回页面
     * @param req
     * @param resp
     * @param mv
     * @throws Exception
     */
    private void processDispatchResult(HttpServletRequest req, HttpServletResponse resp, CPModelAndView mv) throws Exception{
        // 把给我的 ModleAndView 变成一个HTML、OuputStream、json、freemark、veolcity ContextType
        if(null == mv){
            return;
        }

        if(this.viewResolvers.isEmpty()){
            return;
        }

        for (CPViewResolver viewResolver : this.viewResolvers) {
            CPView view = viewResolver.resolveViewName(mv.getViewName(),null);
            if (view != null) {
                view.render(mv.getModel(), req, resp);

                return;
            }
        }
    }

    private CPHandlerAdapter getHandlerAdapter(CPHandlerMapping handler) {
        if(this.handlerAdapters.isEmpty()){
            return null;
        }
        CPHandlerAdapter ha = this.handlerAdapters.get(handler);

        if (ha.supports(handler)) {
            return ha;
        }

        return null;
    }

    private CPHandlerMapping getHandler(HttpServletRequest req) throws Exception{
        if(this.handlerMappings.isEmpty()){
            return null;
        }

        String url = req.getRequestURI();
        String contextPath = req.getContextPath();
        url = url.replace(contextPath,"").replaceAll("/+","/");

        for (CPHandlerMapping handler : this.handlerMappings) {
            Matcher matcher = handler.getPattern().matcher(url);
            if(!matcher.matches()){
                continue;
            }

            return handler;
        }

        return null;
    }
}
