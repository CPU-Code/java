package com.cpucode.java.thread.state;

/**
 * @author : cpucode
 * @date : 2021/2/4
 * @time : 10:14
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class ThreadJoin {
    @SuppressWarnings("AlibabaAvoidManuallyCreateThread")
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
            System.out.println("cpuCode");
        });

        System.out.println("开始");

        //启动t线程
        t.start();

        //等待t线程结束后再继续运行
        t.join();

        System.out.println("结束");
    }
}

/**
 * 开始
 * cpuCode
 * 结束
 * */