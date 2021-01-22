package com.cpucode.java.simple;

/**
 * 题目描述
 * 变种水仙花数 - Lily Number：把任意的数字，从中间拆分成两个数字，比如1461 可以拆分成（1和461）,
 * （14和61）,（146和1),如果所有拆分后的乘积之和等于自身，则是一个Lily Number。
 *
 * 例如：
 *
 * 655 = 6 * 55 + 65 * 5
 *
 * 1461 = 1*461 + 14*61 + 146*1
 *
 * 求出 5位数中的所有 Lily Number。
 *
 * 输入描述:
 * 无
 * 输出描述:
 * 一行，5位数中的所有 Lily Number，每两个数之间间隔一个空格。
 *
 * @author : cpucode
 * @Date : 2021/1/22
 * @Time : 10:23
 * @Github : https://github.com/CPU-Code
 * @CSDN : https://blog.csdn.net/qq_44226094
 */
public class Bc38 {
    public static void main(String[] args){
        test1();
    }

    private static void test1(){
        int start = 10000;
        int end = 99999;

        for(int i = start; i <= end; i++){
            int sum = (i / 10000) * (i % 10000) +
                    (i / 1000) * (i % 1000) +
                    (i / 100) * (i % 100) +
                    (i / 10) * (i % 10);

            if(i == sum){
                System.out.print(sum + " ");
            }
        }
    }
}

/**
 * 14610 16420 23610 34420 65500
 * */