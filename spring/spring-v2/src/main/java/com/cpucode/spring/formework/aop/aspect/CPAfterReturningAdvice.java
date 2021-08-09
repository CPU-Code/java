package com.cpucode.spring.formework.aop.aspect;

import com.cpucode.spring.formework.aop.intercept.CPMethodInterceptor;
import com.cpucode.spring.formework.aop.intercept.CPMethodInvocation;

import java.lang.reflect.Method;

/**
 * @author : cpucode
 * @date : 2021/8/6
 * @time : 15:24
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class CPAfterReturningAdvice extends CPAbstractAspectJAdvice
        implements CPAdvice, CPMethodInterceptor {
    private CPJoinPoint joinPoint;

    public CPAfterReturningAdvice(Method aspectMethod, Object target) {
        super(aspectMethod, target);
    }

    @Override
    public Object invoke(CPMethodInvocation mi) throws Throwable {
        Object retVal = mi.proceed();
        this.joinPoint = mi;
        this.afterReturning(retVal, mi.getMethod(),
                mi.getArguments(), mi.getThis());

        return retVal;
    }

    public void afterReturning(Object returnValue, Method method, Object[] args,Object target)
            throws Throwable{
        invokeAdviceMethod(joinPoint, returnValue,null);
    }
}
