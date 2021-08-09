package com.cpucode.spring.formework.aop.aspect;

import java.lang.reflect.Method;

/**
 * @author : cpucode
 * @date : 2021/8/6
 * @time : 15:14
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public abstract class CPAbstractAspectJAdvice implements CPAdvice{
    private Method aspectMethod;
    private Object aspectTarget;

    public CPAbstractAspectJAdvice(Method aspectMethod, Object aspectTarget){
        this.aspectMethod = aspectMethod;
        this.aspectTarget = aspectTarget;
    }

    protected Object invokeAdviceMethod(CPJoinPoint joinPoint,
                                        Object returnValue,
                                        Throwable ex) throws Throwable{
        Class<?> [] paramsTypes = this.aspectMethod.getParameterTypes();

        if (null == paramsTypes || paramsTypes.length == 0){
            return this.aspectMethod.invoke(aspectTarget);
        } else {
            Object[] args = new Object[paramsTypes.length];

            //传参数
            for (int i = 0; i < paramsTypes.length; i++) {
                if(paramsTypes[i] == CPJoinPoint.class){
                    args[i] = joinPoint;
                }else if(paramsTypes[i] == Throwable.class){
                    args[i] = ex;
                }else if(paramsTypes[i] == Object.class){
                    args[i] = returnValue;
                }
            }

            return this.aspectMethod.invoke(aspectTarget, args);
        }
    }
}
