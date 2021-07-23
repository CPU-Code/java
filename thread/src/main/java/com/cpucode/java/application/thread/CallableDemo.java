package com.cpucode.java.application.thread;

import java.util.concurrent.*;

/**
 * 实现 Callable 接口通过 FutureTask 包装器来创建 Thread 线程
 *
 * @author : cpucode
 * @date : 2021/7/23
 * @time : 22:41
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class CallableDemo implements Callable<String> {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(1);

        CallableDemo callableDemo = new CallableDemo();
        Future<String> future = executorService.submit(callableDemo);

        System.out.println(future.get());
        executorService.shutdown();
    }

    @Override
    public String call() throws Exception {
        int a = 1;
        int b = 2;

        System.out.println(a + b);

        return "执行结果:" + (a + b);
    }
}
