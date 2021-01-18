package com.cpucode.java.simple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 题目描述
 * 从键盘输入5个学生的成绩（整数），求他们的平均成绩（浮点数，保留一位小数）。
 *
 * 输入描述:
 * 一行，连续输入5个整数（范围0~100），用空格分隔。
 * 输出描述:
 * 一行，输出5个数的平均数（保留一位小数）。
 * 示例1
 * 输入
 * 75 80 43 67 96
 * 输出
 * 72.2
 *
 * @author : cpucode
 * @Date : 2021/1/18
 * @Time : 10:53
 * @Github : https://github.com/CPU-Code
 * @CSDN : https://blog.csdn.net/qq_44226094
 */
public class Bc33 {
    public static void main(String[] args) throws IOException {
        test1();
    }

    private static void test1() throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] str = bf.readLine().split(" ");

        float num = 0;

        for(String s : str){
            num += Integer.parseInt(s);
        }

        System.out.printf("%.1f", num/str.length);
    }
}
