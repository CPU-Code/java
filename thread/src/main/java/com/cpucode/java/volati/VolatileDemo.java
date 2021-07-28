package com.cpucode.java.volati;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

/**
 * @author : cpucode
 * @date : 2021/7/28
 * @time : 10:26
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class VolatileDemo {
    //public volatile static boolean stop = false;
    public static boolean stop = false;

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            int i = 0;

            while(!stop){
                i++;
            }
        });

        thread.start();

        System.out.println("begin start thread");

        Thread.sleep(1000);
        stop = true;
    }
}
