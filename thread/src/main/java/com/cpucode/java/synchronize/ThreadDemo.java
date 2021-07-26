package com.cpucode.java.synchronize;

/**
 * 多线程安全问题
 *
 * @author : cpucode
 * @date : 2021/7/26
 * @time : 21:50
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class ThreadDemo {
    private static int count = 0;

    public static void inc(){
        try{
            Thread.sleep(1);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        count++;
    }

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 1000; i++){
            new Thread(() ->{
                ThreadDemo.inc();
            }).start();
        }

        Thread.sleep(3000);

        System.out.println("运行结果" + count);
    }
}
