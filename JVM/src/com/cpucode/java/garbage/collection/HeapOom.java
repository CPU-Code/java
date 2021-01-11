package com.cpucode.java.garbage.collection;

import java.util.ArrayList;

/**
 * -Xms8m -Xmx8m -XX:+HeapDumpOnOutOfMemoryError
 * @author: cpucode
 * @Date: 2021/1/9
 * @Time: 22:02
 * @Github: https://github.com/CPU-Code
 * @CSDN: https://blog.csdn.net/qq_44226094
 */
public class HeapOom {
    byte[] buffer = new byte[1 * 1024 * 1024];

    public static void main(String[] args) {
        ArrayList<HeapOom> list = new ArrayList<>();

        int count = 0;

        try{
            while (true){
                list.add(new HeapOom());
                count++;
            }
        }catch (Throwable e){
            System.out.println(count);

            e.printStackTrace();
        }
    }
}
