package com.cpucode.java.synchro;

/**
 * @author : cpucode
 * @date : 2021/2/9
 * @time : 12:37
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class ErrorLockThread {
    public static void main(String[] args) throws InterruptedException {
        Thread add = new LockAddThread();
        Thread dec = new LockDecThread();

        add.start();
        dec.start();

        add.join();
        dec.join();

        System.out.println(LockCount.count);
    }
}

class LockCount{
    public static final Object lock1 = new Object();
    public static final Object lock2 = new Object();
    public static int count = 0;
}

class LockAddThread extends Thread{
    @Override
    public void run(){
        for (int i = 0; i <1000; i++) {
            synchronized(LockCount.lock1){
                LockCount.count += 1;
            }
        }

    }
}

class LockDecThread extends Thread{
    @Override
    public void run(){
        for (int i = 0; i <1000; i++){
            synchronized(LockCount.lock2){
                LockCount.count -= 1;
            }
        }

    }
}