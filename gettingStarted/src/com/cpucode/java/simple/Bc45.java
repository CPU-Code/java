package com.cpucode.java.simple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 题目描述
 * KiKi参加了语文、数学、外语的考试，请帮他判断三科中的最高分。从键盘任意输入三个整数表示的分数，编程判断其中的最高分。
 * 输入描述:
 * 多组输入，每行输入包括三个整数表示的分数（0~100），用空格分隔。
 * 输出描述:
 * 针对每行输入，输出为一行，即三个分数中的最高分。
 * 示例1
 * 输入
 * 94 98 99
 * 100 88 60
 * 输出
 * 99
 * 100
 *
 * @author : cpucode
 * @Date : 2021/1/22
 * @Time : 11:51
 * @Github : https://github.com/CPU-Code
 * @CSDN : https://blog.csdn.net/qq_44226094
 */
public class Bc45 {
    public static void main(String[] args) throws IOException {
        test1();
    }

    private static void test1() throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = null;

        while((str = bf.readLine()) != null){
            String[] values = str.split(" ");
            int max = 0;

            for(String s : values){
                if(Integer.parseInt(s) > max){
                    max = Integer.parseInt(s);
                }
            }

            System.out.println(max);
        }
    }
}
