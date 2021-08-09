package com.cpucode.spring.formework.aop.aspect;

import com.cpucode.spring.formework.aop.intercept.CPMethodInterceptor;
import com.cpucode.spring.formework.aop.intercept.CPMethodInvocation;

import java.lang.reflect.Method;

/**
 * @author : cpucode
 * @date : 2021/8/6
 * @time : 15:53
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class CPAfterThrowingAdvice extends CPAbstractAspectJAdvice implements
        CPAdvice, CPMethodInterceptor {
    private String throwingName;

    public CPAfterThrowingAdvice(Method aspectMethod, Object target) {
        super(aspectMethod, target);
    }

    public void setThrowingName(String name) {
        this.throwingName = name;
    }

    @Override
    public Object invoke(CPMethodInvocation mi) throws Throwable {
        try{
            return mi.proceed();
        }catch (Throwable ex) {
            invokeAdviceMethod(mi,null, ex.getCause());
            throw ex;
        }
    }
}
