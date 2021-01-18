package com.cpucode.java.simple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 题目描述
 * BMI指数（即身体质量指数）是用体重公斤数除以身高米数平方得出的数字，是目前国际上常用的衡量人体胖瘦程度以及是否健康的一个标准。
 * 例如：一个人的身高为1.75米，体重为68千克，他的BMI=68/(1.75^2)=22.2（千克/米^2）。
 * 当BMI指数为18.5～23.9时属正常，否则表示身体存在健康风险。编程判断人体健康情况。
 *
 * 输入描述:
 * 一行，输入一个人的体重（千克）和身高（米），中间用一个空格分隔。
 * 输出描述:
 * 一行，输出身体Normal(正常)或Abnormal(不正常)。
 * 示例1
 * 输入
 * 68 1.75
 * 输出
 * Normal
 * 示例2
 * 输入
 * 67.5 1.65
 * 输出
 * Abnormal
 *
 * @author : cpucode
 * @Date : 2021/1/18
 * @Time : 12:14
 * @Github : https://github.com/CPU-Code
 * @CSDN : https://blog.csdn.net/qq_44226094
 */
public class Bc36 {
    public static void main(String[] args) throws IOException {
        test1();
    }

    private static void test1() throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = null;

        while((str = bf.readLine()) != null){
            String[] str1 = str.split(" ");

            double kg = Double.parseDouble(str1[0]);
            double area = Double.parseDouble(str1[1]);

            double bmi = kg / Math.pow(area, 2);
            double bmiMax = 23.9;
            double bmiMin = 18.5;

            if(bmi <= bmiMin || bmi >= bmiMax){
                System.out.println("Abnormal");
            }else{
                System.out.println("Normal");
            }
        }
    }
}
