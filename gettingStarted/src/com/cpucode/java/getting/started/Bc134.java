package com.cpucode.java.getting.started;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 题目描述
 * KiKi知道了大一三科比较重要课程的分数，包括：程序设计基础，高数，英语，请编程帮他找到三科中的最高分。
 * 输入描述:
 * 一行，三个整数，用空格分隔，代表三科成绩。
 * 输出描述:
 * 一行，一个整数，代表输入三科分数中的最高分数。
 * 示例1
 * 输入
 * 90 88 99
 * 输出
 * 99
 *
 * @author : cpucode
 * @Date : 2021/1/17
 * @Time : 12:02
 * @Github : https://github.com/CPU-Code
 * @CSDN : https://blog.csdn.net/qq_44226094
 */
public class Bc134 {
    public static void main(String[] args) throws IOException{
        test1();
    }

    private static void test1() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] strs = bf.readLine().split(" ");
        int max = 0;

        for(String s : strs){
            int num = Integer.parseInt(s);

            if (num > max){
                max = num;
            }

        }
        System.out.println(max);
    }
}
