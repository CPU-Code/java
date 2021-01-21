/**
 * User: cpucode
 * Date: 2021/1/10
 * Time: 13:56
 * Github: https://github.com/CPU-Code
 * CSDN: https://blog.csdn.net/qq_44226094
 */

package com.cpucode.java.garbage.collection;

import java.util.ArrayList;
import java.util.List;

public class StopTheWorldTest {
    public static class WorkThread extends Thread{
        List<byte[]> list = new ArrayList<byte[]>();
        int end = 1000;

        @Override
        public void run(){
            try {
                while (true){
                    for (int i = 0; i < end; i++) {
                        byte[] buffer = new byte[1024];

                        list.add(buffer);
                    }

                    if (list.size() > 10000){
                        list.clear();

                        //会触发full gc，进而会出现STW事件
                        System.gc();
                    }
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    public static class PrintThread extends Thread{
        public final long startTime = System.currentTimeMillis();

        @Override
        public void run(){
            try {
                while (true){
                    // 每秒打印时间信息
                    long t = System.currentTimeMillis() - startTime;

                    System.out.println(t / 1000 + "." + t %1000);
                    Thread.sleep(1000);
                }
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args){
        //test1();

        test2();
    }

    private static void test1(){
        PrintThread p = new PrintThread();
        p.start();
    }

    private static void test2(){
        WorkThread w = new WorkThread();
        PrintThread p = new PrintThread();

        w.start();
        p.start();
    }


}
