package com.cpucode.java.getting.started;

/**
 * 题目描述
 * 学生信息管理系统是学校教学管理的重要工具，现有一名学生基本信息如下：姓名-Jack，年龄-18，性别-Man，请按照输出样例的格式输出该学生的信息。
 * 输入描述:
 * 无
 * 输出描述:
 * 输出分为三行，分别为标题行，分隔行，信息行。
 * 第一行，标题行，每个标题之间间隔4个空格。
 * 第二行，分隔行，一共21个减号"-"。
 * 第三行，信息行，每列输出信息和标题首字母对齐。输出样例如下：
 * Name    Age    Gender
 * ---------------------
 * Jack    18     man
 *
 * @author : cpucode
 * @Date : 2021/1/14
 * @Time : 20:44
 * @Github : https://github.com/CPU-Code
 * @CSDN : https://blog.csdn.net/qq_44226094
 */
public class Bc32 {
    public static void main(String[] args){
        //test1();
        test2();
    }

    private static void test1(){
        System.out.println("Name    Age    Gender");
        System.out.println("---------------------");
        System.out.println("Jack    18     man");
    }

    private static void test2(){
        int i = 0;
        int num = 4;

        System.out.print("Name");
        for(i = 0; i < num; i++){
            System.out.print(" ");
        }

        System.out.print("Age");
        for(i = 0; i < num; i++){
            System.out.print(" ");
        }
        System.out.println("Gender");

        num = 21;

        for(i = 0; i < num; i++){
            System.out.print("-");
        }
        System.out.println();

        num = 4;

        System.out.print("Jack");
        for(i = 0; i < num; i++){
            System.out.print(" ");
        }

        System.out.print("18");
        for(i = 0; i < num + 1; i++){
            System.out.print(" ");
        }
        System.out.print("man");
    }
}
