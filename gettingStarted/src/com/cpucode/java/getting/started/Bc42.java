package com.cpucode.java.getting.started;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 题目描述
 * KiKi想知道他的考试成绩是否完美，请帮他判断。从键盘输入一个整数表示的成绩，编程判断成绩是否在90~100之间，如果是则输出“Perfect”。
 *
 * 输入描述:
 * 多组输入，每行输入包括一个整数表示的成绩（90~100）。
 * 输出描述:
 * 针对每行输入，输出“Perfect”。
 * 示例1
 * 输入
 * 98
 * 输出
 * Perfect
 *
 * @author : cpucode
 * @Date : 2021/1/14
 * @Time : 21:03
 * @Github : https://github.com/CPU-Code
 * @CSDN : https://blog.csdn.net/qq_44226094
 */
public class Bc42 {
    public static void main(String[] args) throws IOException {
        test1();
    }

    private static void test1() throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        int num = Integer.parseInt(str);
        int compare = 90;
        int compare1 = 100;

        if( num > compare && num < compare1){
            System.out.println("Perfect");
        }
    }
}
