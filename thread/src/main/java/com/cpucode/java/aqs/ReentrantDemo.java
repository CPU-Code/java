package com.cpucode.java.aqs;

/**
 * 重入锁的设计目的是避免线程的死锁
 *
 * @author : cpucode
 * @date : 2021/7/30
 * @time : 15:05
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class ReentrantDemo {
    public static void main(String[] args) {
        ReentrantDemo rd = new ReentrantDemo();
        new Thread(rd::demo).start();
    }

    public synchronized void demo(){
        System.out.println("begin:demo");
        demo2();
    }

    public void demo2(){
        synchronized (this){
            System.out.println("begin:demo2");
        }
    }
}
