package com.cpucode.java.create.thread;

/**
 * @author : cpucode
 * @date : 2021/2/3
 * @time : 23:24
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class DoubleThread {
    public static void main(String[] args) {
        new Thread1().start();
        new Thread2().start();

        for (int i = 0; i < 5; i++){
            System.out.println("main 运行" + i);

            try{
                Thread.sleep(1);
            }catch (InterruptedException e){

            }
        }
    }
}

class Thread1 extends Thread{

    @Override
    public void run(){
        for (int i = 0; i < 5; i++){
            System.out.println("Thread1 运行" + i);

            try{
                Thread.sleep(1);
            } catch (InterruptedException e){

            }
        }
    }
}

class Thread2 extends Thread{
    @Override
    public void run(){
        for (int i = 0; i < 5; i++){
            System.out.println("Thread2 运行" + i);

            try{
                Thread.sleep(1);
            } catch (InterruptedException e){

            }
        }
    }
}

/**
 * Thread1 运行0
 * main 运行0
 * Thread2 运行0
 * Thread1 运行1
 * Thread2 运行1
 * main 运行1
 * Thread1 运行2
 * main 运行2
 * Thread2 运行2
 * main 运行3
 * Thread2 运行3
 * Thread1 运行3
 * main 运行4
 * Thread2 运行4
 * Thread1 运行4
 * */