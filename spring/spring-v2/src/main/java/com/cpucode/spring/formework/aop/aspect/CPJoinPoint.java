package com.cpucode.spring.formework.aop.aspect;

import java.lang.reflect.Method;

/**
 * @author : cpucode
 * @date : 2021/8/6
 * @time : 14:16
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public interface CPJoinPoint {
    Method getMethod();
    Object[] getArguments();
    Object getThis();
    void setUserAttribute(String key, Object value);
    Object getUserAttribute(String key);
}
