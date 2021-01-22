package com.cpucode.java.simple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 题目描述
 * 假设你们社团要竞选社长，有两名候选人分别是A和B，社团每名同学必须并且只能投一票，最终得票多的人为社长.
 * 输入描述:
 * 一行，字符序列，包含A或B，输入以字符0结束。
 * 输出描述:
 * 一行，一个字符，A或B或E，输出A表示A得票数多，输出B表示B得票数多，输出E表示二人得票数相等。
 * 示例1
 * 输入
 * ABBABBAAB0
 * 输出
 * B
 *
 * @author : cpucode
 * @Date : 2021/1/22
 * @Time : 11:24
 * @Github : https://github.com/CPU-Code
 * @CSDN : https://blog.csdn.net/qq_44226094
 */
public class Bc40 {
    public static void main(String[] args) throws IOException {
        test1();
    }

    public static void test1() throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        char[] chars = str.toCharArray();

        int a = 0;
        int b = 0;

        for(char c : chars){
            if(c == 'A'){
                a++;
            }

            if(c == 'B'){
                b++;
            }
        }

        if(a > b){
            System.out.println("A");
        }else if(a < b){
            System.out.println("B");
        } else{
            System.out.println("E");
        }
    }
}
