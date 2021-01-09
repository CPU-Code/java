/**
 * User: cpucode
 * Date: 2021/1/9
 * Time: 10:17
 * Github: https://github.com/CPU-Code
 * CSDN: https://blog.csdn.net/qq_44226094
 */

package com.cpucode.java.StringTable;

//String的基本使用:体现String的不可变性

public class StringOnly {
    public static void main(String[] args) {
        test1();
        test2();
        test3();
    }

    private static void test1(){
        System.out.println("test1 开始 ");
        //字面量定义的方式，存储在字符串常量池中
        String s1 = "cpucpu";
        String s2 = "codecode";

        s2 = "cpucode";

        //判断地址：
        System.out.println(s1 == s2);

        System.out.println(s1);
        System.out.println(s2);

        System.out.println("test1 结束");
        System.out.println();
    }

    private static void test2(){
        System.out.println("test2 开始 ");

        String s1 = "cpu";
        String s2 = "code";

        s2 += "test";

        System.out.println(s1);
        System.out.println(s2);

        System.out.println("test2 结束");
        System.out.println();
    }

    private static void test3(){
        System.out.println("test3 开始 ");

        String s1 = "cauCode";
        String s2 = s1.replace('a','p');

        System.out.println(s1);
        System.out.println(s2);

        System.out.println("test3 结束");
        System.out.println();
    }
}
