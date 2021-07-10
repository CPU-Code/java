package com.cpucode.pattern.create.singleton.thread.local;

/**
 * @author : cpucode
 * @date : 2021/5/28
 * @time : 23:04
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class ExectorThread implements Runnable{
    @Override
    public void run() {
        ThreadLocalSingleton singleton = ThreadLocalSingleton.getInstance();

        System.out.println(Thread.currentThread().getName() + ":" + singleton);
    }
}
