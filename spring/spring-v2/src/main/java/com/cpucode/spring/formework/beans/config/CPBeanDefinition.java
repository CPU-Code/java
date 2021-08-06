package com.cpucode.spring.formework.beans.config;

import lombok.Data;

/**
 * 用来存储配置文件中的信息 , 相当于保存在内存中的配置
 *
 * @author : cpucode
 * @date : 2021/8/2
 * @time : 13:44
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
@Data
public class CPBeanDefinition {
    private String beanClassName;
    private boolean lazyInit = false;
    private String factoryBeanName;
}
