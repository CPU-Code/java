package com.cpucode.java.simple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 题目描述
 * 给定一个球体的半径，计算其体积。其中球体体积公式为 V = 4/3*πr3，其中 π= 3.1415926。
 * 输入描述:
 * 一行，用浮点数表示的球体的半径。
 * 输出描述:
 * 一行，球体的体积，小数点后保留3位。
 * 示例1
 * 输入
 * 3.0
 * 输出
 * 113.097
 *
 * @author : cpucode
 * @Date : 2021/1/18
 * @Time : 9:41
 * @Github : https://github.com/CPU-Code
 * @CSDN : https://blog.csdn.net/qq_44226094
 */
public class Bc27 {
    public static void main(String[] args) throws IOException {
        test1();
    }

    private static void test1() throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        double pai = 3.1415926;

        float radius = Float.parseFloat(str);

        double volume = 4 * pai * Math.pow(radius, 3) / 3;

        System.out.printf("%.3f", volume);
    }
}
