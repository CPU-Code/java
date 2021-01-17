package com.cpucode.java.simple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 题目描述
 * 输入3科成绩，然后把三科成绩输出，成绩为整数形式。
 * 输入描述:
 * 一行，3科成绩，用空格分隔，范围（0~100）。
 * 输出描述:
 * 一行，把3科成绩显示出来，输出格式详见输出样例。
 * 示例1
 * 输入
 * 60 80 90
 * 输出
 * score1=60,score2=80,score3=90
 *
 * @author : cpucode
 * @Date : 2021/1/17
 * @Time : 15:06
 * @Github : https://github.com/CPU-Code
 * @CSDN : https://blog.csdn.net/qq_44226094
 */
public class Bc10 {
    public static void main(String[] args) throws IOException {
        test1();
    }

    private static void test1() throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] str = bf.readLine().split(" ");

        System.out.println("score1=" + str[0] + ",score2=" + str[1] + ",score3=" + str[2]);
    }
}
