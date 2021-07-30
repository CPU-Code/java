package com.cpucode.java.condition;

import java.util.concurrent.CountDownLatch;

/**
 * @author : cpucode
 * @date : 2021/7/30
 * @time : 16:14
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class CountDownLatchDemo2 extends Thread{
    static CountDownLatch countDownLatch = new CountDownLatch(1);

    public static void main(String[] args) {
        for(int i = 0; i < 10; i++){
            new CountDownLatchDemo2().start();
        }

        countDownLatch.countDown();
    }

    @Override
    public void run() {
        try {
            countDownLatch.await();
            //TODO
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("ThreadName:" + Thread.currentThread().getName());
    }
}
