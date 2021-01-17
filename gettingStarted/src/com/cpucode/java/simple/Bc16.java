package com.cpucode.java.simple;

import java.io.IOException;

/**
 * 题目描述
 * BoBo教KiKi字符常量或字符变量表示的字符在内存中以ASCII码形式存储。BoBo出了一个问题给KiKi，输入一个字符，输出该字符相应的ASCII码。
 * 输入描述:
 * 一行，一个字符。
 * 输出描述:
 * 一行，输出输入字符对应的ASCII码。
 * 示例1
 * 输入
 * c
 * 输出
 * 99
 *
 * @author : cpucode
 * @Date : 2021/1/17
 * @Time : 22:39
 * @Github : https://github.com/CPU-Code
 * @CSDN : https://blog.csdn.net/qq_44226094
 */
public class Bc16 {
    public static void main(String[] args) throws IOException {
        test1();
    }

    private static void test1() throws IOException{
        char c = (char) System.in.read();

        System.out.println((int)c);
    }
}
