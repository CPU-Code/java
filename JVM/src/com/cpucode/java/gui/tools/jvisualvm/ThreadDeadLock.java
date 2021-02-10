package com.cpucode.java.gui.tools.jvisualvm;

/**
 * 演示线程的死锁问题
 *
 * @author : cpucode
 * @date : 2021/2/10
 * @time : 11:01
 * @github : https://githfub.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
@SuppressWarnings("AlibabaAvoidManuallyCreateThread")
public class ThreadDeadLock {
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();

        new Thread(){
            @Override
            public void run(){
                synchronized(s1){
                    s1.append("c");
                    s2.append("p");

                    try{
                        Thread.sleep(100);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }

                    synchronized (s2){
                        s1.append("u");
                        s2.append("c");

                        System.out.println(s1);
                        System.out.println(s2);
                    }
                }
            }
        }.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (s2){
                    s1.append("o");
                    s2.append("d");

                    try{
                        Thread.sleep(100);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }

                    synchronized (s1){
                        s1.append("e");
                        s2.append("a");

                        System.out.println(s1);
                        System.out.println(s2);
                    }
                }
            }
        }).start();

    }
}
