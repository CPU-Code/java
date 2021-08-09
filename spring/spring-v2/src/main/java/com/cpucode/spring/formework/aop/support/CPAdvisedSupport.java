package com.cpucode.spring.formework.aop.support;

import com.cpucode.spring.formework.aop.config.CPAopConfig;
import com.cpucode.spring.formework.aop.aspect.CPAfterReturningAdvice;
import com.cpucode.spring.formework.aop.aspect.CPAfterThrowingAdvice;
import com.cpucode.spring.formework.aop.aspect.CPMethodBeforeAdvice;
import lombok.Data;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author : cpucode
 * @date : 2021/8/6
 * @time : 14:18
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
@Data
public class CPAdvisedSupport {
    private Class targetClass;
    private Object target;
    private Pattern pointCutClassPattern;

    private transient Map<Method, List<Object>> methodCache;
    private CPAopConfig config;

    public CPAdvisedSupport(CPAopConfig config){
        this.config = config;
    }

    public void setTargetClass(Class targetClass) {
        this.targetClass = targetClass;
        parse();
    }

    public List<Object> getInterceptorsAndDynamicInterceptionAdvice(Method method, Class<?>
            targetClass) throws Exception {
        List<Object> cached = methodCache.get(method);

        // 缓存未命中， 则进行下一步处理
        if (cached == null){
            Method m = targetClass.getMethod(method.getName(), method.getParameterTypes());
            cached = methodCache.get(m);

            // 存入缓存
            this.methodCache.put(m, cached);
        }

        return cached;
    }

    public boolean pointCutMatch(){
        return pointCutClassPattern.matcher(this.targetClass.toString()).matches();
    }

    private void parse(){
        //pointCut 表达式
        String pointCut = config.getPointCut()
                .replaceAll("\\.", "\\\\.")
                .replaceAll("\\\\.\\*", ".*")
                .replaceAll("\\(", "\\\\(")
                .replaceAll("\\)", "\\\\)");

        String pointCutForClass = pointCut.substring(0, pointCut.lastIndexOf("\\(") - 4);

        pointCutClassPattern = Pattern.compile("class" +
                pointCutForClass.substring(pointCutForClass.lastIndexOf(" ") + 1));

        methodCache = new HashMap<Method, List<Object>>();
        Pattern pattern = Pattern.compile(pointCut);

        try {
            // 获取目标类的所有方法
            Class aspectClass = Class.forName(config.getAspectClass());
            Map<String, Method> aspectMethods = new HashMap<String, Method>();
            for (Method m : aspectClass.getMethods()){
                aspectMethods.put(m.getName(), m);
            }

            //在这里得到的方法都是原生的方法
            for (Method m : targetClass.getMethods()){
                String methodString = m.toString();
                if(methodString.contains("throws")){
                    methodString =
                            methodString.substring(0, methodString.lastIndexOf("throws")).trim();
                }

                Matcher matcher = pattern.matcher(methodString);
                if(matcher.matches()){
                    //执行器链

                    //能满足切面规 则的类， 添加的 AOP 配置中
                    List<Object> advices = new LinkedList<Object>();

                    //前置通知
                    if(!(null == config.getAspectBefore() ||
                            "".equals(config.getAspectBefore().trim()))) {
                        //创建一个Advivce
                        advices.add(
                                new CPMethodBeforeAdvice(
                                        aspectMethods.get(config.getAspectBefore()),
                                        aspectClass.newInstance()));

                    }

                    //后置通知
                    if(!(null == config.getAspectAfter() ||
                            "".equals(config.getAspectAfter().trim()))) {
                        //创建一个Advivce
                        advices.add(new CPAfterReturningAdvice(
                                aspectMethods.get(config.getAspectAfter()),
                                aspectClass.newInstance()));
                    }

                    //异常通知
                    if(!(null == config.getAspectAfterThrow() ||
                            "".equals(config.getAspectAfterThrow().trim()))) {
                        //创建一个Advivce
                        CPAfterThrowingAdvice afterThrowingAdvice = new CPAfterThrowingAdvice(
                                aspectMethods.get(config.getAspectAfterThrow()),
                                aspectClass.newInstance());

                        afterThrowingAdvice.setThrowingName(config.getAspectAfterThrowingName());
                        advices.add(afterThrowingAdvice);
                    }

                    methodCache.put(m, advices);
                }
            }
        }catch (Exception e) {
            e.printStackTrace();
        }

    }
}
