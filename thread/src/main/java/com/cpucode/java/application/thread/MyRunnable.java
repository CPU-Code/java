package com.cpucode.java.application.thread;

/**
 * @author : cpucode
 * @date : 2021/7/23
 * @time : 17:19
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class MyRunnable{
    public static void main(String[] args) {
        Thread thread = new Thread(new RunnableTest());
        Thread thread2 = new Thread(new RunnableTest());

        thread.start();
        thread2.start();
    }


}

class RunnableTest implements Runnable{
    @Override
    public void run() {
        System.out.println("MyRunnable.run()");
    }
}

