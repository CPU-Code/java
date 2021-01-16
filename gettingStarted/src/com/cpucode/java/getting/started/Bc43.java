package com.cpucode.java.getting.started;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 题目描述
 * KiKi想知道他的考试分数是否通过，请帮他判断。从键盘任意输入一个整数表示的分数，编程判断该分数是否在及格范围内，
 * 如果及格，即：分数大于等于60分，是输出“Pass”，否则，输出“Fail”。
 *
 * 输入描述:
 * 多组输入，每行输入包括一个整数表示的分数（0~100）。
 * 输出描述:
 * 针对每行输入，输出“Pass”或“Fail”。
 * 示例1
 * 输入
 * 94
 * 输出
 * Pass
 *
 * @author : cpucode
 * @Date : 2021/1/14
 * @Time : 22:11
 * @Github : https://github.com/CPU-Code
 * @CSDN : https://blog.csdn.net/qq_44226094
 */
public class Bc43 {
    public static void main(String[] args) throws IOException{
        test1();
    }

    private static void test1() throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = null;

        while((str = bf.readLine()) != null){
            int num = Integer.parseInt(str);

            if(num >= 60){
                System.out.println("Pass");
            } else{
                System.out.println("Fail");
            }
        }
    }
}
