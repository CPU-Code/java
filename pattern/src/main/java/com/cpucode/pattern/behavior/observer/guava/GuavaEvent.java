package com.cpucode.pattern.behavior.observer.guava;

import com.google.common.eventbus.Subscribe;

/**
 * @author : cpucode
 * @date : 2021/7/12
 * @time : 22:17
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class GuavaEvent {
    @Subscribe
    public void subscribe(String str){
        // 业务逻辑
        System.out.println("执行 subscribe 方法,传入的参数是:" + str);
    }
}
