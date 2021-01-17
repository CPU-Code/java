package com.cpucode.java.simple;

/**
 * 题目描述
 * BoBo写了一个十六进制整数ABCDEF，他问KiKi对应的十进制整数是多少。
 *
 * 输入描述:
 * 无
 * 输出描述:
 * 十六进制整数ABCDEF对应的十进制整数，所占域宽为15。
 * 备注:
 * printf可以使用使用格式控制串“%md”输出域宽为m的十进制整数。
 *
 * @author : cpucode
 * @Date : 2021/1/17
 * @Time : 14:32
 * @Github : https://github.com/CPU-Code
 * @CSDN : https://blog.csdn.net/qq_44226094
 */
public class Bc8 {
    public static void main(String[] args){
        //test1();
        test2();
        //test3();
    }

    private static void test1(){
        int num = 0xABCDEF;
        System.out.printf("%15d",num);
    }

    private static void test2(){
        int num = 0xABCDEF;

        System.out.println("       " + num);
    }

    private static void test3(){
        String str = Integer.valueOf("ABCDEF", 16).toString();

        int spase = 15;

        for(int i = 0; i < spase - str.length(); i++){
            System.out.print(" ");
        }
        System.out.print(str);
    }
}
