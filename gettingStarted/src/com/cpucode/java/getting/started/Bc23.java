package com.cpucode.java.getting.started;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 题目描述
 * 给定秒数seconds (0< seconds < 100,000,000)，把秒转化成小时、分钟和秒。
 *
 * 输入描述:
 * 一行，包括一个整数，即给定的秒数。
 * 输出描述:
 * 一行，包含三个整数，依次为输入整数对应的小时数、分钟数和秒数（可能为零），中间用一个空格隔开。
 * 示例1
 * 输入
 * 3661
 * 输出
 * 1 1 1
 *
 * @author : cpucode
 * @Date : 2021/1/13
 * @Time : 21:39
 * @Github : https://github.com/CPU-Code
 * @CSDN : https://blog.csdn.net/qq_44226094
 */
public class Bc23 {
    public static void main(String[] args) throws IOException{
        test1();
    }

    private static void test1() throws IOException{
        BufferedReader fs = new BufferedReader(new InputStreamReader(System.in));
        String str = fs.readLine();

        long num = Long.parseLong(str);

        int hour = (int)(num / (60 * 60));
        int minute = (int)(num / 60 % 60);
        int second = (int)(num % 60);

        System.out.println(hour + " " + minute + " " + second);
    }
}
