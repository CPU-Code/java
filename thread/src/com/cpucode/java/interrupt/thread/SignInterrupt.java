package com.cpucode.java.interrupt.thread;

/**
 * @author : cpucode
 * @date : 2021/2/4
 * @time : 11:04
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class SignInterrupt {
    public static void main(String[] args) throws InterruptedException {
        SignThread t = new SignThread();
        t.start();
        Thread.sleep(1);

        // 标志位置为false
        t.running = false;
    }
}

class SignThread extends Thread{
    //线程间共享的变量
    public volatile boolean running = true;

    @Override
    public void run(){
        int n = 0;
        while (running){
            n++;
            System.out.println(n + "哈哈");
        }

        System.out.println("end");
    }
}

/**
 * 1哈哈
 * 2哈哈
 * 3哈哈
 * 4哈哈
 * 5哈哈
 * 6哈哈
 * 7哈哈
 * 8哈哈
 * 9哈哈
 * 10哈哈
 * end
 * */