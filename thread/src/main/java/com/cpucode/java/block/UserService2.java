package com.cpucode.java.block;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author : cpucode
 * @date : 2021/8/3
 * @time : 9:26
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class UserService2 {
    private final ExecutorService single = Executors.newSingleThreadExecutor();
    private volatile boolean isRunning = true;
    ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(10);

    {
        init();
    }


    public static void main(String[] args) {
        new UserService().register();
    }

    public void init(){
        single.execute(()-> {
            while (isRunning) {
                try {
                    //阻塞的方式获取队列中的数据
                    User user = (User) arrayBlockingQueue.take();
                    sendPoints(user);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public boolean register(){
        User user = new User();
        user.setName("cpucode");

        addUser(user);
        //添加到异步队列
        arrayBlockingQueue.add(user);

        return true;
    }

    private void addUser(User user){
        System.out.println("添加用户： " + user);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void sendPoints(User user){
        System.out.println("发送积分给指定用户:" + user);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
