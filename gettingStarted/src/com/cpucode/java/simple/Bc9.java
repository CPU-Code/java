package com.cpucode.java.simple;

/**
 * 题目描述
 * KiKi写了一个输出“Hello world!”的程序，BoBo老师告诉他printf函数有返回值，你能帮他写个程序输出printf(“Hello world!”)的返回值吗？
 * 输入描述:
 * 无
 * 输出描述:
 * 包括两行：
 * 第一行为“Hello world!”
 * 第二行为printf(“Hello world!”)调用后的返回值。
 *
 * @author : cpucode
 * @Date : 2021/1/17
 * @Time : 15:02
 * @Github : https://github.com/CPU-Code
 * @CSDN : https://blog.csdn.net/qq_44226094
 */
public class Bc9 {
    public static void main(String[] args){
        test1();
    }

    private static void test1(){
        String str = "Hello world!";

        System.out.println(str);
        System.out.println(str.length());
    }
}
