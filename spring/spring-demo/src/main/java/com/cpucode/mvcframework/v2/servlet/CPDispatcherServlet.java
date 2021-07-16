package com.cpucode.mvcframework.v2.servlet;

import com.cpucode.mvcframework.annotation.*;

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
import java.util.*;

/**
 * @author : cpucode
 * @date : 2021/7/15
 * @time : 23:57
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class CPDispatcherServlet extends HttpServlet {
    /**
     * 保存application.properties配置文件中的内容
     */
    private Properties contextConfig = new Properties();

    /**
     * 保存扫描的所有的类名
     */
    private List<String> classNames = new ArrayList<String>();

    /**
     * IOC 容器 , 保存所有实例化对象, 注册式单例模式
     */
    private Map<String, Object> ioc = new HashMap<String, Object>();

    /**
     * 保存 url 和 Method 的对应关系 , Contrller中所有Mapping的对应关系
     */
    private Map<String, Method> handlerMapping = new HashMap<String, Method>();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //6、 调用， 运行阶段
        try {
            // 委派模式
            doDispatch(req, resp);
        } catch (Exception e) {
            e.printStackTrace();
            resp.getWriter().write("500 Exection,Detail : " + Arrays.toString(e.getStackTrace()));
        }
    }

    /**
     * 委派模式
     * @param req
     * @param resp
     */
    private void doDispatch(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        //绝对路径
        String url = req.getRequestURI();
        //处理成相对路径
        String contextPath = req.getContextPath();
        url = url.replaceAll(contextPath,"")
                .replaceAll("/+","/");

        if (!this.handlerMapping.containsKey(url)){
            resp.getWriter().write("404 Not Found!!");

            return;
        }

        Method method = this.handlerMapping.get(url);

        //从 reqest 中拿到 url 传过来的参数
        //第一个参数： 方法所在的实例
        //第二个参数： 调用时所需要的实参
        Map<String, String[]> params = req.getParameterMap();

        //获取方法的形参列表
        Class<?> [] parameterTypes = method.getParameterTypes();

        //保存请求的url参数列表
        Map<String,String[]> parameterMap = req.getParameterMap();

        //保存赋值参数的位置
        Object [] paramValues = new Object[parameterTypes.length];

        //按根据参数位置动态赋值
        for (int i = 0; i < parameterTypes.length; i ++) {
            Class parameterType = parameterTypes[i];

            //不能用 instanceof， parameterType 它不是实参， 而是形参
            if(parameterType == HttpServletRequest.class){
                paramValues[i] = req;
                continue;
            }else if (parameterType == HttpServletResponse.class){
                paramValues[i] = resp;
                continue;
            }else if (parameterType == String.class){
                CPRequestParam requestParam =
                        (CPRequestParam)parameterType.getAnnotation(CPRequestParam.class);

                if(parameterMap.containsKey(requestParam.value())) {
                    for (Map.Entry<String, String[]> entry : params.entrySet()) {
                        String value = Arrays.toString(entry.getValue())
                                .replaceAll("\\[|\\]","")
                                .replaceAll("\\s", ",");
                        paramValues[i] = value;
                    }
                }
            }
        }

        //通过反射拿到 method 所在 class， 拿到 class 之后还是拿到 class 的名称
        //再调用 toLowerFirstCase 获得 beanName
        String beanName = toLowerFirstCase(method.getDeclaringClass().getSimpleName());

        method.invoke(ioc.get(beanName), paramValues);

        //System.out.println(method);
    }

    /**
     * url 传过来的参数都是 String 类型的， HTTP 是基于字符串协议
     * 只需要把 String 转换为任意类型就好
     * @param type
     * @param value
     * @return
     */
    private Object convet(Class<?> type, String value){
        // 如果是 int
        if (Integer.class == type){
            return Integer.valueOf(value);
        }

        //如果还有 double 或者其他类型， 继续加 if
        //这时候， 我们应该想到策略模式了
        return value;
    }

    /**
     * 初始化阶段
     * @param config
     * @throws ServletException
     */
    @Override
    public void init(ServletConfig config) throws ServletException {
        //加载配置文件
        doLoadConfig(config.getInitParameter("contextConfigLocation"));
        //2、 扫描相关的类
        doScanner(contextConfig.getProperty("scanPackage"));
        //3、 初始化扫描到的类， 并且将它们放入到 ICO 容器之中
        doInstance();
        //4、 完成依赖注入
        doAutowired();
        //5、 初始化 HandlerMapping
        initHandlerMapping();

        System.out.println("CP Spring framework is init.");
    }

    /**
     * 加载配置文件
     * @param contextConfigLocation
     */
    private void doLoadConfig(String contextConfigLocation) {
        String replace = contextConfigLocation.replace("classpath:", "");
        //直接从类路径下找到 Spring 主配置文件所在的路径
        //并且将其读取出来放到 Properties 对象中
        //相对于 scanPackage=com.cpucode.demo 从文件中保存到了内存中
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
     * @param scanPackage
     */
    private void doScanner(String scanPackage) {
        // 包传过来包下面的所有的类全部扫描进来的
        URL url = this.getClass().getClassLoader().getResource("/" +
                scanPackage.replaceAll("\\.","/"));
        File classPath = new File(url.getFile());

        for (File file : classPath.listFiles()) {
            if(file.isDirectory()){
                doScanner(scanPackage + "." + file.getName());
            }else{
                if (!file.getName().endsWith(".class")){
                    continue;
                }

                String className = (scanPackage + "." + file.getName().replace(".class", ""));
                classNames.add(className);
            }
        }
    }

    /**
     * 工厂模式的具体实现 , 控制反转过程
     */
    private void doInstance() {
        //初始化， 为 DI 做准备
        if(classNames.isEmpty()){
            return;
        }

        try{
            for (String className : classNames){
                Class<?> clazz = Class.forName(className);

                //加了注解的类， 才初始化
                //@Controller 和 @Service
                if (clazz.isAnnotationPresent(CPController.class)){
                    Object instance = clazz.newInstance();
                    //Spring 默认类名首字母小写
                    String beanName = toLowerFirstCase(clazz.getSimpleName());
                    ioc.put(beanName, instance);
                }else if(clazz.isAnnotationPresent(CPService.class)){
                    //1、默认的类名首字母小写

                    //1、 自定义的 beanName
                    CPService service = clazz.getAnnotation(CPService.class);
                    String beanName = service.value();

                    //2、 默认类名首字母小写
                    if("".equals(beanName.trim())){
                        beanName = toLowerFirstCase(clazz.getSimpleName());
                    }

                    Object instance = clazz.newInstance();
                    ioc.put(beanName, instance);

                    //3、 根据类型自动赋值,投机取巧的方式
                    for (Class<?> i : clazz.getInterfaces()) {
                        if(ioc.containsKey(i.getName())){
                            throw new Exception("The “" + i.getName() + "” is exists!!");
                        }

                        //把接口的类型直接当成 key 了
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
     * 类名首字母小写
     * @param simpleName
     * @return
     */
    private String toLowerFirstCase(String simpleName) {
        char[] chars = simpleName.toCharArray();
        // 大小写字母的 ASCII 码相差 32
        chars[0] += 32;

        return String.valueOf(chars);
    }

    /**
     * 自动依赖注入
     */
    private void doAutowired() {
        if(ioc.isEmpty()){
            return;
        }

        for (Map.Entry<String, Object> entry : ioc.entrySet()) {
            //Declared 所有的， 特定的 字段， 包括 private/protected/default
            //正常来说， 普通的 OOP 编程只能拿到 public 的属性
            Field[] fields = entry.getValue().getClass().getDeclaredFields();

            for (Field field : fields) {
                if(!field.isAnnotationPresent(CPAutowired.class)){
                    continue;
                }

                CPAutowired autowired = field.getAnnotation(CPAutowired.class);

                // 没有自定义 beanName， 默认就根据类型注入
                String beanName = autowired.value().trim();

                if ("".equals(beanName)){
                    //获得接口的类型， 作为 key 待会拿这个 key 到 ioc 容器中去取值
                    beanName = field.getType().getName();
                }

                //如果是 public 以外的修饰符， 只要加了@Autowired 注解， 都要强制赋值
                //反射中叫做暴力访问， 强吻 , 设置私有属性的访问权限
                field.setAccessible(true);

                try {
                    //用反射机制， 动态给字段赋值 , 执行注入动作
                    field.set(entry.getValue(), ioc.get(beanName));
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                    continue ;
                }

            }
        }

    }

    /**
     * 策略模式
     *
     * 初始化 url 和 Method 的一对一对应关系
     */
    private void initHandlerMapping() {
        if(ioc.isEmpty()){
            return;
        }

        for (Map.Entry<String, Object> entry : ioc.entrySet()) {
            Class<?> clazz = entry.getValue().getClass();

            if(!clazz.isAnnotationPresent(CPController.class)){
                continue;
            }

            //保存写在类上面的@CPRequestMapping("/demo")
            String baseUrl = "";

            if(clazz.isAnnotationPresent(CPRequestMapping.class)){
                CPRequestMapping requestMapping = clazz.getAnnotation(CPRequestMapping.class);
                baseUrl = requestMapping.value();
            }

            //默认获取所有的 public 方法
            for (Method method : clazz.getMethods()) {
                //没有加RequestMapping注解的直接忽略
                if(!method.isAnnotationPresent(CPRequestMapping.class)){
                    continue;
                }

                //映射URL
                CPRequestMapping requestMapping = method.getAnnotation(CPRequestMapping.class);

                //优化  //demo///query
                String url = ("/" + baseUrl + "/" +
                        requestMapping.value()).replaceAll("/+","/");
                handlerMapping.put(url, method);

                System.out.println("Mapped :" + url + "," + method);
            }
        }
    }


}
