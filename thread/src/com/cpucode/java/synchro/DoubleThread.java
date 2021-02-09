package com.cpucode.java.synchro;

/**
 * @author : cpucode
 * @date : 2021/2/9
 * @time : 12:10
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class DoubleThread{
    public static void main(String[] args) throws Exception{
        Thread add = new AddThread();
        Thread dec = new DecThread();

        add.start();
        dec.start();

        add.join();
        dec.join();

        //每次运行，结果实际上都是不一样的
        System.out.println(Counter.count);
    }

}

class Counter{
    public static int count = 0;
}

class AddThread extends Thread{
    @Override
    public void run(){
        for (int i = 0; i < 1000; i++) {
            Counter.count += 1;
        }
    }
}

class DecThread extends Thread{
    @Override
    public void run(){
        for (int i = 0; i < 1000; i++) {
            Counter.count -= 1;
        }
    }

}