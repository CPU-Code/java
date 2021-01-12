package com.cpucode.java.getting.started;

/**
 * 题目描述
 * 1
 * 请计算表达式“(-8+22)×a-10+c÷2”，其中，a = 40，c = 212。
 *
 * 输入描述:
 * 无。
 * 输出描述:
 * (-8+22)×a-10+c÷2计算之后的结果，为一个整数。
 *
 * @author : cpucode
 * @Date : 2021/1/12
 * @Time : 20:41
 * @Github : https://github.com/CPU-Code
 * @CSDN : https://blog.csdn.net/qq_44226094
 */
public class Bc17 {
    public static void main(String[] args) {
        test1(40, 212);
    }

    private static void test1(double a, double c){
        System.out.println((int)((-8 + 22) * a - 10 + c / 2));
    }
}
