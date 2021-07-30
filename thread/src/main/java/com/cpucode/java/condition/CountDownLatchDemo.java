package com.cpucode.java.condition;

import java.util.concurrent.CountDownLatch;

/**
 * @author : cpucode
 * @date : 2021/7/30
 * @time : 15:59
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class CountDownLatchDemo extends Thread{
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(3);

        new Thread(()-> {
            System.out.println("" + Thread.currentThread().getName() + "-执行中");
            countDownLatch.countDown();

            System.out.println(""+Thread.currentThread().getName()+"-执行完毕");
        },"t1").start();

        new Thread(()->{
            System.out.println(""+Thread.currentThread().getName()+"-执行中");
            countDownLatch.countDown();
            System.out.println(""+Thread.currentThread().getName()+"-执行完毕");
        },"t2").start();

        new Thread(()->{
            System.out.println(""+Thread.currentThread().getName()+"-执行中");
            countDownLatch.countDown();
            System.out.println(""+Thread.currentThread().getName()+"-执行完毕");
        },"t3").start();

        countDownLatch.await();
        System.out.println("所有线程执行完毕");
    }
}
