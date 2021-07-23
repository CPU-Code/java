package com.cpucode.java.thread;

public class Thread3 {
    public static void main(String[] args){
        //创建自定义类对象 线程任务对象
        MyRunnable mr = new MyRunnable();

        //创建线程对象
        Thread t = new Thread(mr, "小强");

        t.start();

        for(int i = 0; i < 3; i++){
            System.out.println("旺财" + i);
        }
    }

    static class MyRunnable implements Runnable{
        // 重写该接口
        @Override
        public void run() {
            for(int i = 0; i < 4; i++){
                System.out.println(Thread.currentThread().getName() + " " + i);
            }
        }
    }
}


