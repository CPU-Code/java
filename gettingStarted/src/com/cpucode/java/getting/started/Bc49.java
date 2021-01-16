package com.cpucode.java.getting.started;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 题目描述
 * KiKi想知道从键盘输入的两个数的大小关系，请编程实现。
 * 输入描述:
 * 题目有多组输入数据，每一行输入两个整数（范围（1 ~231-1），用空格分隔。
 * 输出描述:
 * 针对每行输入，输出两个整数及其大小关系，数字和关系运算符之间没有空格，详见输入输出样例。
 * 示例1
 * 输入
 * 1 1
 * 输出
 * 1=1
 *
 * @author : cpucode
 * @Date : 2021/1/16
 * @Time : 16:22
 * @Github : https://github.com/CPU-Code
 * @CSDN : https://blog.csdn.net/qq_44226094
 */
public class Bc49 {
    public static void main(String[] args) throws IOException {
        test1();
    }

    private static void test1() throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] str = bf.readLine().split(" ");

        int num = Integer.parseInt(str[0]);
        int num1 = Integer.parseInt(str[1]);

        if(num > num1){
            System.out.println(num + ">" + num1);
        } else if(num == num1){
            System.out.println(num + "=" + num1);
        }else{
            System.out.println(num + "<" + num1);
        }
    }
}
