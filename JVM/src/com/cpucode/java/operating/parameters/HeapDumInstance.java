package com.cpucode.java.operating.parameters;

import java.util.ArrayList;

/**
 * -XX:+HeapDumpOnOutOfMemoryError
 * -XX:+HeapDumpBeforeFullGC
 * -XX:HeapDumpPath=D:\Date\github\java\JVM\src\com\cpucode\java\operating\parameters\heapdumpinstance.hprof
 *
 * @author : cpucode
 * @date : 2021/2/16
 * @time : 20:51
 * @github : https://githfub.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class HeapDumInstance {
    private static int ONEMB = 1024 * 1024;
    byte[] buffer = new byte[10 * ONEMB];

    public static void main(String[] args) {
        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        ArrayList<HeapDumInstance> list = new ArrayList<HeapDumInstance>();
        int num = 500;

        for (int i = 0; i < num; i++) {
            list.add(new HeapDumInstance());

            try{
                Thread.sleep(10);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }

        System.out.println("程序执行结束");
    }
}
