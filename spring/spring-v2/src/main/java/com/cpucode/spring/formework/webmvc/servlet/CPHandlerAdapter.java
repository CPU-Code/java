package com.cpucode.spring.formework.webmvc.servlet;

import com.cpucode.spring.formework.annotation.CPRequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author : cpucode
 * @date : 2021/8/4
 * @time : 14:14
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class CPHandlerAdapter {
    public boolean supports(Object handler){
        return (handler instanceof CPHandlerMapping);
    }

    public CPModelAndView handle(HttpServletRequest req, HttpServletResponse resp, Object handler)
            throws Exception{
        CPHandlerMapping handlerMapping =(CPHandlerMapping) handler;

        // 每一个方法有一个参数列表， 那么这里保存的是形参列表
        Map<String, Integer> paramMapping = new HashMap<String, Integer>();

        // 这里只是出来了命名参数
        Annotation[][] pa = handlerMapping.getMethod().getParameterAnnotations();

        for (int i = 0; i < pa.length; i++) {
            for (Annotation a: pa[i]){
                if(a instanceof CPRequestParam){
                    String paramName = ((CPRequestParam) a).value();

                    if(!"".equals(paramName.trim())){
                        paramMapping.put(paramName, i);
                    }
                }
            }
        }

        /**
         * 根据用户请求的参数信息， 跟 method 中的参数信息进行动态匹配
         * resp 传进来的目的只有一个： 只是为了将其赋值给方法参数， 仅此而已
         * 当用户传过来的 ModelAndView 为空的时候， 才会 new 一个默认的
         * 准备好这个方法的形参列表
         *      方法重载： 形参的决定因素： 参数的个数、 参数的类型、 参数顺序、 方法的名字
         *  只处理 Request 和 Response
         */
        Class<?>[] paramTypes = handlerMapping.getMethod().getParameterTypes();
        for (int i = 0;i < paramTypes.length; i ++) {
            Class<?> type = paramTypes[i];
            if(type == HttpServletRequest.class ||
                    type == HttpServletResponse.class){
                paramMapping.put(type.getName(), i);
            }
        }

        /**
         * 拿到自定义命名参数所在的位置
         * 用户通过 URL 传过来的参数列表
         */
        Map<String, String[]> reqParameterMap = req.getParameterMap();
        // 构造实参列表
        Object [] paramValues = new Object[paramTypes.length];

        for (Map.Entry<String, String[]> param : reqParameterMap.entrySet()) {
            // [ ]  \\s 匹配任何不可见字符，包括空格、制表符、换页符等
            String value =
                    Arrays.toString(param.getValue()).replaceAll("\\[|\\]","")
                            .replaceAll("\\s","");

            // 匹配参数, 不一致就跳过
            if(!paramMapping.containsKey(param.getKey())){
                continue;
            }

            int index = paramMapping.get(param.getKey());

            //因为页面上传过来的值都是 String 类型的， 而在方法中定义的类型是千变万化的
            // 要针对我们传过来的参数进行类型转换
            paramValues[index] = caseStringValue(value, paramTypes[index]);
        }

        if(paramMapping.containsKey(HttpServletRequest.class.getName())) {
            int reqIndex = paramMapping.get(HttpServletRequest.class.getName());

            paramValues[reqIndex] = req;
        }

        if(paramMapping.containsKey(HttpServletResponse.class.getName())) {
            int respIndex = paramMapping.get(HttpServletResponse.class.getName());

            paramValues[respIndex] = resp;
        }

        //4、 从 handler 中取出 controller、 method， 然后利用反射机制进行调用
        Object result =
                handlerMapping.getMethod().invoke(handlerMapping.getController(), paramValues);
        if(result == null){
            return null;
        }

        // 判断方法是不是 CPModelAndView
        boolean isModelAndView = handlerMapping.getMethod().getReturnType() ==
                CPModelAndView.class;
        if(isModelAndView){
            return (CPModelAndView)result;
        }else{
            return null;
        }
    }

    private Object caseStringValue(String value, Class<?> clazz){
        if (clazz == String.class){
            return value;
        } else if (clazz == Integer.class){
            return Integer.valueOf(value);
        } else if (clazz == int.class){
            return Integer.valueOf(value).intValue();
        }

        return null;
    }
}
