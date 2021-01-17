package com.cpucode.java.getting.started;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 题目描述
 * 小乐乐输入百分制成绩，他想将成绩转换成等级制。转换规则为：90-100为’A’，80-89为’B’，70-79为’C’，60-69为’D’，59以下为’E’。
 * 如果输入的成绩不在0-100之间，输出’F’。
 * 输入描述:
 * 一行，一个整数表示的成绩。
 * 输出描述:
 * 一行，转换后的等级。
 * 示例1
 * 输入
 * 78
 * 输出
 * C
 *
 * @author : cpucode
 * @Date : 2021/1/17
 * @Time : 11:35
 * @Github : https://github.com/CPU-Code
 * @CSDN : https://blog.csdn.net/qq_44226094
 */
public class Bc125 {
    public static void main(String[] args) throws IOException {
        test1();
    }

    public static void test1() throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        int num = Integer.parseInt(str);
        int a = 90;
        int b = 80;
        int c = 70;
        int d = 60;
        int f = 0;

        if(num > a + 10 || num < f){
            System.out.println("F");
        }else if(num >= a){
            System.out.println("A");
        }else if(num >= b){
            System.out.println("B");
        } else if(num >= c){
            System.out.println("C");
        }else if(num >= d){
            System.out.println("D");
        }else{
            System.out.println("E");
        }
    }
}
