/**
 * User: cpucode
 * Date: 2021/1/5
 * Time: 22:18
 * Github: https://github.com/CPU-Code
 * CSDN: https://blog.csdn.net/qq_44226094
 */

package com.cpucode.java.heap;

/*
测试：大对象直接进入老年代
-Xms60m -Xmx60m -XX:NewRatio=2 -XX:SurvivorRatio=8 -XX:+PrintGCDetails
* */
public class YoungOldAreaTest {
    public static void main(String[] args) {
        //20m
        byte[] buffer = new byte[1024 * 1024 * 20];
    }
}

/*
Heap
 PSYoungGen      total 18432K, used 2332K [0x00000000fec00000, 0x0000000100000000, 0x0000000100000000)
  eden space 16384K, 14% used [0x00000000fec00000,0x00000000fee473c8,0x00000000ffc00000)
  from space 2048K, 0% used [0x00000000ffe00000,0x00000000ffe00000,0x0000000100000000)
  to   space 2048K, 0% used [0x00000000ffc00000,0x00000000ffc00000,0x00000000ffe00000)
                                使用 20M
 ParOldGen       total 40960K, used 20480K [0x00000000fc400000, 0x00000000fec00000, 0x00000000fec00000)
  object space 40960K, 50% used [0x00000000fc400000,0x00000000fd800010,0x00000000fec00000)
 Metaspace       used 3296K, capacity 4496K, committed 4864K, reserved 1056768K
  class space    used 353K, capacity 388K, committed 512K, reserved 1048576K

* */