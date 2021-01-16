package com.cpucode.java.getting.started;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 题目描述
 * 任意输入一个正整数N，统计1~N之间奇数的个数和偶数的个数，并输出。
 *
 * 输入描述:
 * 一行，一个正整数N。（1≤N≤100,000）
 * 输出描述:
 * 一行，1~N之间奇数的个数和偶数的个数，用空格分开。
 * 示例1
 * 输入
 * 5
 * 输出
 * 3 2
 *
 * @author : cpucode
 * @Date : 2021/1/16
 * @Time : 20:07
 * @Github : https://github.com/CPU-Code
 * @CSDN : https://blog.csdn.net/qq_44226094
 */
public class Bc86 {
    public static void main(String[] args) throws IOException{
        //test1();
        test2();
    }

    private static void test1() throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = null;

        str = bf.readLine();
        int num = Integer.parseInt(str);

        int odd = 0;
        int even = 0;

        for(int i = 1; i <= num; i++){
            if(i %2 == 0){
                even++;
            }else {
                odd++;
            }
        }

        System.out.println(odd + " " + even);
    }

    private static void test2() throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str =  bf.readLine();
        int num = Integer.parseInt(str);

        int even = num/2;
        int odd;

        if(num % 2 == 0){
            odd = even;
            System.out.println(odd + " " + even);
        }else{
            odd = even + 1;
            System.out.println(odd + " " + even);
        }
    }
}
