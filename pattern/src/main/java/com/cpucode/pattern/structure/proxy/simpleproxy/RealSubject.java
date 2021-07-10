package com.cpucode.pattern.structure.proxy.simpleproxy;

/**
 * @author : cpucode
 * @date : 2021/5/30
 * @time : 17:49
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("real service is called.");
    }
}
