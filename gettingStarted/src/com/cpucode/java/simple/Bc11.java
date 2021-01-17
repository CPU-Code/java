package com.cpucode.java.simple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 题目描述
 * 依次输入一个学生的学号，以及3科（C语言，数学，英语）成绩，在屏幕上输出该学生的学号，3科成绩。
 * 输入描述:
 * 学号以及3科成绩，学号和成绩之间用英文分号隔开，成绩之间用英文逗号隔开。
 * 输出描述:
 * 学号，3科成绩，输出格式详见输出样例。
 * 示例1
 * 输入
 * 17140216;80.845,90.55,100.00
 * 输出
 * The each subject score of  No. 17140216 is 80.85, 90.55, 100.00.
 *
 * @author : cpucode
 * @Date : 2021/1/17
 * @Time : 15:21
 * @Github : https://github.com/CPU-Code
 * @CSDN : https://blog.csdn.net/qq_44226094
 */
public class Bc11 {
    public static void main(String[] args) throws IOException{
        test1();
    }

    private static void test1() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String[] str = bf.readLine().split("[;,]");
        String[] num = new String[str.length];

        for(int i = 1; i < str.length; i++){
            num[i - 1] = String.format("%.2f", Float.parseFloat(str[i]));
        }

        System.out.println("The each subject score of  No. " + str[0] +
                " is " + num[0] +
                ", " + num[1] +
                ", " + num[2] + ".");

    }
}
