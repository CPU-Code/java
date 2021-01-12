package com.cpucode.java.getting.started;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 题目描述
 * 给定两个整数a和b (－10,000 < a,b < 10,000)，计算a除以b的整数商和余数。
 * 输入描述:
 * 一行，包括两个整数a和b，依次为被除数和除数（不为零），中间用空格隔开。
 * 输出描述:
 * 一行，包含两个整数，依次为整数商和余数，中间用一个空格隔开。
 * 示例1
 * 输入
 * 15 2
 * 输出
 * 7 1
 *
 * @author : cpucode
 * @Date : 2021/1/12
 * @Time : 20:58
 * @Github : https://github.com/CPU-Code
 * @CSDN : https://blog.csdn.net/qq_44226094
 */
public class Bc18 {
    public static void main(String[] args) throws IOException{
        test1();
    }

    private static void test1() throws IOException {
        BufferedReader fs = new BufferedReader(new InputStreamReader(System.in));
        String[] str = fs.readLine().split(" ");

        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);

        if (b != 0){
            System.out.printf((int)(a / b) + " " + (int)(a % b));
        }
    }
}
