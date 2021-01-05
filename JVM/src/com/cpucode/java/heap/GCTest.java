/**
 * User: cpucode
 * Date: 2021/1/5
 * Time: 21:55
 * Github: https://github.com/CPU-Code
 * CSDN: https://blog.csdn.net/qq_44226094
 */

package com.cpucode.java.heap;

import java.util.ArrayList;
import java.util.List;

/*
    测试MinorGC 、 MajorGC、FullGC
    -Xms9m -Xmx9m -XX:+PrintGCDetails
* */
public class GCTest {
    public static void main(String[] args) {
        int i = 0;

        try{
            List<String> list = new ArrayList<>();
            String a = "https://blog.csdn.net/qq_44226094";

            while (true){
                list.add(a);
                a = a + a;

                i++;
            }
        } catch(Throwable t){
            t.printStackTrace();

            System.out.println("遍历次数为：" + i);
        }
    }
}

/*
Eden 满 触发 minor GC
Old 满 触发 major GC
方法区 和 Old 满  触发 Full GC

[GC (Allocation Failure) [PSYoungGen: 1980K->482K(2560K)] 1980K->877K(9728K), 0.0031065 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[GC (Allocation Failure) [PSYoungGen: 2258K->512K(2560K)] 2654K->1863K(9728K), 0.0007478 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[Full GC (Ergonomics) [PSYoungGen: 1677K->0K(2560K)] [ParOldGen: 6631K->4814K(7168K)] 8309K->4814K(9728K), [Metaspace: 3276K->3276K(1056768K)], 0.0045119 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[GC (Allocation Failure) [PSYoungGen: 74K->256K(2560K)] 7000K->7182K(9728K), 0.0008215 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[Full GC (Ergonomics) [PSYoungGen: 256K->0K(2560K)] [ParOldGen: 6926K->4837K(7168K)] 7182K->4837K(9728K), [Metaspace: 3291K->3291K(1056768K)], 0.0031570 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[GC (Allocation Failure) [PSYoungGen: 39K->0K(2560K)] 6989K->6949K(9728K), 0.0005003 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[Full GC (Ergonomics) [PSYoungGen: 0K->0K(2560K)] [ParOldGen: 6949K->6948K(7168K)] 6949K->6948K(9728K), [Metaspace: 3291K->3291K(1056768K)], 0.0039072 secs] [Times: user=0.00 sys=0.02, real=0.00 secs]
[GC (Allocation Failure) [PSYoungGen: 0K->0K(2560K)] 6948K->6948K(9728K), 0.0005250 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[Full GC (Allocation Failure) [PSYoungGen: 0K->0K(2560K)] [ParOldGen: 6948K->6930K(7168K)] 6948K->6930K(9728K), [Metaspace: 3291K->3291K(1056768K)], 0.0057537 secs] [Times: user=0.00 sys=0.00, real=0.01 secs]
遍历次数为：15
Heap
 PSYoungGen      total 2560K, used 101K [0x00000000ffd00000, 0x0000000100000000, 0x0000000100000000)
  eden space 2048K, 4% used [0x00000000ffd00000,0x00000000ffd196e0,0x00000000fff00000)
  from space 512K, 0% used [0x00000000fff00000,0x00000000fff00000,0x00000000fff80000)
  to   space 512K, 0% used [0x00000000fff80000,0x00000000fff80000,0x0000000100000000)
 ParOldGen       total 7168K, used 6930K [0x00000000ff600000, 0x00000000ffd00000, 0x00000000ffd00000)
  object space 7168K, 96% used [0x00000000ff600000,0x00000000ffcc4b38,0x00000000ffd00000)
 Metaspace       used 3326K, capacity 4496K, committed 4864K, reserved 1056768K
  class space    used 356K, capacity 388K, committed 512K, reserved 1048576K
java.lang.OutOfMemoryError: Java heap space
* */