package com.cpucode.pattern.singleton.lazy.simple;

/**
 * @author : cpucode
 * @date : 2021/5/28
 * @time : 11:23
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class ExectorThread implements Runnable{
    @Override
    public void run() {
        LazySimpleSingleton singleton = LazySimpleSingleton.getInstance();

        System.out.println(Thread.currentThread().getName() + " : " + singleton);
    }
}
