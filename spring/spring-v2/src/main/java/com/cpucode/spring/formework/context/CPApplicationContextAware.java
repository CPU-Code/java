package com.cpucode.spring.formework.context;

/**
 * 通过解耦方式获得 IOC 容器的顶层设计
 * 后面将通过一个监听器去扫描所有的类， 只要实现了此接口，
 * 将自动调用 setApplicationContext()方法， 从而将 IOC 容器注入到目标类中
 *
 * @author : cpucode
 * @date : 2021/8/2
 * @time : 17:11
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public interface CPApplicationContextAware {
    void setApplicationContext(CPApplicationContext applicationContext);
}
