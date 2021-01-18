package com.cpucode.java.simple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 题目描述
 * 从键盘任意输入一个字符，编程判断是否是字母（包括大小写）。
 * 输入描述:
 * 多组输入，每行输入包括一个字符。
 * 输出描述:
 * 针对每行输入，输出该字符是字母（YES）或不是（NO）。
 * 示例1
 * 输入
 * H
 * 9
 * 输出
 * YES
 * NO
 *
 * @author : cpucode
 * @Date : 2021/1/18
 * @Time : 11:17
 * @Github : https://github.com/CPU-Code
 * @CSDN : https://blog.csdn.net/qq_44226094
 */
public class Bc35 {
    public static void main(String[] args) throws IOException {
        test1();
    }

    private static void test1() throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = null;

        while((str = bf.readLine()) != null){
            char c = str.charAt(0);

            if(c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z'){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
