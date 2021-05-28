package com.cpucode.pattern.singleton.thread.local;

/**
 * ThreadLocal
 *   不能保证其创建的对象是全局唯一，但是能保证在单个线程中是唯一的，天生的线程安全
 *
 * @author : cpucode
 * @date : 2021/5/28
 * @time : 23:00
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class ThreadLocalSingleton {
    private ThreadLocalSingleton(){}

    private static final ThreadLocal<ThreadLocalSingleton> threadLocalInstance =
            new ThreadLocal<ThreadLocalSingleton>(){
                @Override
                protected ThreadLocalSingleton initialValue(){
                    return new ThreadLocalSingleton();
                }
            };

    public static ThreadLocalSingleton getInstance(){
        return threadLocalInstance.get();
    }
}
