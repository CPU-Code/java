package com.cpucode.java.status.thread;

import java.util.concurrent.TimeUnit;

/**
 * @author : cpucode
 * @date : 2021/7/26
 * @time : 19:35
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class InterruptDemo {
    private static int i;

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            while (!Thread.currentThread().isInterrupted()){
                //默认情况下 isInterrupted 返回 false、通过 thread.interrupt 变成了 true
                i++;
            }

            System.out.println("num : " + i);
        }, "interruptDemo");

        thread.start();

        TimeUnit.SECONDS.sleep(1);

        //加和不加的效果
        thread.interrupt();
    }
}
