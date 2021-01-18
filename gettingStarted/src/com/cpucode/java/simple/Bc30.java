package com.cpucode.java.simple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 题目描述
 * BoBo买了一箱酸奶，里面有n盒未打开的酸奶，KiKi喜欢喝酸奶，第一时间发现了酸奶。KiKi每h分钟能喝光一盒酸奶，
 * 并且KiKi在喝光一盒酸奶之前不会喝另一个，那么经过m分钟后还有多少盒未打开的酸奶？
 *
 * 输入描述:
 * 多组输入，每组输入仅一行，包括n，h和m（均为整数）。输入数据保证m <= n * h。
 * 输出描述:
 * 针对每组输入，输出也仅一行，剩下的未打开的酸奶盒数。
 * 示例1
 * 输入
 * 8 5 16
 * 输出
 * 4
 *
 * @author : cpucode
 * @Date : 2021/1/18
 * @Time : 10:23
 * @Github : https://github.com/CPU-Code
 * @CSDN : https://blog.csdn.net/qq_44226094
 */
public class Bc30 {
    public static void main(String[] args) throws IOException{
        test1();
    }

    private static void test1() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] str = bf.readLine().split(" ");

        int n = Integer.parseInt(str[0]);
        int h = Integer.parseInt(str[1]);
        int m = Integer.parseInt(str[2]);
        int d = 0;

        if(m % h == 0){
            d = n - m / h;
        }else{
            d = n - m/h - 1;
        }

        System.out.println(d);
    }
}
