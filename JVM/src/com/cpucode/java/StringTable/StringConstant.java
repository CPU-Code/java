/**
 * User: cpucode
 * Date: 2021/1/9
 * Time: 12:55
 * Github: https://github.com/CPU-Code
 * CSDN: https://blog.csdn.net/qq_44226094
 */

package com.cpucode.java.StringTable;
/*
* 通过debug 查看 memory 的String类个数
* */
public class StringConstant {
    public static void main(String[] args) {
        System.out.println();       //2148

        System.out.println("1");    //2149
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        System.out.println("5");    //2153

        //如下的字符串不会再次加载
        System.out.println("1");    //2154
        System.out.println("2");    //2154
        System.out.println("3");
        System.out.println("4");
        System.out.println("5");    //2154

    }
}
