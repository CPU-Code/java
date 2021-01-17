package com.cpucode.java.simple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 题目描述
 *   问题：KiKi今年5岁了，已经能够认识100以内的非负整数，并且并且能够进行 100 以内的非负整数的加法计算。
 *   不过，BoBo老师发现KiKi在进行大于等于100的正整数的计算时，规则如下：
 *
 * 1. 只保留该数的最后两位，例如：对KiKi来说1234等价于34；
 *
 * 2. 如果计算结果大于等于 100， 那么KIKI也仅保留计算结果的最后两位，如果此两位中十位为0，则只保留个位。
 *
 * 例如：45+80 = 25
 *
 * 要求给定非负整数 a和 b，模拟KiKi的运算规则计算出 a+b 的值。
 *
 * 输入描述:
 * 一行，输入两个非负整数a和b，用一个空格分隔。（0 <= a,b<= 231-1）。
 * 输出描述:
 * 针对每组输入，输出按照KiKi的运算规则计算出 a+b 的值。
 * 示例1
 * 输入
 * 45 80
 * 输出
 * 25
 *
 * @author : cpucode
 * @Date : 2021/1/17
 * @Time : 22:49
 * @Github : https://github.com/CPU-Code
 * @CSDN : https://blog.csdn.net/qq_44226094
 */
public class Bc20 {
    public static void main(String[] args) throws IOException {
        test1();
    }

    private static void test1() throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] str = bf.readLine().split(" ");
        int num = 0;
        int remains = 100;

        for(String s : str){
            num += Integer.parseInt(s);
        }

        System.out.println(num%remains);
    }
}
