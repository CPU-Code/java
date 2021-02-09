package com.cpucode.java.wait.notify;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author : cpucode
 * @date : 2021/2/9
 * @time : 17:24
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class WaitNotify {
    @SuppressWarnings("AlibabaAvoidManuallyCreateThread")
    public static void main(String[] args) throws InterruptedException{
        TaskQueue q = new TaskQueue();
        List<Thread> ts = new ArrayList<Thread>();
        int num = 5;
        int num1 = 10;

        for (int i = 0; i < num; i++) {
            //noinspection AlibabaAvoidManuallyCreateThread
            Thread t = new Thread(){
                @Override
                public void run(){
                    // 执行task:
                    while(true){
                        try{
                            String s = q.getTask();

                            System.out.println("execute task : " + s);
                        } catch (InterruptedException e){
                            return;
                        }
                    }
                }
            };

            t.start();
            ts.add(t);
        }

        Thread add = new Thread(() ->{
            for (int i = 0; i < num1; i++) {
                // 放入task:
                String s =  "t -" + Math.random();

                System.out.println("add task:" + s);

                q.addTask(s);

                try{
                    Thread.sleep(100);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });

        add.start();
        add.join();

        Thread.sleep(100);

        for (Thread t : ts){
            t.interrupt();
        }
    }
}

class TaskQueue{
    Queue<String> queue = new LinkedList<>();

    public synchronized void addTask(String s){
        this.queue.add(s);
        //唤醒所有当前正在this锁等待的线程
        this.notifyAll();
    }

    public synchronized String getTask() throws InterruptedException{
        while (queue.isEmpty()){
            //等待
            this.wait();
        }

        return queue.remove();
    }
}