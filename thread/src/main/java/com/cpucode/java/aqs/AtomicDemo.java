package com.cpucode.java.aqs;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author : cpucode
 * @date : 2021/7/30
 * @time : 15:10
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class AtomicDemo {
    private static int count = 0;
    static Lock lock = new ReentrantLock();

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                AtomicDemo.inc();
            }).start();
        }

        Thread.sleep(2000);
        System.out.println("result: " + count);
    }

    public static void inc(){
        try {
            lock.lock();
            Thread.sleep(1);
            count++;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
}
