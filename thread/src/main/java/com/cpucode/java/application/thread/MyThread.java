package com.cpucode.java.application.thread;

/**
 * 继承 Thread 类创建线程
 *
 * @author : cpucode
 * @date : 2021/7/23
 * @time : 17:16
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class MyThread extends Thread{
    public static void main(String[] args) {
        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();

        myThread1.start();
        myThread2.start();
    }

    @Override
    public void run(){
        System.out.println("myThread.run()");
    }
}
