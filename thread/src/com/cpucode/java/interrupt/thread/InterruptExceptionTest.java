package com.cpucode.java.interrupt.thread;

/**
 * @author : cpucode
 * @date : 2021/2/4
 * @time : 10:50
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class InterruptExceptionTest {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new CpuThread();
        t.start();

        Thread.sleep(100);
        // 中断t线程
        t.interrupt();

        // 等待t线程结束
        t.join();

        System.out.println("结束");
    }
}

class CpuThread extends Thread{
    @Override
    public void run(){
        Thread code = new CodeThread();

        // 启动 code 线程
        code.start();

        try{
            /**
             * 等待 code 线程结束
             * main线程调用interrupt() , join()方法会立刻抛出InterruptedException
             * */
            code.join();
        } catch (InterruptedException e){
            System.out.println("中断");
        }

        code.interrupt();
    }
}

class CodeThread extends Thread{
    @Override
    public void run(){
        int n = 0;

        while (!isInterrupted()){
            n++;

            System.out.println(n + "CodeThread");

            try{
                Thread.sleep(100);
            } catch (InterruptedException e){
                break;
            }
        }
    }
}