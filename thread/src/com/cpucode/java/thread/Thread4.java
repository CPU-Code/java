package com.cpucode.java.thread;

public class Thread4 {
    public static void main(String[] args){

        /* new Runnable(){
            // 这个整体 相当于new MyRunnable()
             public void run(){
                 for (int i = 0; i < 3; i++) {
                     System.out.println("cpucode:"+i);
                     }
                 }
             };
         */

        Runnable r = new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 4; i++){
                    System.out.println("cpucode" + i);
                }
            }
        };

        new Thread(r).start();

        for(int i = 0; i < 3; i++){
            System.out.println("cpu" + i);
        }
    }
}

/*
cpucode0
cpu0
cpucode1
cpu1
cpucode2
cpu2
cpucode3
*/