package com.cpucode.java.gc.log;

import java.util.ArrayList;

/**
 * 测试生成详细的日志文件
 *
 * -Xms60m -Xmx60m -XX:SurvivorRatio=8 -XX:+PrintGCDetails -XX:+PrintGCTimeStamps -XX:+PrintGCDateStamps -XX:+PrintHeapAtGC
 *
 * @author : cpucode
 * @date : 2021/2/17
 * @time : 10:30
 * @github : https://githfub.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class GcLogTest {
    public static void main(String[] args) {
        ArrayList<byte[]> list = new ArrayList<>();

        for (int i = 0; i < 5000; i++) {
            //50KB
            byte[] arr = new byte[1024 * 50];
            list.add(arr);

            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
