package com.cpucode.java.create.thread;

/**
 * @author : cpucode
 * @date : 2021/2/3
 * @time : 23:10
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class ThreadSleep {
    @SuppressWarnings("AlibabaAvoidManuallyCreateThread")
    public static void main(String[] args) {
        System.out.println("main 开始");

        Thread t = new Thread(){
            @Override
            public void run(){
                System.out.println("thread 开始");
                try{
                    //当前线程暂停
                    Thread.sleep(10);
                }catch (InterruptedException e){

                }

                System.out.println("thrad 结束");
            }

        };

        t.start();

        try{
            //当前线程暂停
            Thread.sleep(20);
        } catch (InterruptedException e){

        }

        System.out.println("main 结束");
    }
}

/**
 * main 开始
 * thread 开始
 * thrad 结束
 * main 结束
 * */