package com.cpucode.java.operating.parameters;

import java.util.ArrayList;

/**
 * -Xms60m -Xmx60m -XX:SurvivorRatio=8
 *
 * @author : cpucode
 * @date : 2021/2/16
 * @time : 20:56
 * @github : https://githfub.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class GcLogTest {
    public static void main(String[] args) {
        ArrayList<byte[]> list = new ArrayList<>();
        int num = 500;

        for (int i = 0; i < num; i++) {
            byte[] arr = new byte[1024 * 100];

            list.add(arr);

            try{
                Thread.sleep(20);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
