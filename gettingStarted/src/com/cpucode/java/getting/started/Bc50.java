package com.cpucode.java.getting.started;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 题目描述
 * KiKi最近学习了信号与系统课程，这门课里有一个非常有趣的函数，单位阶跃函数，其中一种定义方式为：
 *
 * 现在试求单位冲激函数在时域t上的值。
 *
 * 输入描述:
 * 题目有多组输入数据，每一行输入一个t(-1000<t<1000)表示函数的时域t。
 * 输出描述:
 * 输出函数的值并换行。
 * 示例1
 * 输入
 * 11
 * 0
 * -11
 * 输出
 * 1
 * 0.5
 * 0
 *
 * @author : cpucode
 * @Date : 2021/1/16
 * @Time : 17:30
 * @Github : https://github.com/CPU-Code
 * @CSDN : https://blog.csdn.net/qq_44226094
 */
public class Bc50 {
    public static void main(String[] args) throws IOException {
        test1();
    }

    private static void test1() throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = null;

        while((str = bf.readLine()) != null){
            int num = Integer.parseInt(str);

            if(num > 0){
                System.out.println(1);
            }else if(num == 0){
                System.out.println(0.5);
            } else {
                System.out.println(0);
            }
        }
    }
}
