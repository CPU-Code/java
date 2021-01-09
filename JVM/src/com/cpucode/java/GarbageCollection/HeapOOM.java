/**
 * User: cpucode
 * Date: 2021/1/9
 * Time: 22:02
 * Github: https://github.com/CPU-Code
 * CSDN: https://blog.csdn.net/qq_44226094
 */

package com.cpucode.java.GarbageCollection;

import java.util.ArrayList;

// -Xms8m -Xmx8m -XX:+HeapDumpOnOutOfMemoryError
public class HeapOOM {
    byte[] buffer = new byte[1 * 1024 * 1024];

    public static void main(String[] args) {
        ArrayList<HeapOOM> list = new ArrayList<>();

        int count = 0;

        try{
            while (true){
                list.add(new HeapOOM());
                count++;
            }
        }catch (Throwable e){
            System.out.println(count);

            e.printStackTrace();
        }
    }
}
