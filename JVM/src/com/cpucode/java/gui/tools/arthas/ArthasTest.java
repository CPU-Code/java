package com.cpucode.java.gui.tools.arthas;

import java.util.HashSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Logger;

/**
 * @author : cpucode
 * @date : 2021/2/16
 * @time : 13:48
 * @github : https://githfub.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
@SuppressWarnings({"AlibabaAvoidManuallyCreateThread", "AlibabaThreadPoolCreation"})
public class ArthasTest {
    private static Logger log = Logger.getLogger("MyLogger");
    private static HashSet hashSet = new HashSet();

    /**
     * 线程池，大小1
     * */
    private static ExecutorService executorService = Executors.newFixedThreadPool(1);

    public static void main(String[] args) {

        /**
         * 模拟 CPU 过高，这里注释掉了，测试时可以打开
         * cpu();
         * 模拟线程阻塞
         * */
        thread();

        // 模拟线程死锁
        deadthread();

        // 不断的向 hashSet 集合增加数据
        addHashSetThread();
    }

    /**
     * 不断的向 hashSet 集合添加数据
     * */
    public static void addHashSetThread(){
        // 初始化常量
        new Thread( () ->{
            int count = 0;

            while (true){
                try{
                    hashSet.add("count" + count);

                    Thread.sleep(1000);
                    count++;
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }).start();
    }

    public static void cpu(){
        cpuHigh();
        cpuNormal();
    }

    /**
     *  极度消耗CPU的线程
     * */
    private static void cpuHigh(){
        Thread thread = new Thread(() -> {
            while (true){
                log.info("cpu start 100");
            }
        });

        // 添加到线程
        executorService.submit(thread);
    }

    /**
     * 普通消耗CPU的线程
     */
    private static void cpuNormal(){
        int num = 10;

        for (int i = 0; i < num; i++) {
            new Thread(() ->{
                while (true){
                    log.info("cpu start");

                    try{
                        Thread.sleep(3000);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }).start();
        }
    }

    /**
     * 模拟线程阻塞,向已经满了的线程池提交线程
     */
    private static void thread(){
        Thread thread = new Thread(() -> {
            while (true){
                log.info("thread start");

                try{
                    Thread.sleep(3000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });

        // 添加到线程
        executorService.submit(thread);
    }

    /**
     * 死锁
     */
    private static void deadthread(){
        // 创建资源
        Object resourceA = new Object();
        Object resourceB = new Object();

        Thread theradA = new Thread(() -> {
            synchronized(resourceA){
                log.info(Thread.currentThread() + "get ResourceA");

                try{
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }

                log.info(Thread.currentThread() + "waiting get resourceB");

                synchronized (resourceB){
                    log.info(Thread.currentThread() + "get resourceB");
                }
            }
        });

        Thread threadB = new Thread(() -> {
            synchronized(resourceB){
                log.info(Thread.currentThread() + "get ResourceB");

                try{
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }

                log.info(Thread.currentThread() + "waiting get resourceA");

                synchronized (resourceA){
                    log.info(Thread.currentThread() + "get resourceA");
                }
            }
        });

        theradA.start();
        threadB.start();
    }
}
