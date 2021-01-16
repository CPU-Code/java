package com.cpucode.java.getting.started;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 题目描述
 * KiKi学习了循环，BoBo老师给他出了一系列打印图案的练习，该任务是打印用“*”组成的线段图案。
 *
 * 输入描述:
 * 多组输入，一个整数（1~100），表示线段长度，即“*”的数量。
 * 输出描述:
 * 针对每行输入，输出占一行，用“*”组成的对应长度的线段。
 * 示例1
 * 输入
 * 10
 * 2
 * 输出
 * **********
 * **
 *
 * @author : cpucode
 * @Date : 2021/1/16
 * @Time : 17:49
 * @Github : https://github.com/CPU-Code
 * @CSDN : https://blog.csdn.net/qq_44226094
 */
public class Bc56 {
    public static void main(String[] args) throws IOException {
        //test1();
        test2();
    }

    private static void test1() throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = null;

        while((str = bf.readLine()) != null){
            int num = Integer.parseInt(str);

            for(int i = 0; i < num; i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void test2() throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = null;

        while((str = bf.readLine()) != null){
            StringBuilder sb = new StringBuilder();

            int num = Integer.parseInt(str);

            for(int i = 0; i < num; i++){
                sb.append("*");
            }
            System.out.println(sb.toString());
        }
    }
}
