package com.cpucode.java.condition;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/**
 * @author : cpucode
 * @date : 2021/7/30
 * @time : 15:40
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class ConditionWaitDemo implements Runnable{
    private Lock lock;
    private Condition condition;

    public ConditionWaitDemo(Lock lock, Condition condition){
        this.lock = lock;
        this.condition = condition;
    }

    @Override
    public void run(){
        System.out.println("begin - ConditionDemoWait");
        //竞争锁
        lock.lock();
        try {
            //阻塞(1. 释放锁, 2.阻塞当前线程, FIFO（单向、双向）)
            condition.await();

            System.out.println("end - ConditionDemoWait");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            //释放锁
            lock.unlock();
        }
    }
}
