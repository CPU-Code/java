package com.cpucode.pattern.singleton.register.container;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * @author : cpucode
 * @date : 2021/5/28
 * @time : 22:49
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class ConcurrentExecutor {
    public interface RunHandler{
        void handler();
    }

    /**
     *
     * @param runHandler
     * @param executeCount      发起请求总数
     * @param concurrentCount   同时并发执行的线程数
     * @throws Exception
     */
    public static void execute(final RunHandler runHandler,
                               int executeCount,
                               int concurrentCount) throws Exception {
        ExecutorService executorService = Executors.newCachedThreadPool();
        // 控制信号量，此处用于控制并发的线程数
        final Semaphore semaphore = new Semaphore(concurrentCount);

        //闭锁，可实现计数量递减
        final CountDownLatch countDownLatch = new CountDownLatch(executeCount);

        for (int i = 0; i < executeCount; i++) {
            executorService.execute(new Runnable() {
                public void run() {
                    try{
                        //执行此方法用于获取执行许可，当总计未释放的许可数不超过executeCount时,
                        //则允许同性，否则线程阻塞等待，知道获取到许可
                        semaphore.acquire();
                        runHandler.handler();
                        //释放许可
                        semaphore.release();
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                    countDownLatch.countDown();
                }
            });
        }
        //线程阻塞，知道闭锁值为0时，阻塞才释放，继续往下执行
        countDownLatch.await();
        executorService.shutdown();
    }
}
