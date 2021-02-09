package com.cpucode.java.gui.tools.jvisualvm;

import java.util.ArrayList;
import java.util.Random;

/**
 * -Xms500m -Xmx500m -XX:SurvivorRatio=8
 *
 * @author : cpucode
 * @date : 2021/2/9
 * @time : 11:25
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class HeapInstanceTest {
    byte[] buffer = new byte[new Random().nextInt(1024 * 100)];

    public static void main(String[] args) {
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        ArrayList<HeapInstanceTest> list = new ArrayList<HeapInstanceTest>();

        while(true){
            list.add(new HeapInstanceTest());

            try{
                Thread.sleep(10);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
