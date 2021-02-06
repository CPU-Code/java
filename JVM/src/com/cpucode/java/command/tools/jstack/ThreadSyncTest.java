package com.cpucode.java.command.tools.jstack;

/**
 * 演示线程的同步
 *
 * @author : cpucode
 * @date : 2021/2/6
 * @time : 14:36
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class ThreadSyncTest {
    public static void main(String[] args) {
        Number number = new Number();
        Thread t1 = new Thread(number);
        Thread t2 = new Thread(number);

        t1.setName("线程1");
        t2.setName("线程2");

        t1.start();
        t2.start();
    }
}

class Number implements Runnable{
    private int number = 1;

    @Override
    public void run(){
        while (true){
            synchronized (this){
                if (number <= 100){
                    try{
                        Thread.sleep(500);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread().getName() + ":" + number);
                    number++;
                }else {
                    break;
                }
            }
        }
    }
}