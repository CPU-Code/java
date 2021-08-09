package com.cpucode.spring.formework.aop;

/**
 * 默认就用 JDK 动态代理
 *
 * @author : cpucode
 * @date : 2021/8/6
 * @time : 14:09
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public interface CPAopProxy {
    Object getProxy();

    Object getProxy(ClassLoader classLoader);
}
