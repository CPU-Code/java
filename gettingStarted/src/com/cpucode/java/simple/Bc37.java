package com.cpucode.java.simple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 题目描述
 * KiKi非常喜欢网购，在一家店铺他看中了一件衣服，他了解到，如果今天是“双11”（11月11日）则这件衣服打7折，
 * “双12” （12月12日）则这件衣服打8折，如果有优惠券可以额外减50元（优惠券只能在双11或双12使用），求KiKi最终所花的钱数。
 * 输入描述:
 * 一行，四个数字，第一个数表示小明看中的衣服价格，第二和第三个整数分别表示当天的月份、
 * 当天的日期、第四个整数表示是否有优惠券（有优惠券用1表示，无优惠券用0表示）。
 *
 * 输出描述:
 * 一行，小明实际花的钱数（保留两位小数）。（提示：不要指望商家倒找你钱）
 * 示例1
 * 输入
 * 1000.0 11 11 1
 * 输出
 * 650.00
 * 示例2
 * 输入
 * 999.8 12 12 0
 * 输出
 * 799.84
 * 示例3
 * 输入
 * 66.6 11 11 1
 * 输出
 * 0.00
 *
 * @author : cpucode
 * @Date : 2021/1/18
 * @Time : 14:36
 * @Github : https://github.com/CPU-Code
 * @CSDN : https://blog.csdn.net/qq_44226094
 */
public class Bc37 {
    public static void main(String[] args) throws IOException {
        test1();
    }

    private static void test1() throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        float num = 0;

        while((str = bf.readLine()) != null){
            String[] str1 = str.split(" ");

            float money = Float.parseFloat(str1[0]);
            int month = Integer.parseInt(str1[1]);
            int day = Integer.parseInt(str1[2]);
            int coupon = Integer.parseInt(str1[3]);

            if(month == 11 && day == 11){
                money *= 0.7;

                if(1 == coupon){
                    money -= 50;
                }
            }else if(month == 12 && day == 12){
                money *= 0.8;

                if(1 == coupon){
                    money -= 50;
                }
            }

            if(money < 0){
                money = 0;
            }

            System.out.printf("%.2f", money);
        }
    }
}
