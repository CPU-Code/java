/**
 * User: cpucode
 * Date: 2021/1/10
 * Time: 16:04
 * Github: https://github.com/CPU-Code
 * CSDN: https://blog.csdn.net/qq_44226094
 */

package com.cpucode.java.GarbageCollection;

/*
强引用的测试

test1 开始
null
test1 结束

test2 开始
null
哈哈我是强引用cpuCode
test2 结束
* */
public class StrongReferenceTest {
    public static void main(String[] args) {
        test1();
        test2();
    }

    private static void test1(){
        System.out.println("test1 开始");

        StringBuilder str = new StringBuilder("哈哈我是强引用cpuCode");

        str = null;
        System.gc();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println(str);

        System.out.println("test1 结束");
        System.out.println();
    }

    private static void test2(){
        System.out.println("test2 开始");

        StringBuilder str = new StringBuilder("哈哈我是强引用cpuCode");
        StringBuilder str1 = str;

        str = null;
        System.gc();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println(str);
        System.out.println(str1);

        System.out.println("test2 结束");
        System.out.println();
    }
}
