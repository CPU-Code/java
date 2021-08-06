package com.cpucode.spring.formework.beans.support;

import com.cpucode.spring.formework.beans.config.CPBeanDefinition;
import com.cpucode.spring.formework.context.support.CPAbstractApplicationContext;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author : cpucode
 * @date : 2021/8/2
 * @time : 16:42
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class CPDefaultListableBeanFactory extends CPAbstractApplicationContext {

    /**
     * 存储注册信息的 BeanDefinition
     */
    protected final Map<String, CPBeanDefinition> beanDefinitionMap = new ConcurrentHashMap<String, CPBeanDefinition>();

}
