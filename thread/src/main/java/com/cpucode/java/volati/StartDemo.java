package com.cpucode.java.volati;

/**
 * @author : cpucode
 * @date : 2021/7/28
 * @time : 10:45
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class StartDemo {
    static int x = 0;

    public static void main(String[] args) {
        Thread t1 = new Thread(()->{
            System.out.println(x);
        });

        x = 10;

        t1.start();
    }
}
