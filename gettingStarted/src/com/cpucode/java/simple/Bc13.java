package com.cpucode.java.simple;

/**
 * 题目描述
 * BoBo教KiKi字符常量或字符变量表示的字符在内存中以ASCII码形式存储。BoBo出了一个问题给KiKi，转换以下ASCII码为对应字符并输出他们。
 *
 * 73, 32, 99, 97, 110, 32, 100, 111, 32, 105, 116 , 33
 *
 * 输入描述:
 * 无
 * 输出描述:
 * 转换输出题目中给出的所有ASCII到对应的字符。
 *
 * @author : cpucode
 * @Date : 2021/1/17
 * @Time : 21:43
 * @Github : https://github.com/CPU-Code
 * @CSDN : https://blog.csdn.net/qq_44226094
 */
public class Bc13 {
    public static void main(String[] args){
        test1();
    }

    private static void test1(){
        char[] cs = {73, 32, 99, 97, 110, 32, 100, 111, 32, 105, 116, 33};

        for(char c : cs){
            System.out.print(c);
        }
    }
}
