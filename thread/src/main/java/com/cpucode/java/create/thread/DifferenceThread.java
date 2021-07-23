package com.cpucode.java.create.thread;

/**
 * @author : cpucode
 * @date : 2021/2/3
 * @time : 23:03
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
@SuppressWarnings("AlibabaAvoidManuallyCreateThread")
public class DifferenceThread {
    public static void main(String[] args) {
        //先打印
        System.out.println("main 开始");

        /********** 以下无法判断先执行 **********/

        //创建Thread对象
        Thread t = new Thread(){

            @Override
            public void run(){
                System.out.println("线程 开始");

                System.out.println("线程 结束");
            }
        };

        //启动新线程
        t.start();

        System.out.println("main 结束");
    }
}

/**
 * main 开始
 * main 结束
 * 线程 开始
 * 线程 结束
 * */