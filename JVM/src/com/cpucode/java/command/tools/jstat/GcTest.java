package com.cpucode.java.command.tools.jstat;

import java.util.ArrayList;

/**
 * -Xms60m -Xmx60m -XX:SurvivorRatio=8
 *
 * @author : cpucode
 * @date : 2021/2/5
 * @time : 20:28
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class GcTest {
    public static void main(String[] args) {
        ArrayList<byte[]> list = new ArrayList<>();
        int num = 1000;

        for (int i = 0; i < num; i++) {
            //100KB
            byte[] arr = new byte[1024 * 100];
            list.add(arr);

            try{
                Thread.sleep(100);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
