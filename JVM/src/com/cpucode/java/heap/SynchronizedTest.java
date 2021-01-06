/**
 * User: cpucode
 * Date: 2021/1/6
 * Time: 16:04
 * Github: https://github.com/CPU-Code
 * CSDN: https://blog.csdn.net/qq_44226094
 */

package com.cpucode.java.heap;

/*
 同步省略说明
 逃逸分析直接未逃逸的代码把synchronized去掉

  */
public class SynchronizedTest {
    public static void main(String[] args) {
        SynchronizedTest synchronizedTest = new SynchronizedTest();

        synchronizedTest.f();
    }

    public void f(){
        Object hollis = new Object();

        synchronized(hollis){
            System.out.println(hollis);
        }
    }
}
