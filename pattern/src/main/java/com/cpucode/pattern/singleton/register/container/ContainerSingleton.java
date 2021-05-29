package com.cpucode.pattern.singleton.register.container;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 容器缓存
 *   容器式写法适用于创建实例非常多的情况，便于管理。但是，是非线程安全的
 *
 * 将每一个实例都缓存到统一的容器中，使用唯一标识获取实例
 *
 * Spring中的做法，就是用这种注册式单例
 *
 * @author : cpucode
 * @date : 2021/5/28
 * @time : 13:14
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class ContainerSingleton {
    private ContainerSingleton(){}

    private static Map<String, Object> ioc = new ConcurrentHashMap<String, Object>();

    public static Object getInstance(String className){
        synchronized(ioc){
            if (!ioc.containsKey(className)){
                Object obj = null;

                try{
                    obj = Class.forName(className).newInstance();
                    ioc.put(className, obj);
                }catch(Exception e){
                    e.printStackTrace();
                }

                return obj;
            } else {
                return ioc.get(className);
            }
        }
    }
}
