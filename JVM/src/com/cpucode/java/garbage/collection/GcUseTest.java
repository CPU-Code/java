package com.cpucode.java.garbage.collection;

import java.util.ArrayList;

/**
 *  -XX:+PrintCommandLineFlags
 *
 *  打印结果: -XX:InitialHeapSize=257798976     ==245M
 *           -XX:MaxHeapSize=4124783616         == 3G
 *           -XX:+PrintCommandLineFlags
 *           -XX:+UseCompressedClassPointers
 *           -XX:+UseCompressedOops
 *           -XX:-UseLargePagesIndividualAllocation
 *           -XX:+UseParallelGC
 *
 *  -XX:+UseSerialGC:表明新生代使用Serial GC ，同时老年代使用Serial Old GC
 *
 *  -XX:+UseParNewGC：标明新生代使用ParNew GC
 *
 *  -XX:+UseParallelGC: 表明新生代使用Parallel GC
 *  -XX:+UseParallelOldGC : 表明老年代使用 Parallel Old GC
 *  说明：二者可以相互激活
 *
 *  -XX:+UseConcMarkSweepGC：表明老年代使用CMS GC。同时，年轻代会触发对ParNew 的使用
 *
 * @author: cpucode
 * @Date: 2021/1/10
 * @Time: 20:37
 * @Github: https://github.com/CPU-Code
 * @CSDN: https://blog.csdn.net/qq_44226094
 */
public class GcUseTest {
    public static void main(String[] args) {
        ArrayList<byte[]> list = new ArrayList<>();

        while (true){
            byte[] arr = new byte[100];

            list.add(arr);

            try{
                Thread.sleep(10);
            } catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

/*

使用 win的 cmd (win + r)
C:\Users\cpucode>jps
7408 GCUseTest
9828 Jps
16008 org.eclipse.equinox.launcher_1.6.0.v20200915-1508.jar
16808 Launcher
8220

C:\Users\cpucode>jinfo -flag UseParallelGC 7408
-XX:+UseParallelGC

C:\Users\cpucode>jinfo -flag UseParallelOldGC 7408
-XX:+UseParallelOldGC

C:\Users\cpucode>jinfo -flag UseSerialGC 7408
-XX:-UseSerialGC

C:\Users\cpucode>jinfo -flag UseParNewGC 7408
-XX:-UseParNewGC

C:\Users\cpucode>jinfo -flag UseConcMarkSweepGC 7408
-XX:-UseConcMarkSweepGC

* */