package com.cpucode.java.volati;

/**
 * @author : cpucode
 * @date : 2021/7/28
 * @time : 10:50
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class SyncDemo {
    static int x = 0;

    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            synchronized (SyncDemo.class) { // 此处自动加锁
                // x 是共享变量, 初始值 =10
                if (x < 12) {
                    x = 12;
                    System.out.println("thread : " + x);
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            synchronized (SyncDemo.class) { // 此处自动加锁
                // x 是共享变量, 初始值 =10
                if (x < 12) {
                    x = 12;

                    System.out.println("thread2 : " + x);
                }
            }
        });

        thread.start();
        thread2.start();
    }
}
