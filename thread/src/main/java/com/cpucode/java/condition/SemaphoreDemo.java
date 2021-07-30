package com.cpucode.java.condition;

import java.util.concurrent.Semaphore;

/**
 * @author : cpucode
 * @date : 2021/7/30
 * @time : 16:41
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class SemaphoreDemo {
    //限流（AQS）

    //permits; 令牌(5)

    //公平和非公平

    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(5);

        for(int i = 0; i < 10; i++){
            new Car(i, semaphore).start();
        }
    }


    static class Car extends  Thread{
        private int num;
        private Semaphore semaphore;

        public Car(int num, Semaphore semaphore) {
            this.num = num;
            this.semaphore = semaphore;
        }

        @Override
        public void run(){
            try {
                //获得一个令牌, 如果拿不到令牌，就会阻塞
                semaphore.acquire();

                System.out.println("第" + num + " 抢占一个车位");
                Thread.sleep(2000);
                System.out.println("第" + num + " 开走喽");

                semaphore.release();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
