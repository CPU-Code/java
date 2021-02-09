package com.cpucode.java.guard.thread;

/**
 * @author : cpucode
 * @date : 2021/2/9
 * @time : 11:49
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class DaemonTest {
    public static void main(String[] args) {
        Thread t = new TimeThread();

        //在调用start()方法前, 把该线程标记为守护线程
        t.setDaemon(true);
        t.start();

        System.out.println("main 过去");

        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){

        }

        System.out.println("main结束");
    }
}

class TimeThread extends Thread{

    @Override
    public void run(){
        while (true){
            System.out.println("TimeThread运行.........");

            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }

    }
}

/**
 * main 过去
 * TimeThread运行.........
 * TimeThread运行.........
 * TimeThread运行.........
 * main结束
 * */