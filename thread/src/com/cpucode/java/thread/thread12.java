/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-15 17:55:40
 * @LastEditTime: 2020-09-15 17:57:04
 * @FilePath: \java\thread\thread12.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package com.cpucode.java.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class thread12 {
    public static void main(String[] args){
        /**
         * 创建线程池对象
         * 包含2个线程对象
         */
        ExecutorService service = Executors.newFixedThreadPool(2);
        // 创建Runnable实例对象
        MyRunnable r = new MyRunnable();

        //自己创建线程对象的方式
        // Thread t = new Thread(r);
        // t.start(); ‐‐‐> 调用MyRunnable中的run()
        // 从线程池中获取线程对象,然后调用MyRunnable中的run()
        
        service.submit(r);
        // 再获取个线程对象，调用MyRunnable中的run()
        service.submit(r);
        service.submit(r);

        // 注意：submit方法调用结束后，程序并不终止，是因为线程池控制了线程的关闭。
        // 将使用完的线程又归还到了线程池中
        // 关闭线程池
        //service.shutdown();
    }
}

/**
 * Runnable实现类代码
 * */
class MyRunnable implements Runnable {
    @Override
    public void run(){
        System.out.println("我要cpucode");

        try{
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("cpucode来了" + Thread.currentThread().getName());
        System.out.println("cpucode教我写代码,跑了");
    }
}

/*
我要cpucode
我要cpucode
cpucode来了pool-1-thread-2
cpucode教我写代码,跑了
cpucode来了pool-1-thread-1
cpucode教我写代码,跑了
我要cpucode
cpucode来了pool-1-thread-2
cpucode教我写代码,跑了
*/