package com.cpucode.java.simple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 题目描述
 * 不使用累计乘法的基础上，通过移位运算（<<）实现2的n次方的计算。
 *
 * 输入描述:
 * 多组输入，每一行输入整数n（0 <= n < 31）。
 * 输出描述:
 * 针对每组输入输出对应的2的n次方的结果。
 * 示例1
 * 输入
 * 2
 * 10
 * 输出
 * 4
 * 1024
 *
 * @author : cpucode
 * @Date : 2021/1/18
 * @Time : 10:14
 * @Github : https://github.com/CPU-Code
 * @CSDN : https://blog.csdn.net/qq_44226094
 */
public class Bc29 {
    public static void main(String[] args) throws IOException {
        //test1();
        test2();
    }

    private static void test1() throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = null;

        while((str = bf.readLine()) != null){
            int num = Integer.parseInt(str);

            System.out.println((int)Math.pow(2, num));
        }
    }

    private static void test2() throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = null;

        while((str = bf.readLine()) != null){
            int num = Integer.parseInt(str);

            System.out.println(2 << (num - 1));
        }
    }
}
