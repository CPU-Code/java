package com.cpucode.java.create.thread;

/**
 * @author : cpucode
 * @date : 2021/2/3
 * @time : 22:50
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class RunnableTest {
    public static void main(String[] args) {
        //传入一个Runnable实例
        //noinspection AlibabaAvoidManuallyCreateThread
        Thread t = new Thread(new MyRunnable());

        // 启动新线程
        t.start();
    }
}

class MyRunnable implements Runnable{
    @Override
    public void run(){
        System.out.println("线程启动");
    }
}
/**
 * 线程启动
 * */