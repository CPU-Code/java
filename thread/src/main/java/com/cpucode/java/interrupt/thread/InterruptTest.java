package com.cpucode.java.interrupt.thread;

/**
 * @author : cpucode
 * @date : 2021/2/4
 * @time : 10:21
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class InterruptTest {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Mythread();

        t.start();

        // 暂停1毫秒
        Thread.sleep(1);
        // 中断t线程
        t.interrupt();
        // 等待t线程结束
        t.join();

        System.out.println("结束");
    }
}

class Mythread extends Thread{
    @Override
    public void run(){
        int n = 0;

        while(!isInterrupted()){
            n++;
            System.out.println(n + "CpuCode");
        }
    }
}

/**
 * 1CpuCode
 * 2CpuCode
 * 3CpuCode
 * 4CpuCode
 * 5CpuCode
 * 6CpuCode
 * 7CpuCode
 * 8CpuCode
 * 9CpuCode
 * 10CpuCode
 * 11CpuCode
 * 12CpuCode
 * 13CpuCode
 * 14CpuCode
 * 15CpuCode
 * 16CpuCode
 * 17CpuCode
 * 18CpuCode
 * 19CpuCode
 * 20CpuCode
 * 结束
 * */