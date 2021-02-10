package com.cpucode.java.thread;

public class Thread2 {
    public static void main(String[] args){
        System.out.println("这是main线程");

        MyThread mt = new MyThread("小强");

        //开启了一个新的线程
        mt.start();

        for(int i = 0; i < 3; i++){
            System.out.println("旺财" + i);
        }
    }

    static class MyThread extends Thread {

        // 利用继承中的特点 , 将线程名称传递 进行设置
        public MyThread(String name){
            super(name);
        }

        // 重写run方法, 定义线程要执行的代码
        @Override
        public void run() {
            for(int i = 0; i < 3; i++){
                //getName()方法 来自父亲
                System.out.println(getName() + i);
            }
        }
    }
}



/*
这是main线程
旺财0
旺财1
旺财2
小强0
小强1
小强2
*/