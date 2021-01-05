/**
 * User: cpucode
 * Date: 2021/1/5
 * Time: 15:54
 * Github: https://github.com/CPU-Code
 * CSDN: https://blog.csdn.net/qq_44226094
 */

package com.cpucode.java.heap;

import java.util.ArrayList;
import java.util.Random;


//设置VM 选项: -Xms600m -Xmx600m
//通过visualVM 查看GC 变化
// 查看取样器的存储
public class OutOfMemory {
    public static void main(String[] args) {
        ArrayList<Picture> list = new ArrayList<>();

        while (true){
            try{
                Thread.sleep(20);
            } catch(InterruptedException e){
                e.printStackTrace();
            }

            list.add(new Picture(new Random().nextInt(1024 * 1024)));
        }
    }
}

class Picture{
    private byte[] pixels;

    public Picture(int length){
        this.pixels = new byte[length];
    }
}

/*
Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
	at com.cpucode.java.heap.Picture.<init>(OutOfMemory.java:35)
	at com.cpucode.java.heap.OutOfMemory.main(OutOfMemory.java:26)
* */