package com.cpucode.java.status.thread;

import java.util.concurrent.TimeUnit;

/**
 * @author : cpucode
 * @date : 2021/7/26
 * @time : 20:00
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class InterruptDemo3 {
    private static int i;

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            while(!Thread.currentThread().isInterrupted()){
                i++;
            }

            System.out.println("Num:" + i);
        }, "interruptDemo");

        thread.start();

        TimeUnit.SECONDS.sleep(1);
        thread.interrupt();

        System.out.println(thread.isInterrupted());
    }
}
