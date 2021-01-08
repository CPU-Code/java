/**
 * User: cpucode
 * Date: 2021/1/8
 * Time: 12:15
 * Github: https://github.com/CPU-Code
 * CSDN: https://blog.csdn.net/qq_44226094
 */

package com.cpucode.java.methodArea;

/**
 * 结论：
 * 静态引用对应的对象实体始终都存在堆空间
 *
 * jdk7：
 * -Xms200m -Xmx200m -XX:PermSize=300m -XX:MaxPermSize=300m -XX:+PrintGCDetails
 * jdk 8：
 * -Xms200m -Xmx200m -XX:MetaspaceSize=300m -XX:MaxMetaspaceSize=300m -XX:+PrintGCDetails
 */
public class StaticFieldTest {
    private static byte[] arr = new byte[1024 * 1024 * 100];    //100MB

    public static void main(String[] args) {
        System.out.println(StaticFieldTest.arr);

    }
}

/*
Heap
 PSYoungGen      total 59904K, used 4137K [0x00000000fbd80000, 0x0000000100000000, 0x0000000100000000)
  eden space 51712K, 8% used [0x00000000fbd80000,0x00000000fc18a5b8,0x00000000ff000000)
  from space 8192K, 0% used [0x00000000ff800000,0x00000000ff800000,0x0000000100000000)
  to   space 8192K, 0% used [0x00000000ff000000,0x00000000ff000000,0x00000000ff800000)
  静态存储在堆的老年区
 ParOldGen       total 136704K, used 102400K [0x00000000f3800000, 0x00000000fbd80000, 0x00000000fbd80000)
  object space 136704K, 74% used [0x00000000f3800000,0x00000000f9c00010,0x00000000fbd80000)
 Metaspace       used 3298K, capacity 4496K, committed 4864K, reserved 1056768K
  class space    used 353K, capacity 388K, committed 512K, reserved 1048576K

* */