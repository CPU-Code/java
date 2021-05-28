package com.cpucode.pattern.singleton.lazy.simple;

/**
 * 一定几率出现创建两个不同结果的情况，意味着上面的单例存在线程安全隐患
 *
 * @author : cpucode
 * @date : 2021/5/28
 * @time : 11:24
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class LazySimpleSingletonTest {
    public static void main(String[] args) {
        Thread t1 = new Thread(new ExectorThread());
        Thread t2 = new Thread(new ExectorThread());

        t1.start();
        t2.start();

        System.out.println("end");
    }
}
