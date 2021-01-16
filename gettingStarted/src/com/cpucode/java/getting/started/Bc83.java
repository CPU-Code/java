package com.cpucode.java.getting.started;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 题目描述
 * 判断一个整数是否能5整除是一个挺简单的问题，懒惰的KiKi还是不想自己做，于是找到你帮他写代码，你就帮帮他吧。
 *
 * 输入描述:
 * 输入包括一个整数M（1≤M≤100,000）。
 * 输出描述:
 * 输出包括一行，如果M可以被5整除就输出YES，否则输出NO（结果大小写敏感）。
 * 示例1
 * 输入
 * 10
 * 输出
 * YES
 *
 * @author : cpucode
 * @Date : 2021/1/16
 * @Time : 19:58
 * @Github : https://github.com/CPU-Code
 * @CSDN : https://blog.csdn.net/qq_44226094
 */
public class Bc83 {
    public static void main(String[] args) throws IOException {
        test1();
    }

    private static void test1() throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = null;

        while((str = bf.readLine()) != null){
            int num = Integer.parseInt(str);

            if(num % 5 == 0){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
