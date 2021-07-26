package com.cpucode.java.status.thread;

import java.util.concurrent.TimeUnit;

/**
 * 线程的状态
 *
 * @author : cpucode
 * @date : 2021/7/23
 * @time : 23:30
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class ThreadStatusDemo {
    public static void main(String[] args) {
        //TIME_WAITING
        new Thread(() ->{
            while(true){
                try{
                    TimeUnit.SECONDS.sleep(100);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }, "time_waiting").start();

        //WAITING，线程在 ThreadStatus 类锁上通过 wait 进行等待
        new Thread(() -> {
            while (true){
                synchronized (ThreadStatusDemo.class){
                    try{
                        ThreadStatusDemo.class.wait();
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        }, "waiting").start();

        //线程在 ThreadStatus 加锁后，不会释放锁
        new Thread(new BlockedDemo(),"BlockDemo-01").start();
        new Thread(new BlockedDemo(),"BlockDemo-02").start();


    }

    static class BlockedDemo extends Thread{
        @Override
        public void run(){
            synchronized (BlockedDemo.class){
                while (true){
                    try{
                        TimeUnit.SECONDS.sleep(100);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
