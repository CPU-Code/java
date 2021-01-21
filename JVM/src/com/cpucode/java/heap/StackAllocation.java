/**
 * User: cpucode
 * Date: 2021/1/6
 * Time: 15:38
 * Github: https://github.com/CPU-Code
 * CSDN: https://blog.csdn.net/qq_44226094
 */

package com.cpucode.java.heap;

/*
 * 栈上分配测试
 * -Xmx256m -Xms256m -XX:-DoEscapeAnalysis -XX:+PrintGCDetails
 *
 * -Xmx256m -Xms256m -XX:+DoEscapeAnalysis -XX:+PrintGCDetails
* */
public class StackAllocation {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        int num = 10000000;

        for (int i = 0; i < num; i++) {
            alloc();
        }

        // 查看执行时间
        long end = System.currentTimeMillis();

        System.out.printf("花费的时间为： " + (end - start) + "ms");

        // 为了方便查看堆内存中对象个数，线程sleep
        try{
            Thread.sleep(100000);
        } catch(InterruptedException e){
            e.printStackTrace();
        }
    }

    private static void alloc(){
        //未发生逃逸
        User user = new User();
    }

    static class User{

    }
}

/*

没有开启逃逸分析 , 分配到了 堆 上
[GC (Allocation Failure) [PSYoungGen: 65536K->888K(76288K)] 65536K->896K(251392K), 0.0042179 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[GC (Allocation Failure) [PSYoungGen: 66424K->880K(76288K)] 66432K->888K(251392K), 0.0014039 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
花费的时间为： 65ms

开启逃逸分析 , 分配到栈上
花费的时间为： 10ms
* */