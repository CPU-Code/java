package com.cpucode.java.simple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Arrays;

/**
 * 题目描述
 * 期中考试开始了，大家都想取得好成绩，争夺前五名。从键盘输入n个学生成绩（不超过40个），输出每组排在前五高的成绩。
 *
 * 输入描述:
 * 两行，第一行输入一个整数，表示n个学生（>=5），第二行输入n个学生成绩（整数表示，范围0~100），用空格分隔。
 * 输出描述:
 * 一行，输出成绩最高的前五个，用空格分隔。
 * 示例1
 * 输入
 * 6
 * 99 45 78 67 72 88
 * 输出
 * 99 88 78 72 67
 *
 * @author : cpucode
 * @Date : 2021/1/22
 * @Time : 10:42
 * @Github : https://github.com/CPU-Code
 * @CSDN : https://blog.csdn.net/qq_44226094
 */
public class Bc39 {
    public static void main(String[] args) throws IOException{
        test1();
    }

    private static void test1() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bf.readLine());

        String[] str = bf.readLine().split(" ");
        Integer[] arr = new Integer[num];

        for(int i = 0; i < num; i++){
            arr[i] = Integer.parseInt(str[i]);
        }

        Arrays.sort(arr, Collections.reverseOrder());

        for(int i = 0; i < 5; i++){
            System.out.print(arr[i] + " ");
        }

    }
}
