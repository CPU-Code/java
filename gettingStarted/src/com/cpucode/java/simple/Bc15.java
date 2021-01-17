package com.cpucode.java.simple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 题目描述
 *
 * 输入两个整数，范围-231~231-1，交换两个数并输出。
 *
 * 输入描述:
 * 输入只有一行，按照格式输入两个整数，范围，中间用“,”分隔。
 * 输出描述:
 * 把两个整数按格式输出，中间用“,”分隔。
 * 示例1
 * 输入
 * a=1,b=2
 * 输出
 * a=2,b=1
 * 备注:
 * 如果格式控制串中有非格式字符则输入时也要输入该非格式字符。
 *
 * @author : cpucode
 * @Date : 2021/1/17
 * @Time : 21:58
 * @Github : https://github.com/CPU-Code
 * @CSDN : https://blog.csdn.net/qq_44226094
 */
public class Bc15 {
    public static void main(String[] args) throws IOException{
        //test1();
        test2();
    }

    private static void test1() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] str = bf.readLine().split(",");
        String[] a = str[0].split("=");
        String[] b = str[1].split("=");

        System.out.println("a=" + b[1] + ",b=" + a[1]);
    }

    private static void test2() throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        String a = str.substring(str.lastIndexOf('=') + 1);
        String b = str.substring(str.indexOf('=') + 1, str.indexOf(','));

        System.out.println("a=" + a + ",b=" + b);
    }
}
