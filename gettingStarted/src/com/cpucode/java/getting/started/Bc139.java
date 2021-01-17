package com.cpucode.java.getting.started;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 题目描述
 * KiKi学习了面向对象技术，学会了通过封装属性（变量）和行为（函数）定义类，现在他要设计一个电子日历类TDate。
 * 它有3个私有数据成员：Month,Day,Year和若干个公有成员函数，要求：
 * （1）带有默认形参值的构造函数，默认值为0, 0, 0；
 * （2）输出日期函数，用“日/月/年”格式输出日期；
 * （3）设置日期函数，从键盘输入年、月、日。
 * 输入描述:
 * 一行，三个整数，用空格分隔，分别表示年、月、日。
 * 输出描述:
 * 一行，用“日/月/年”格式输出日期。
 * 示例1
 * 输入
 * 2019 12 30
 * 输出
 * 30/12/2019
 *
 * @author : cpucode
 * @Date : 2021/1/17
 * @Time : 13:01
 * @Github : https://github.com/CPU-Code
 * @CSDN : https://blog.csdn.net/qq_44226094
 */
public class Bc139 {
    public static void main(String[] args) throws IOException {
        test1();
    }

    private static void test1() throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] str = bf.readLine().split(" ");

        System.out.println(str[str.length -1 ] + "/" + str[str.length - 2] + "/" + str[str.length - 3]);
    }
}
