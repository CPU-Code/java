package com.cpucode.java.simple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 题目描述
 * 输入一个十六进制数a，和一个八进制数b，输出a+b的十进制结果（范围-231~231-1）。
 * 输入描述:
 * 一行，一个十六进制数a，和一个八进制数b，中间间隔一个空格。
 * 输出描述:
 * 一行，a+b的十进制结果。
 * 示例1
 * 输入
 * 0x12 05
 * 输出
 * 23
 *备注:
 * 十六进制Hexadecimal一般以0x开头，例如0xFF。八进制Octal，一般以0开头，例如07。
 *
 * @author : cpucode
 * @Date : 2021/1/18
 * @Time : 10:59
 * @Github : https://github.com/CPU-Code
 * @CSDN : https://blog.csdn.net/qq_44226094
 */
public class Bc34 {
    public static void main(String[] args) throws IOException {
        test1();
    }

    private static void test1() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] str = bf.readLine().split(" ");
        int num = 0;

        int a = Integer.parseInt(str[0].substring(2), 16);
        int b = Integer.parseInt(str[1], 8);
        num = a + b;

        System.out.println(num);
    }
}
