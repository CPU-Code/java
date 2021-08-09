package com.cpucode.spring.formework.aop;

import com.cpucode.spring.formework.aop.intercept.CPMethodInvocation;
import com.cpucode.spring.formework.aop.support.CPAdvisedSupport;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;

/**
 * @author : cpucode
 * @date : 2021/8/6
 * @time : 14:10
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class CPJdkDynamicAopProxy implements CPAopProxy, InvocationHandler {
    private CPAdvisedSupport config;

    public CPJdkDynamicAopProxy(CPAdvisedSupport config){
        this.config = config;
    }

    /**
     * 把原生的对象传进来
     * @return
     */
    @Override
    public Object getProxy() {
        return getProxy(this.config.getTargetClass().getClassLoader());
    }

    @Override
    public Object getProxy(ClassLoader classLoader) {
        return Proxy.newProxyInstance(classLoader,
                this.config.getTargetClass().getInterfaces(),
                this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        List<Object> interceptorsAndDynamicMethodMatcher =
                config.getInterceptorsAndDynamicInterceptionAdvice(method, this.config.getTargetClass());

        CPMethodInvocation invocation =
                new CPMethodInvocation(proxy,
                        this.config.getTarget(),
                        method, args,
                        this.config.getTargetClass(),
                        interceptorsAndDynamicMethodMatcher);

        return invocation.proceed();
    }
}
