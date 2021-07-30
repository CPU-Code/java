package com.cpucode.java.condition;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author : cpucode
 * @date : 2021/7/30
 * @time : 15:51
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class ConditionDemo {
    public static void main(String[] args) {
        //重入锁
        Lock lock = new ReentrantLock();
        Condition condition = lock.newCondition();

        lock.newCondition();
        lock.newCondition();
        lock.newCondition();
        lock.newCondition();

        //step 2
        // 阻塞await
        new Thread(new ConditionWaitDemo(lock, condition)).start();

        //step 1
        //(condtion为空)
        new Thread(new ConditionSignalDemo(lock, condition)).start();
    }
}
