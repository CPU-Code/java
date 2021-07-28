package com.cpucode.java.volati;

/**
 * @author : cpucode
 * @date : 2021/7/28
 * @time : 10:46
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class JoinRule {
    static int x = 0;

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(()->{
            x = 10;
            System.out.println("t1");
            //执行的结果对于主线程可见
        });
        Thread t2 = new Thread(()->{
            x = 20;
            System.out.println("t2");
        });
        Thread t3 = new Thread(()->{
            x = 30;
            System.out.println("t3");
        });
        t1.start();
        t1.join(); //阻塞主线程 wait/notify
        System.out.println("t1.start.join : " + x);

        //等到阻塞释放
        //获取到t1线程的执行结果.
        t2.start();
        t2.join(); // 建立一个happens-bebefore规则
        System.out.println("t2.start.join : " + x);

        t3.start();

        System.out.println("t3.start : " + x);
    }
}
