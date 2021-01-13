package com.cpucode.java.getting.started;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 题目描述
 *  问题：一年约有3.156×107s，要求输入您的年龄，显示该年龄合多少秒。
 *
 * 输入描述:
 * 一行，包括一个整数age(0<age<=200)。
 * 输出描述:
 * 一行，包含一个整数，输出年龄对应的秒数。
 * 示例1
 * 输入
 * 复制
 * 输出
 * 631200000
 *
 * @author : cpucode
 * @Date : 2021/1/12
 * @Time : 23:02
 * @Github : https://github.com/CPU-Code
 * @CSDN : https://blog.csdn.net/qq_44226094
 */
public class Bc22 {
    public static void main(String[] args) throws IOException {
        //test1();
        test2();
    }

    private static void test1() throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();

        long num = (long)(Long.parseLong(str) * Math.pow(10, 7) * 3.156);

        System.out.println(num);
    }

    private static void test2() throws IOException{
        long n = (long)(3.156 * 10000000);
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();

        long num = Integer.parseInt(str);

        System.out.println(num * n);
    }
}
