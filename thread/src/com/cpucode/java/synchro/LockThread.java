package com.cpucode.java.synchro;

/**
 * @author : cpucode
 * @date : 2021/2/9
 * @time : 12:44
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class LockThread {
    public static void main(String[] args) throws Exception{
        Thread[] ts = new Thread[]{new AddThread1(), new DesThread1(),
                                  new AddThread2(), new DesThread2()};

        for (Thread t : ts){
            t.start();
        }

        for (Thread t : ts){
            t.join();
        }

        System.out.println(DoubleCounter.Count1);
        System.out.println(DoubleCounter.Count2);
    }
}

class DoubleCounter{
    public static final Object LOCK = new Object();

    public static int Count1 = 0;
    public static int Count2 = 0;
}

class AddThread1 extends Thread{
    @Override
    public void run(){
        for (int i = 0; i < 1000; i++) {
            synchronized(DoubleCounter.LOCK){
                DoubleCounter.Count1 += 1;
            }
        }
    }
}

class DesThread1 extends Thread{
    @Override
    public void run(){
        for (int i = 0; i < 1000; i++) {
            synchronized(DoubleCounter.LOCK){
                DoubleCounter.Count1 -= 1;
            }
        }
    }
}

class AddThread2 extends Thread{
    @Override
    public void run(){
        for (int i = 0; i < 1000; i++) {
            synchronized(DoubleCounter.LOCK){
                DoubleCounter.Count2 += 1;
            }
        }
    }
}

class DesThread2 extends Thread{
    @Override
    public void run(){
        for (int i = 0; i < 1000; i++) {
            synchronized(DoubleCounter.LOCK){
                DoubleCounter.Count2 -= 1;
            }
        }
    }
}