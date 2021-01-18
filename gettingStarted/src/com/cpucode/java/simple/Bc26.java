package com.cpucode.java.simple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 题目描述
 * 根据给出的三角形3条边a, b, c（0 < a, b, c < 100,000），计算三角形的周长和面积。
 * 输入描述:
 * 一行，三角形3条边（能构成三角形），中间用一个空格隔开。
 * 输出描述:
 * 一行，三角形周长和面积（保留两位小数），中间用一个空格隔开，输出具体格式详见输出样例。
 * 示例1
 * 输入
 * 3 3 3
 * 输出
 * circumference=9.00 area=3.90
 *
 * @author : cpucode
 * @Date : 2021/1/18
 * @Time : 9:23
 * @Github : https://github.com/CPU-Code
 * @CSDN : https://blog.csdn.net/qq_44226094
 */
public class Bc26 {
    public static void main(String[] args) throws IOException {
        test1();
    }

    private static void test1() throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] str = bf.readLine().split(" ");
        float girth = 0;
        double area = 0;

        float a = Float.parseFloat(str[0]);
        float b = Float.parseFloat(str[1]);
        float c = Float.parseFloat(str[2]);

        girth = a + b + c;

        float p = girth/2;

        area = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        System.out.printf("circumference=%.2f area=%.2f", girth, area);
    }
}
