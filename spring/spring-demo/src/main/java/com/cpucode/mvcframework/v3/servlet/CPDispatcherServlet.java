package com.cpucode.mvcframework.v3.servlet;

import com.cpucode.mvcframework.annotation.*;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author : cpucode
 * @date : 2021/7/16
 * @time : 16:35
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class CPDispatcherServlet extends HttpServlet {

    private static final String LOCATION = "contextConfigLocation";

    /**
     * 保存application.properties配置文件中的内容
     */
    private Properties contextConfig = new Properties();

    /**
     * 保存扫描的所有的类名
     */
    private List<String> classNames = new ArrayList<String>();

    /**
     * IOC容器
     */
    private Map<String, Object> ioc = new HashMap<String, Object>();

    /**
     * Handler 本身的功能就是把url和method对应关系，已经具备了Map的功能
     * 根据设计原则：冗余的感觉了，单一职责，最少知道原则，帮助我们更好的理解
     */
    private List<Handler> handlerMapping = new ArrayList<Handler>();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //6、调用，运行阶段
        try {
            //开始始匹配到对应的方方法
            doDispatch(req, resp);
        } catch (Exception e) {
            e.printStackTrace();
            //如果匹配过程出现异常，将异常信息打印出去
            resp.getWriter().write("500 Exection, Detail : " + Arrays.toString(e.getStackTrace()));
        }
    }

    /**
     * 初始化阶段
     * @param config
     * @throws ServletException
     */
    @Override
    public void init(ServletConfig config) throws ServletException {

        //1、加载配置文件
        doLoadConfig(config.getInitParameter(LOCATION));

        //2、扫描相关的类
        doScanner(contextConfig.getProperty("scanPackage"));

        //3、初始化扫描到的类，并且将它们放入到ICO容器之中
        doInstance();

        //4、完成依赖注入
        doAutowired();

        //5、初始化HandlerMapping
        initHandlerMapping();

        System.out.println("GP Spring framework is init.");

    }

    /**
     * 匹配 URL
     * @param req
     * @param resp
     * @throws Exception
     */
    private void doDispatch(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        Handler handler = getHandler(req);

        if(handler == null){
            resp.getWriter().write("404 Not Found!!!");

            return;
        }

        //获得方法的形参列表
        Class<?> [] paramTypes = handler.getParamTypes();
        //保存所有需要自动赋值的参数值
        Object [] paramValues = new Object[paramTypes.length];
        Map<String,String[]> params = req.getParameterMap();

        for (Map.Entry<String, String[]> parm : params.entrySet()) {
            String value = Arrays.toString(parm.getValue())
                    .replaceAll("\\[|\\]","")
                    .replaceAll("\\s",",");

            //如果找到匹配的对象，则开始填充参数值
            if(!handler.paramIndexMapping.containsKey(parm.getKey())){
                continue;
            }

            int index = handler.paramIndexMapping.get(parm.getKey());
            paramValues[index] = convert(paramTypes[index], value);
        }

        //设置方法中的request和response对象
        if(handler.paramIndexMapping.containsKey(HttpServletRequest.class.getName())) {
            int reqIndex = handler.paramIndexMapping.get(HttpServletRequest.class.getName());

            paramValues[reqIndex] = req;
        }

        if(handler.paramIndexMapping.containsKey(HttpServletResponse.class.getName())) {
            int respIndex = handler.paramIndexMapping.get(HttpServletResponse.class.getName());

            paramValues[respIndex] = resp;
        }

        Object returnValue = handler.method.invoke(handler.controller, paramValues);
        if(returnValue == null || returnValue instanceof Void){
            return;
        }

        resp.getWriter().write(returnValue.toString());
    }

    /**
     * 处理 url 的正则匹配
     * @param req
     * @return
     * @throws Exception
     */
    private Handler getHandler(HttpServletRequest req) throws Exception{
        if(handlerMapping.isEmpty()){
            return null;
        }

        //绝对路径
        String url = req.getRequestURI();
        //处理成相对路径
        String contextPath = req.getContextPath();

        url = url.replaceAll(contextPath,"")
                .replaceAll("/+","/");

        for (Handler handler : this.handlerMapping) {
            Matcher matcher = handler.getPattern().matcher(url);
            if(!matcher.matches()){
                continue;
            }

            return handler;
        }

        return null;
    }

    /**
     * 加载配置文件
     * @param contextConfigLocation
     */
    private void doLoadConfig(String contextConfigLocation) {
        String replace = contextConfigLocation.replace("classpath:", "");

        /**
         * 从类路径下找到 Spring 主配置文件所在的路径
         * 并且将其读取出来放到Properties对象中
         * 相对于scanPackage=com.cpucode.demo 从文件中保存到了内存中
         */
        InputStream fis = this.getClass().getClassLoader()
                .getResourceAsStream(replace);

        try {
            //1、读取配置文件
            contextConfig.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(null != fis){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 扫描出相关的类
     * @param packageName
     */
    private void doScanner(String packageName){
        /**
         * scanPackage = com.cpucode.demo ，存储的是包路径
         * 转换为文件路径，实际上就是把.替换为/就OK了
         *  classpath
         */
        URL url = this.getClass().getClassLoader()
                .getResource("/" + packageName.replaceAll("\\.","/"));
        File classPath = new File(url.getFile());

        for (File file : classPath.listFiles()) {
            // 如果是文件夹，继续递归
            if(file.isDirectory()){
                doScanner(packageName + "." + file.getName());
            }else {
                if(!file.getName().endsWith(".class")){
                    continue;
                }
                String className = (packageName + "." + file.getName().replace(".class",""));
                classNames.add(className);
            }
        }
    }

    /**
     * 初始化扫描到的类，并且将它们放入到ICO容器之中
     */
    private void doInstance(){
        //初始化，为DI做准备
        if(classNames.isEmpty()){
            return;
        }
        try {
            for (String className : classNames) {
                Class<?> clazz = Class.forName(className);

                /**
                 * 加了注解的类，才初始化
                 */
                if(clazz.isAnnotationPresent(CPController.class)){
                    Object instance = clazz.newInstance();
                    //Spring默认类名首字母小写
                    String beanName = toLowerFirstCase(clazz.getSimpleName());
                    ioc.put(beanName, instance);
                }else if(clazz.isAnnotationPresent(CPService.class)){
                    //1、自定义的beanName
                    CPService service = clazz.getAnnotation(CPService.class);
                    String beanName = service.value();

                    //2、默认类名首字母小写
                    if("".equals(beanName.trim())){
                        beanName = toLowerFirstCase(clazz.getSimpleName());
                    }

                    // 按接口类型创建一个实例
                    Object instance = clazz.newInstance();
                    ioc.put(beanName, instance);

                    //3、根据类型自动赋值, 投机取巧的方式
                    for (Class<?> i : clazz.getInterfaces()) {
                        if(ioc.containsKey(i.getName())){
                            throw new Exception("The “" + i.getName() + "” is exists!!");
                        }

                        //把接口的类型直接当成key了
                        ioc.put(i.getName(), instance);
                    }
                }else {
                    continue;
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     * 完成依赖注入
     */
    private void doAutowired(){
        if(ioc.isEmpty()){
            return;
        }

        for (Map.Entry<String, Object> entry : ioc.entrySet()) {
            //Declared 所有的，特定的 字段，包括private/protected/default
            //正常来说，普通的OOP编程只能拿到public的属性
            Field[] fields = entry.getValue().getClass().getDeclaredFields();

            for (Field field : fields) {
                if(!field.isAnnotationPresent(CPAutowired.class)){
                    continue;
                }

                CPAutowired autowired = field.getAnnotation(CPAutowired.class);

                //如果用户没有自定义beanName，默认就根据类型注入
                String beanName = autowired.value().trim();

                if("".equals(beanName)){
                    //获得接口的类型，作为key待会拿这个key到ioc容器中去取值
                    beanName = field.getType().getName();
                }

                //如果是public以外的修饰符，只要加了@Autowired注解，都要强制赋值
                //反射中叫做暴力访问， 强吻
                field.setAccessible(true);

                try {
                    //用反射机制，动态给字段赋值
                    field.set(entry.getValue(), ioc.get(beanName));
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 初始化 url 和 Method 的一对一对应关系
     */
    private void initHandlerMapping(){
        if(ioc.isEmpty()){
            return;
        }

        for (Map.Entry<String, Object> entry : ioc.entrySet()) {
            Class<?> clazz = entry.getValue().getClass();

            if(!clazz.isAnnotationPresent(CPController.class)){
                continue;
            }

            //保存写在类上面的@GPRequestMapping("/demo")
            String baseUrl = "";

            // 获取Controller的url配置
            if(clazz.isAnnotationPresent(CPRequestMapping.class)){
                CPRequestMapping requestMapping = clazz.getAnnotation(CPRequestMapping.class);
                baseUrl = requestMapping.value();
            }

            //默认获取所有的public方法
            for (Method method : clazz.getMethods()) {
                //没有加RequestMapping注解的直接忽略
                if(!method.isAnnotationPresent(CPRequestMapping.class)){
                    continue;
                }

                //映射URL
                CPRequestMapping requestMapping = method.getAnnotation(CPRequestMapping.class);
                //优化
                // //demo///query
                String regex = ("/" + baseUrl + "/" + requestMapping.value())
                        .replaceAll("/+","/");
                Pattern pattern = Pattern.compile(regex);

                this.handlerMapping.add(new Handler(pattern, entry.getValue(), method));

                System.out.println("Mapped :" + pattern + "," + method);
            }
        }
    }


    /**
     * 小写转换
     * @param simpleName
     * @return
     */
    private String toLowerFirstCase(String simpleName) {
        char [] chars = simpleName.toCharArray();
        //大小写字母的ASCII码相差32，
        chars[0] += 32;
        return String.valueOf(chars);
    }

    /**
     *  url 参数的强制类型转换
     * @param type
     * @param value
     * @return
     */
    private Object convert(Class<?> type, String value){
        if(Integer.class == type){
            return Integer.valueOf(value);
        }

        return value;
    }

    /**
     * 保存一个url和一个Method的关系
     */
    private class Handler{
        /**
         * 保存方法对应的实例
         */
        protected Object controller;
        /**
         * 保存映射的方法
         */
        protected Method method;
        /**
         * 正则
         */
        protected Pattern pattern;
        /**
         * 参数顺序
         */
        protected Class<?> [] paramTypes;

        /**
         * 形参列表
         * 参数的名字作为key,参数的顺序，位置作为值
         */
        private Map<String, Integer> paramIndexMapping;

        public Object getController() {
            return controller;
        }

        public Method getMethod() {
            return method;
        }

        public Pattern getPattern() {
            return pattern;
        }

        public  Class<?>[] getParamTypes() {
            return paramTypes;
        }

        /**
         * 构造一个 Handler 基本的参数
         * @param pattern
         * @param controller
         * @param method
         */
        protected Handler(Pattern pattern, Object controller, Method method){
            this.controller = controller;
            this.method = method;
            this.pattern = pattern;
            paramTypes =  method.getParameterTypes();

            paramIndexMapping = new HashMap<String, Integer>();

            putParamIndexMapping(method);
        }

        private void putParamIndexMapping(Method method){
            /**
             * 提取方法中加了注解的参数
             * 把方法上的注解拿到，得到的是一个二维数组
             * 因为一个参数可以有多个注解，而一个方法又有多个参数
             */
            Annotation[] [] pa = method.getParameterAnnotations();

            for (int i = 0; i < pa.length; i++) {
                for(Annotation a: pa[i]){
                    if(a instanceof CPRequestParam){
                        String paramName = ((CPRequestParam) a).value();

                        if(!"".equals(paramName.trim())){
                            paramIndexMapping.put(paramName, i);
                        }
                    }
                }
            }

            //提取方法中的 request 和 response 参数
            Class<?> [] paramsTypes = method.getParameterTypes();
            for (int i = 0; i < paramsTypes.length ; i ++) {
                Class<?> type = paramsTypes[i];

                if (type == HttpServletRequest.class || type == HttpServletResponse.class){
                    paramIndexMapping.put(type.getName(), i);
                }
            }
        }
    }
}
