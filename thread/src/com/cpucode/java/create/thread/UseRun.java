package com.cpucode.java.create.thread;

/**
 * @author : cpucode
 * @date : 2021/2/3
 * @time : 23:20
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class UseRun {
    public static void main(String[] args) {
        Thread t = new MyThread();

        t.run();
    }
}

/**
 * thread 开始运行
 * */