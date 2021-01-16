package com.cpucode.java.getting.started;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 题目描述
 * KiKi现在得到一个包含n*m个数的整数序列，现在他需要把这n*m个数按顺序规划成一个n行m列的矩阵并输出，请你帮他完成这个任务。
 * 输入描述:
 * 一行，输入两个整数n和m，用空格分隔，第二行包含n*m个整数（范围-231~231-1）。(1≤n≤10, 1≤m≤10)
 * 输出描述:
 * 输出规划后n行m列的矩阵，每个数的后面有一个空格。
 * 示例1
 * 输入
 * 2 3
 * 1 2 3 4 5 6
 * 输出
 * 1 2 3
 * 4 5 6
 *
 * @author : cpucode
 * @Date : 2021/1/16
 * @Time : 22:26
 * @Github : https://github.com/CPU-Code
 * @CSDN : https://blog.csdn.net/qq_44226094
 */
public class Bc103 {
    public static void main(String[] args) throws IOException{
        test1();
    }

    private static void test1() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] str = null;

        str = bf.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);
        int count = 0;

        str = bf.readLine().split(" ");

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(Integer.parseInt(str[count]) + " ");
                count++;
            }
            System.out.println();
        }
    }
}
