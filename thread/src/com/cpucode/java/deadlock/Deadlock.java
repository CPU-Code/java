package com.cpucode.java.deadlock;

/**
 * @author : cpucode
 * @date : 2021/2/9
 * @time : 14:04
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class Deadlock {
    static final Object LOCK_A = new Object();
    static final Object LOCK_B = new Object();

    public static void main(String[] args) {
        new Thread1().start();
        new Thread2().start();
    }

    static void sleep1s(){
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

class Thread1 extends Thread{
    @Override
    public void run(){
        System.out.println("Thread1 开始");

        synchronized(Deadlock.LOCK_A){
            System.out.println("Thread1 锁a 获得");

            Deadlock.sleep1s();

            synchronized(Deadlock.LOCK_B){
                System.out.println("Thread1 锁b 获得");

                Deadlock.sleep1s();

            }

            System.out.println("Thread1 锁b 弃");
        }

        System.out.println("Thread1 锁a 弃");
    }
}

class Thread2 extends Thread{
    @Override
    public void run(){
        System.out.println("Thread2 开始");

        synchronized(Deadlock.LOCK_B){
            System.out.println("Thread2 锁B 获得");

            Deadlock.sleep1s();

            synchronized(Deadlock.LOCK_A){
                System.out.println("Thread2 锁A 获得");

                Deadlock.sleep1s();

            }

            System.out.println("Thread2 锁A 弃");
        }

        System.out.println("Thread2 锁B 弃");

    }
}