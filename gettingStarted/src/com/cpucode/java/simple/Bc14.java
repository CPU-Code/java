package com.cpucode.java.simple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 题目描述
 * 输入一个人的出生日期（包括年月日），将该生日中的年、月、日分别输出。
 * 输入描述:
 * 输入只有一行，出生日期，包括年月日，年月日之间的数字没有分隔符。
 * 输出描述:
 * 三行，第一行为出生年份，第二行为出生月份，第三行为出生日期。输出时如果月份或天数为1位数，需要在1位数前面补0。
 * 示例1
 * 输入
 * 20130225
 * 输出
 * year=2013
 * month=02
 * date=25
 * 备注:
 * 通过scanf函数的%m格式控制可以指定输入域宽，输入数据域宽（列数），按此宽度截取所需数据；
 * 通过printf函数的%0格式控制符，输出数值时指定左面不使用的空位置自动填0。
 *
 * @author : cpucode
 * @Date : 2021/1/17
 * @Time : 21:48
 * @Github : https://github.com/CPU-Code
 * @CSDN : https://blog.csdn.net/qq_44226094
 */
public class Bc14 {
    public static void main(String[] args) throws IOException{
        test1();
    }

    private static void test1() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();

        String year = str.substring(0, 4);
        String month = str.substring(4, 6);
        String date = str.substring(6, 8);

        System.out.println("year=" + year);
        System.out.println("month=" + month);
        System.out.println("date=" + date);
    }
}
