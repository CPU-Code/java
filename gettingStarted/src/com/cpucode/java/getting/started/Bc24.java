package com.cpucode.java.getting.started;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 题目描述
 * 依次输入一个学生的3科成绩，在屏幕上输出该学生的总成绩以及平均成绩。
 * 输入描述:
 * 一行，3科成绩，成绩之间用一个空格隔开。
 * 输出描述:
 * 一行，总成绩和平均成绩（小数点后保留两位），用一个空格隔开。
 * 示例1
 * 输入
 * 79.5 80.0 98.0
 * 输出
 * 257.50 85.83
 *
 * @author : cpucode
 * @Date : 2021/1/13
 * @Time : 21:58
 * @Github : https://github.com/CPU-Code
 * @CSDN : https://blog.csdn.net/qq_44226094
 */
public class Bc24 {
    public static void main(String[] args){
        //test1();
        test2(3);
    }

    private static void test1() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] str = bf.readLine().split("\\ ");

        float sum = Float.parseFloat(str[0]) + Float.parseFloat(str[1]) + Float.parseFloat(str[2]);
        float ave = sum / 3;

        System.out.println(String.format("%.2f", sum) + " " + String.format("%.2f", ave));
    }

    private static void test2(int num) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] str = bf.readLine().split(" ");
        float sum = 0;

        for(int i = 0; i < num; i++){
            sum += Float.valueOf(str[i]);
        }

        System.out.printf("%.2f %.2f", sum, sum/num);
    }
}
