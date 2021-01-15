package com.cpucode.java.getting.started;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 题目描述
 * KiKi想知道一个整数的奇偶性，请帮他判断。从键盘任意输入一个整数（范围-231~231-1），编程判断它的奇偶性。
 * 输入描述:
 * 多组输入，每行输入包括一个整数。
 * 输出描述:
 * 针对每行输入，输出该数是奇数（Odd）还是偶数（Even）。
 * 示例1
 * 输入
 * 4
 * 7
 * 输出
 * Even
 * Odd
 *
 * @author : cpucode
 * @Date : 2021/1/14
 * @Time : 22:16
 * @Github : https://github.com/CPU-Code
 * @CSDN : https://blog.csdn.net/qq_44226094
 */
public class Bc44 {
    public static void main(String[] args) throws IOException {
        //test1();
        test2();
    }

    private static void test1() throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = null;

        while((str = bf.readLine()) != null){
            int num = Integer.parseInt(str);

            if(num % 2 != 0){
                System.out.println("Odd");
            }else{
                System.out.println("Even");
            }
        }
    }

    private static void test2() throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = null;

        while((str = bf.readLine()) != null){
            int num = Integer.parseInt(str);

            System.out.println(num % 2 != 0 ? "Odd" : "Even");
        }
    }
}
