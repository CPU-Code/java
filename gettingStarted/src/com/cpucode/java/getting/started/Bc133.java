package com.cpucode.java.getting.started;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 题目描述
 * 2020年来到了，KiKi要对他的n位好朋友说n遍”Happy new year!Good luck!”的祝福语。
 *
 * 输入描述:
 * 输入只有一行，其中含有一个正整数 n(1≤n≤20)，代表KiKi说祝福话的遍数。
 *
 * 输出描述:
 * 输出 n行"Happy new year!Good luck!"。
 *
 * 示例1
 * 输入
 * 2
 * 输出
 * Happy new year!Good luck!
 * Happy new year!Good luck!
 *
 * @author : cpucode
 * @Date : 2021/1/17
 * @Time : 11:56
 * @Github : https://github.com/CPU-Code
 * @CSDN : https://blog.csdn.net/qq_44226094
 */
public class Bc133 {
    public static void main(String[] args) throws IOException {
        test1();
    }

    private static void test1() throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();

        int num = Integer.parseInt(str);
        for(int i = 0; i < num; i++){
            System.out.println("Happy new year!Good luck!");
        }
    }
}
