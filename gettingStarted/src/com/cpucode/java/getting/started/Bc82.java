package com.cpucode.java.getting.started;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 题目描述
 * 这是一个非常简单的题目，意在考察你编程的基础能力。千万别想难了哦。输入为一行，
 * 包括了用空格分隔的四个整数a、b、c、d（0 < a, b, c, d < 100,000）。输出为一行，为“(a+b-c)*d”的计算结果。
 *
 * 输入描述:
 * 输入为一行，用空格分隔的四个整数a、b、c、d（0 < a, b, c, d < 100,000）。
 * 输出描述:
 * 输出为一行，为“(a+b-c)*d”的计算结果。
 * 示例1
 * 输入
 * 1 3 2 4
 * 输出
 * 8
 *
 * @author : cpucode
 * @Date : 2021/1/16
 * @Time : 19:56
 * @Github : https://github.com/CPU-Code
 * @CSDN : https://blog.csdn.net/qq_44226094
 */
public class Bc82 {
    public static void main(String[] args) throws IOException {
        test1();
    }

    private static void test1() throws IOException{
        int a, b, c, d;

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String[] str = bf.readLine().split(" ");

        a = Integer.parseInt(str[0]);
        b = Integer.parseInt(str[1]);
        c = Integer.parseInt(str[2]);
        d = Integer.parseInt(str[3]);

        System.out.println((a + b - c) * d);

    }
}
