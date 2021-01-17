package com.cpucode.java.getting.started;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 题目描述
 * 小乐乐获得4个最大数，请帮他编程找到最大的数。
 * 输入描述:
 * 一行，4个整数，用空格分开。
 * 输出描述:
 * 一行，一个整数，为输入的4个整数中最大的整数。
 * 示例1
 * 输入
 * 5 8 2 5
 * 输出
 * 8
 *
 * @author : cpucode
 * @Date : 2021/1/16
 * @Time : 23:00
 * @Github : https://github.com/CPU-Code
 * @CSDN : https://blog.csdn.net/qq_44226094
 */
public class Bc123 {
    public static void main(String[] args) throws IOException{
        //test1();
        test2();
    }

    private static void test1() throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] str = null;
        str = bf.readLine().split(" ");

        int max = 0;
        for(int i = 0; i < str.length; i++){
            int num = Integer.parseInt(str[i]);

            if(num > max){
                max = num;
            }
        }

        System.out.println(max);
    }

    private static void test2() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] strs = bf.readLine().split(" ");
        List<Integer> list = new ArrayList<Integer>();

        for(String s : strs){
            list.add(Integer.parseInt(s));
        }
        Collections.sort(list);

        System.out.println(list.get(strs.length -1));
    }
}
