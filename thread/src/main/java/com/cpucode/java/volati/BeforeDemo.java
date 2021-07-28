package com.cpucode.java.volati;

/**
 * @author : cpucode
 * @date : 2021/7/28
 * @time : 10:38
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class BeforeDemo {
    static int a = 0;
    static volatile boolean flag = false;

    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(() -> {
            a = 1;
            flag = true;
        }, "writer");

        Thread thread2 = new Thread(() -> {
            if (flag){
                int x = a;

                System.out.println(x);
            }
        }, "reader");

        thread.start();
        Thread.sleep(500);
        thread2.start();
    }
}
