/**
 * User: cpucode
 * Date: 2021/1/5
 * Time: 17:13
 * Github: https://github.com/CPU-Code
 * CSDN: https://blog.csdn.net/qq_44226094
 */

package com.cpucode.java.heap;

import java.util.ArrayList;
import java.util.Random;

/*

 -Xms600m -Xmx600m
通过 visualVM GC发现
当 Eden space 满的时候 会触发一次 minor GC
把数据未回收的数据存放在 survivor 0, 1 俩个其中一个, 反复调换数据位置
当survivor 满时, 就会把数据存放在Old Gen 中
当Old Gen 数据满了 , 会触发Major GC,
依然满时, 还会触发Full GC ,
还是满, 就会报错OutOfMemoryError

* */
public class HeapInstanceTest {
    byte[] buffer = new byte[new Random().nextInt(1024 * 1024)];

    public static void main(String[] args) {
        ArrayList<HeapInstanceTest> list = new ArrayList<HeapInstanceTest>();

        System.out.println("我就是cpucode!!!!");

        while(true){
            list.add(new HeapInstanceTest());

            try{
                Thread.sleep(10);
            } catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
