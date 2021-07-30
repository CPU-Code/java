package com.cpucode.java.condition;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/**
 * @author : cpucode
 * @date : 2021/7/30
 * @time : 15:46
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class ConditionSignalDemo implements Runnable{

    private Lock lock;
    private Condition condition;

    public ConditionSignalDemo(Lock lock, Condition condition) {
        this.lock = lock;
        this.condition = condition;
    }

    @Override
    public void run() {
        //获得了锁
        lock.lock();
        try{
            System.out.println("begin - conditionNotify");
            //唤醒阻塞状态的线程
            condition.signal();
            // condition.await();
            System.out.println("end - conditionNotify");
        } finally {
            //释放锁
            lock.unlock();
        }
    }
}
