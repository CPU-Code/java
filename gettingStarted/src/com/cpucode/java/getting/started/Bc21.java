package com.cpucode.java.getting.started;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 题目描述
 * 给定一个浮点数，要求得到该浮点数的个位数。
 *
 * 输入描述:
 * 一行，包括一个浮点数。
 * 输出描述:
 * 一行，包含一个整数，为输入浮点数对应的个位数。
 * 示例1
 * 输入
 * 13.141
 * 输出
 * 3
 *
 * @author : cpucode
 * @Date : 2021/1/12
 * @Time : 21:54
 * @Github : https://github.com/CPU-Code
 * @CSDN : https://blog.csdn.net/qq_44226094
 */
public class Bc21 {
    public static void main(String[] args) throws IOException{
        //test1();
        //test2();
        //test3();
        //test4();
        test5();
    }

    private static void test1() throws IOException{
        BufferedReader fs = new BufferedReader(new InputStreamReader(System.in));
        String[] str = fs.readLine().split("\\.");

        //获取指定字符串的倒数元素
        System.out.println(str[0].substring(str[0].length() - 1));
    }

    private static void test2() throws IOException{
        BufferedReader fs = new BufferedReader(new InputStreamReader(System.in));
        String str = fs.readLine();

        char c = str.charAt(str.indexOf(".") - 1);
        System.out.println(c);
    }

    private static void test3() throws IOException{
        BufferedReader fs = new BufferedReader(new InputStreamReader(System.in));

        int num = (int)Double.parseDouble(fs.readLine());
        System.out.println(num%10);
    }

    private static void test4() throws IOException {
        BufferedReader fs = new BufferedReader(new InputStreamReader(System.in));
        String[] str = fs.readLine().split("\\.");

        int num = Integer.parseInt(str[0]);

        System.out.println(num % 10);
    }

    private static void test5() throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num = (int)Float.parseFloat(bf.readLine());

        System.out.println(num%10);
    }
}
