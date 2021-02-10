package com.cpucode.java.thread;

public class Thread1 {
    public static void main(String[] args) {
        //创建自定义线程对象
        MyThread mt = new MyThread("新线程");

        //开启新线程
        mt.start();

        //在主方法中执行for循环
        for(int i = 0; i < 3; i++){
            System.out.println("main 线程" + i);
        }
    }
}

/**
 * 自定义线程类
 * */
class MyThread extends Thread {
    /**
     * 定义指定线程名称的构造方法
     * */
    public MyThread(String name){
        //调用父类的String参数的构造方法，指定线程的名称
        super(name);
    }

    /**
     * 重写run方法，完成该线程执行的逻辑
     * */
    @Override
    public void run(){
        int num = 3;

        for(int i = 0; i < num; i++){
            System.out.println(getName() + ":正在运行" + i);
        }
    }
}

/*
main 线程0
main 线程1
main 线程2
新线程:正在运行0
新线程:正在运行1
新线程:正在运行2
*/