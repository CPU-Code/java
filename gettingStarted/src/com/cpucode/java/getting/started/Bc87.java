package com.cpucode.java.getting.started;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 题目描述
 * 输入n科成绩（浮点数表示），统计其中的最高分，最低分以及平均分。
 *
 * 输入描述:
 * 两行，
 *
 * 第1行，正整数n（1≤n≤100）
 *
 * 第2行，n科成绩（范围0.0~100.0），用空格分隔。
 * 输出描述:
 * 输出一行，三个浮点数，分别表示，最高分，最低分以及平均分（小数点后保留2位），用空格分隔。
 * 示例1
 * 输入
 * 5
 * 99.5 100.0 22.0 60.0 88.5
 * 输出
 * 100.00 22.00 74.00
 *
 * @author : cpucode
 * @Date : 2021/1/16
 * @Time : 20:28
 * @Github : https://github.com/CPU-Code
 * @CSDN : https://blog.csdn.net/qq_44226094
 */
public class Bc87 {
    public static void main(String[] args) throws IOException{
        test1();
    }

    private static void test1() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        int size = Integer.parseInt(str);
        float max = 0;
        float min = 100;
        float sum = 0;

        String[] str2 = bf.readLine().split(" ");

        for(int i = 0; i < size; i++){
            float num = Float.parseFloat(str2[i]);

            sum += num;

            if(num < min){
                min = num;
            }

            if(num > max){
                max = num;
            }
        }
        System.out.printf("%.2f %.2f %.2f",max, min, sum/size);
    }
}
