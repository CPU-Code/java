package com.cpucode.java.status.thread;

import java.util.concurrent.TimeUnit;

/**
 * Thread.interrupted 把线程的标识又进行了复位
 *
 * @author : cpucode
 * @date : 2021/7/26
 * @time : 19:40
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class InterruptDemo2 {
    private static int i;

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            while (true){
                if(Thread.currentThread().isInterrupted()){
                    System.out.println("before:" + Thread.currentThread().isInterrupted());

                    //对线程进行复位，由 true 变成 false
                    Thread.interrupted();

                    System.out.println("after:" + Thread.currentThread().isInterrupted());
                }
            }
        }, "interruptDemo");

        thread.start();

        TimeUnit.SECONDS.sleep(1);

        thread.interrupt();
    }
}
