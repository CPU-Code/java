package com.cpucode.spring.formework.aop.intercept;

/**
 * @author : cpucode
 * @date : 2021/8/6
 * @time : 14:17
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public interface CPMethodInterceptor {
    Object invoke(CPMethodInvocation mi) throws Throwable;
}
