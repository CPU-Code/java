package com.cpucode.concurrency;

/**
 * 并发和单线程执行测试
 *
 * @author : cpucode
 * @date : 2021/4/10
 * @time : 21:52
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class ConcurrencyTest {

    /**
     * 执行次数
     */
    private static final long COUNT = 10000L;
    //private static final long COUNT = 100000000L;
    //private static final long COUNT = 1000000000L;

    public static void main(String[] args) throws InterruptedException{
        //并发计算
        concurrency();
        //单线程计算
        serial();
    }

    /**
     * 并发计算
     * @throws InterruptedException
     */
    private static void concurrency() throws InterruptedException {
        long start = System.currentTimeMillis();

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                int a = 0;

                for (long i = 0; i < COUNT; i++) {
                    a += 5;
                }

                System.out.println(a);
            }
        });

        thread.start();

        int b = 0;
        for (long i = 0; i < COUNT; i++) {
            b--;
        }
        thread.join();

        long time = System.currentTimeMillis() - start;

        System.out.println("concurrency : " + time + "ms, b=" + b);
    }

    /**
     * 单线程计算
     */
    private static void serial() {
        long start = System.currentTimeMillis();

        int a = 0;
        for (long i = 0; i < COUNT; i++) {
            a += 5;
        }

        int b = 0;
        for (long i = 0; i < COUNT; i++) {
            b--;
        }

        long time = System.currentTimeMillis() - start;
        System.out.println("serial:" + time + "ms, b=" + b + ", a=" + a);
    }
}
