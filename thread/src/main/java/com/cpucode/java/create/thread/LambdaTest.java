package com.cpucode.java.create.thread;

/**
 * @author : cpucode
 * @date : 2021/2/3
 * @time : 22:54
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class LambdaTest {
    @SuppressWarnings("AlibabaAvoidManuallyCreateThread")
    public static void main(String[] args) {
        //lambda语法
        Thread t = new Thread(() -> {
            System.out.println("线程运行");
        });

        // 启动新线程
        t.start();
    }
}

/**
 * 线程运行
 * */