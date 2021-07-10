package com.cpucode.pattern.create.singleton.thread.local;

/**
 * ThreadLocal
 *   将所有的对象全部放在 ThreadLocalMap 中，为每个线程都提供一个对象，
 *   实际上是以空间换时间来实现线程间隔离的
 *
 *   保证线程内部的全局唯一，且天生线程安全
 *
 * @author : cpucode
 * @date : 2021/5/28
 * @time : 23:03
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class ThreadLocalSingletonTest {
    public static void main(String[] args) {
        int num = 5;
        for (int i = 0; i < num; i++) {
            System.out.println(ThreadLocalSingleton.getInstance());
        }

        Thread t1 = new Thread(new ExectorThread());
        Thread t2 = new Thread(new ExectorThread());
        t1.start();
        t2.start();
        System.out.println("End");

    }
}
