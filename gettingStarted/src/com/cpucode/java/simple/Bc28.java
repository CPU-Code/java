package com.cpucode.java.simple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 题目描述
 * 实现字母的大小写转换。多组输入输出。
 * 输入描述:
 * 多组输入，每一行输入大写字母。
 * 输出描述:
 * 针对每组输入输出对应的小写字母。
 * 示例1
 * 输入
 * A
 * B
 * 输出
 * a
 * b
 * 备注:
 * 多组输入过程中要注意“回车”也是字母，所以要“吸收”(getchar())掉该字母。
 *
 * @author : cpucode
 * @Date : 2021/1/18
 * @Time : 9:58
 * @Github : https://github.com/CPU-Code
 * @CSDN : https://blog.csdn.net/qq_44226094
 */
public class Bc28 {
    public static void main(String[] args) throws IOException {
        test1();
    }

    private static void test1() throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = null;

        while((str = bf.readLine()) != null){

            System.out.println(str.toLowerCase());
        }
    }
}
