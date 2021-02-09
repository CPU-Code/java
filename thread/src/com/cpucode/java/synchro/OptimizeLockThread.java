package com.cpucode.java.synchro;

/**
 * @author : cpucode
 * @date : 2021/2/9
 * @time : 13:14
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class OptimizeLockThread {
    public static void main(String[] args) throws Exception{
        Thread[] ts = new Thread[]{new GoodAddThread1(), new GoodDesThread1(),
                new GoodAddThread2(), new GoodDesThread2()};

        for (Thread t : ts){
            t.start();
        }

        for (Thread t : ts){
            t.join();
        }

        System.out.println(GoodDoubleCounter.Count1);
        System.out.println(GoodDoubleCounter.Count2);
    }
}

class GoodDoubleCounter{
    public static final Object LOCK1 = new Object();
    public static final Object LOCK2 = new Object();

    public static int Count1 = 0;
    public static int Count2 = 0;
}

class GoodAddThread1 extends Thread{
    @Override
    public void run(){
        for (int i = 0; i < 1000; i++) {
            synchronized(GoodDoubleCounter.LOCK1){
                DoubleCounter.Count1 += 1;
            }
        }
    }
}

class GoodDesThread1 extends Thread{
    @Override
    public void run(){
        for (int i = 0; i < 1000; i++) {
            synchronized(GoodDoubleCounter.LOCK1){
                DoubleCounter.Count1 -= 1;
            }
        }
    }
}

class GoodAddThread2 extends Thread{
    @Override
    public void run(){
        for (int i = 0; i < 1000; i++) {
            synchronized(GoodDoubleCounter.LOCK2){
                DoubleCounter.Count2 += 1;
            }
        }
    }
}

class GoodDesThread2 extends Thread{
    @Override
    public void run(){
        for (int i = 0; i < 1000; i++) {
            synchronized(GoodDoubleCounter.LOCK2){
                DoubleCounter.Count2 -= 1;
            }
        }
    }
}