package com.cpucode.java.synchronize;

/**
 * @author : cpucode
 * @date : 2021/7/26
 * @time : 21:56
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class SynchronizeDemo {
    private static int count = 0;

    public static void inc(){
        synchronized (SynchronizeDemo.class){
            try{
                Thread.sleep(1);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            count++;
        }
    }
    public static void main(String[] args) throws InterruptedException {
        for(int i = 0; i < 1000; i++){
            new Thread(()->{
                SynchronizeDemo.inc();
            }).start();
        }

        Thread.sleep(3000);
        System.out.println("运行结果" + count);
    }
}
