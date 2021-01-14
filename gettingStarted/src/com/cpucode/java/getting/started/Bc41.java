package com.cpucode.java.getting.started;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 题目描述
 * 据说智商140以上者称为天才，KiKi想知道他自己是不是天才，请帮他编程判断。输入一个整数表示一个人的智商，
 * 如果大于等于140，则表明他是一个天才，输出“Genius”。
 *
 * 输入描述:
 * 多组输入，每行输入包括一个整数表示的智商。
 * 输出描述:
 * 针对每行输入，输出“Genius”。
 * 示例1
 * 输入
 * 160
 * 输出
 * Genius
 *
 * @author : cpucode
 * @Date : 2021/1/14
 * @Time : 21:01
 * @Github : https://github.com/CPU-Code
 * @CSDN : https://blog.csdn.net/qq_44226094
 */
public class Bc41 {
    public static void main(String[] args) throws IOException {
        //test1();
        test2();
    }

    private static void test1() throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        int compare = 140;

        int num = Integer.parseInt(str);

        if(num >= compare){
            System.out.println("Genius");
        }
    }

    private static void test2() throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int compare = 140;

        String str = bf.readLine();
        String sult = Integer.parseInt(str) >= compare ? "Genius" : "";

        System.out.println(sult);
    }
}
