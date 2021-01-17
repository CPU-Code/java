package com.cpucode.java.simple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 题目描述
 * 输入一个字符，用它构造一个三角形金字塔。
 * 输入描述:
 * 输入只有一行，一个字符。
 * 输出描述:
 * 该字符构成的三角形金字塔。
 * 示例1
 * 输入
 * 1
 * 输出
 *     1
 *    1 1
 *   1 1 1
 *  1 1 1 1
 * 1 1 1 1 1
 *
 * @author : cpucode
 * @Date : 2021/1/17
 * @Time : 16:18
 * @Github : https://github.com/CPU-Code
 * @CSDN : https://blog.csdn.net/qq_44226094
 */
public class Bc12 {
    public static void main(String[] args) throws IOException{
        test1();
        //test2();
    }

    public static void test1() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        int num = 5;

        for(int i = 1; i <= num ; i++){
            for(int j = 1; j <= num - i; j++){
                System.out.print(" ");
            }

            for(int k = 1; k <= i; k++){
                System.out.print(str + " ");
            }

            System.out.println();
        }
    }

    public static void test2() throws IOException{
        char c = (char)System.in.read();
        int num = 5;

        for(int i = 1; i <= num ; i++){
            for(int j = 1; j <= num - i; j++){
                System.out.print(" ");
            }

            for(int k = 1; k <= i; k++){
                System.out.print(c + " ");
            }

            System.out.println();
        }
    }
}
