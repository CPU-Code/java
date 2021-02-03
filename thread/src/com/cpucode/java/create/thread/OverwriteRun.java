package com.cpucode.java.create.thread;

/**
 * @author : cpucode
 * @date : 2021/2/3
 * @time : 22:41
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class OverwriteRun {
    public static void main(String[] args) {
        Thread t = new MyThread();
        t.start();
    }
}

class MyThread extends Thread{
    @Override
    public void run(){
        System.out.println("thread 开始运行");
    }
}

/**
 * thread 开始运行
 * */