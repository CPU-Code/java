package com.cpucode.spring.formework.core;

/**
 * 单例工厂的顶层设计
 *
 * @author : cpucode
 * @date : 2021/8/2
 * @time : 13:42
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public interface CPBeanFactory {
    /**
     * 根据 beanName 从 IOC 容器中获得一个实例 Bean
     * @param beanName
     * @return
     * @throws Exception
     */
    Object getBean(String beanName) throws Exception;

    public Object getBean(Class<?> beanClass) throws Exception;
}
