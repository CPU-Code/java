package com.cpucode.java.garbage.collection;

/**
 *  在jdk7 和 jdk8中分别执行
 *   -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:+UseSerialGC
 *
 *   [GC (Allocation Failure) [DefNew: 7980K->607K(9216K), 0.0049089 secs] 7980K->6751K(19456K), 0.0052406 secs]
 *          [Times: user=0.00 sys=0.00, real=0.01 secs]
 * Heap
 *  def new generation   total 9216K, used 4869K [0x00000000fec00000, 0x00000000ff600000, 0x00000000ff600000)
 *   eden space 8192K,  52% used [0x00000000fec00000, 0x00000000ff029830, 0x00000000ff400000)
 *   from space 1024K,  59% used [0x00000000ff500000, 0x00000000ff597f40, 0x00000000ff600000)
 *   to   space 1024K,   0% used [0x00000000ff400000, 0x00000000ff400000, 0x00000000ff500000)
 *  tenured generation   total 10240K, used 6144K [0x00000000ff600000, 0x0000000100000000, 0x0000000100000000)
 *    the space 10240K,  60% used [0x00000000ff600000, 0x00000000ffc00030, 0x00000000ffc00200, 0x0000000100000000)
 *  Metaspace       used 3279K, capacity 4496K, committed 4864K, reserved 1056768K
 *   class space    used 351K, capacity 388K, committed 512K, reserved 1048576K
 *
 * @author : cpucode
 * @Date : 2021/1/20
 * @Time : 21:07
 * @Github : https://github.com/CPU-Code
 * @CSDN : https://blog.csdn.net/qq_44226094
 */
public class GcLogHeapTest {
    private static final int ONEMB = 1024 * 1024;

    public static void testAllocation(){
        byte[] allocation1, allocation2, allocation3, allocation4;

        allocation1 = new byte[2 * ONEMB];
        allocation2 = new byte[2 * ONEMB];
        allocation3 = new byte[2 * ONEMB];
        allocation4 = new byte[4 * ONEMB];
    }

    public static void main(String[] args) {
        testAllocation();
    }
}
