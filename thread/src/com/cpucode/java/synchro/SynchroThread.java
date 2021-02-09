package com.cpucode.java.synchro;

/**
 * @author : cpucode
 * @date : 2021/2/9
 * @time : 12:17
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class SynchroThread{
    public static void main(String[] args) throws Exception{
        Thread add = new AddThreadTest();
        Thread dec = new DecThreadTest();

        add.start();
        dec.start();

        add.join();
        dec.join();

        System.out.println(CounterTest.count);
    }
}

class CounterTest{
    /**
     * 锁
     * */
    public static final Object lock = new Object();
    public static int count = 0;
}

class AddThreadTest extends Thread{
    @Override
    public void run(){
        //对一个对象进行加锁
        synchronized (CounterTest.lock){
            //临界区
            CounterTest.count += 1;
        }
    }
}

class DecThreadTest extends Thread{
    @Override
    public void run(){
        //对一个对象进行加锁
        synchronized (CounterTest.lock){
            //临界区
            CounterTest.count -= 1;
        }
    }
}