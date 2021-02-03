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
        //从Thread派生一个自定义类
        Thread t = new MyThread();

        //start()方法会在内部自动调用实例的run()方法
        t.start();
    }
}

class MyThread extends Thread{

    /**
     * 覆写run()方法
     * */
    @Override
    public void run(){
        System.out.println("thread 开始运行");
    }
}

/**
 * thread 开始运行
 * */