package com.cpucode.java.getting.started;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 题目描述
 * 小乐乐输入三科成绩，请编程帮他输出三科成绩总分及平均分。
 * 输入描述:
 * 一行，3科成绩（浮点数），成绩之间用一个空格隔开。
 * 输出描述:
 * 一行，总分和平均分（小数点后保留两位），用一个空格隔开。
 * 示例1
 * 输入
 * 79.5 80.0 98.0
 * 输出
 * 257.50 85.83
 *
 * @author : cpucode
 * @Date : 2021/1/16
 * @Time : 22:51
 * @Github : https://github.com/CPU-Code
 * @CSDN : https://blog.csdn.net/qq_44226094
 */
public class Bc122 {
    public static void main(String[] args) throws IOException {
        test1();
    }

    private static void test1() throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String[] str = bf.readLine().split(" ");
        float sum = 0;

        for(int i = 0; i < str.length; i++){
            float num = Float.parseFloat(str[i]);

            sum += num;
        }

        System.out.printf("%.2f %.2f", sum, (float)(sum/str.length));
    }
}
