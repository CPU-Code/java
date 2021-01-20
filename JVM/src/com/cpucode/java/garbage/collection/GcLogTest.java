package com.cpucode.java.garbage.collection;

import java.util.ArrayList;

/**
 * -Xms60m -Xmx60m -XX:SurvivorRatio=8 -XX:+PrintGCDetails -Xloggc:./logs/gc.log
 *
 *      Allocation Failure : GC 发生的原因
 *                          PSYoungGen : 使用了 Parallel 垃圾回收器的新生代GC 前后大小的变化
 * [GC (Allocation Failure) [PSYoungGen: 16302K->2016K(18432K)] 16302K->15410K(59392K), 0.0042907 secs]
 *          [Times: user=0.00 sys=0.00, real=0.00 secs]
 * [GC (Allocation Failure) [PSYoungGen: 18390K->2020K(18432K)] 31784K->30596K(59392K), 0.0079416 secs]
 *          [Times: user=0.00 sys=0.00, real=0.01 secs]
 * [Full GC (Ergonomics) [PSYoungGen: 2020K->0K(18432K)]
 *      ParOldGen: 使用了 Parallel Old 垃圾回收器 回收老年代前后空间的变化
 *      [ParOldGen: 28576K->30156K(40960K)] 30596K->30156K(59392K),
 *      Metaspace : 元数据区GC 前后大小的变化,
 *      [Metaspace: 3817K->3817K(1056768K)], 0.0148426 secs]
 *      Times:
 *          user : 指的是垃圾回收器花费的所有CPU时间,
 *          sys: 花费在等待系统调用或系统事件的时间
 *          real: GC从开始到结束的时间,包括其他进程占用时间片的实际时间
 *      [Times: user=0.20 sys=0.00, real=0.02 secs]
 * [Full GC (Ergonomics) [PSYoungGen: 16323K->5500K(18432K)]
 *      [ParOldGen: 30156K->40956K(40960K)] 46480K->46457K(59392K),
 *      [Metaspace: 3818K->3818K(1056768K)], 0.0123510 secs]
 *      [Times: user=0.19 sys=0.02, real=0.01 secs]
 *
 * Heap
 *  PSYoungGen      total 18432K, used 10179K [0x00000000fec00000, 0x0000000100000000, 0x0000000100000000)
 *   eden space 16384K, 62% used [0x00000000fec00000,0x00000000ff5f0da8,0x00000000ffc00000)
 *   from space 2048K, 0% used [0x00000000ffe00000,0x00000000ffe00000,0x0000000100000000)
 *   to   space 2048K, 0% used [0x00000000ffc00000,0x00000000ffc00000,0x00000000ffe00000)
 *  ParOldGen       total 40960K, used 40956K [0x00000000fc400000, 0x00000000fec00000, 0x00000000fec00000)
 *   object space 40960K, 99% used [0x00000000fc400000,0x00000000febff098,0x00000000fec00000)
 *  Metaspace       used 3824K, capacity 4536K, committed 4864K, reserved 1056768K
 *   class space    used 416K, capacity 428K, committed 512K, reserved 1048576K
 *
 * @author : cpucode
 * @Date : 2021/1/20
 * @Time : 20:41
 * @Github : https://github.com/CPU-Code
 * @CSDN : https://blog.csdn.net/qq_44226094
 */
public class GcLogTest {
    public static void main(String[] args) {
        ArrayList<byte[]> list = new ArrayList<>();

        for (int i = 0; i < 500; i++){
            /**
             * 100KB
            * */
            byte[] arr = new byte[1024 * 100];

            list.add(arr);

            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
