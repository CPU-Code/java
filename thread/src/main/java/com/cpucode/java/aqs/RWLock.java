package com.cpucode.java.aqs;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author : cpucode
 * @date : 2021/7/30
 * @time : 15:22
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class RWLock {
    static Map<Integer,Object> cacheMap = new HashMap<>();
    static ReentrantReadWriteLock rwl = new ReentrantReadWriteLock();
    static Lock read = rwl.readLock();
    static Lock write = rwl.writeLock();

    public static final Object get(Integer key) {
        System.out.println("开始读取数据");

        // 读锁
        read.lock();
        try {
            return cacheMap.get(key);
        }finally {
            read.unlock();
        }

    }

    public static final Object put(Integer key,Object value){
        System.out.println("开始写数据");

        write.lock();
        try{
            return cacheMap.put(key, value);
        }finally {
            write.unlock();
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 11; i++) {
            int finalI = i;

            new Thread(()->{
                put(finalI, finalI);
            }).start();

            new Thread(()->{
                get(finalI);
            }).start();
        }

        //读->读是可以共享
        //读->写 互斥
        //写->写 互斥
        //读多写少的场景
    }


}
