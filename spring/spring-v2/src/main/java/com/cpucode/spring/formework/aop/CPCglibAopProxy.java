package com.cpucode.spring.formework.aop;

import com.cpucode.spring.formework.aop.support.CPAdvisedSupport;

/**
 * @author : cpucode
 * @date : 2021/8/6
 * @time : 14:09
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class CPCglibAopProxy implements CPAopProxy{
    private CPAdvisedSupport config;

    public CPCglibAopProxy(CPAdvisedSupport config){
        this.config = config;
    }

    @Override
    public Object getProxy() {
        return null;
    }

    @Override
    public Object getProxy(ClassLoader classLoader) {
        return null;
    }
}
