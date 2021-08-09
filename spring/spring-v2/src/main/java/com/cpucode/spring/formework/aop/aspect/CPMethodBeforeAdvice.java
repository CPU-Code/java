package com.cpucode.spring.formework.aop.aspect;

import com.cpucode.spring.formework.aop.intercept.CPMethodInterceptor;
import com.cpucode.spring.formework.aop.intercept.CPMethodInvocation;

import java.lang.reflect.Method;

/**
 * @author : cpucode
 * @date : 2021/8/6
 * @time : 15:20
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class CPMethodBeforeAdvice extends CPAbstractAspectJAdvice implements CPAdvice, CPMethodInterceptor {
    private CPJoinPoint joinPoint;

    public CPMethodBeforeAdvice(Method aspectMethod, Object target) {
        super(aspectMethod, target);
    }

    public void before(Method method, Object[] args, Object target) throws Throwable {
        //传送了给织入参数
        invokeAdviceMethod(this.joinPoint,null,null);
    }

    @Override
    public Object invoke(CPMethodInvocation mi) throws Throwable {
        //从被织入的代码中才能拿到，JoinPoint
        this.joinPoint = mi;
        this.before(mi.getMethod(), mi.getArguments(), mi.getThis());

        return mi.proceed();
    }
}
