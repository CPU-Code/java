package com.cpucode.java.getting.started;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 题目描述
 * 从键盘输入5个人的身高（米），求他们的平均身高（米）。
 *
 * 输入描述:
 * 一行，连续输入5个身高（范围0.00~2.00），用空格分隔。
 * 输出描述:
 * 一行，输出平均身高，保留两位小数。
 * 示例1
 * 输入
 * 1.68 1.75 1.82 1.60 1.92
 * 输出
 * 1.75
 *
 * @author : cpucode
 * @Date : 2021/1/16
 * @Time : 18:55
 * @Github : https://github.com/CPU-Code
 * @CSDN : https://blog.csdn.net/qq_44226094
 */
public class Bc72 {
    public static void main(String[] args) throws IOException {
        test1();
    }

    private static void test1() throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        String[] str1 = null;
        float sum = 0;

        while((str = bf.readLine()) != null){

            str1 = str.split(" ");
            for(int i = 0; i < str1.length; i++){
                float num = Float.parseFloat(str1[i]);
                sum += num;
            }

            System.out.printf("%.2f", sum/str1.length);
        }
    }
}
