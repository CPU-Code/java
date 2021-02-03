package com.cpucode.java.judgment;/*
 * @Author: cpu_code
 * @Date: 2020-07-07 08:56:24
 * @LastEditTime: 2020-07-07 08:58:16
 * @FilePath: \java\basics\switch.java
 * @Gitee: https://gitee.com/cpu_code
 * @CSDN: https://blog.csdn.net/qq_44226094
 */ 

 /**
 * switch语句的使用
 * 星期三
 */
public class Switch 
{
    public static void main(String[] args) 
    {
        int week = 3;
        
        switch (week) 
        {
            case 1:
                System.out.println("星期一");
                break;

            case 2:
                System.out.println("星期二");
                break;

            case 3:
                System.out.println("星期三");
                break;

            case 4:
                System.out.println("星期四");
                break;

            case 5:
                System.out.println("星期五");
                break;

            case 6:
                System.out.println("星期六");
                break;

            case 7:
                System.out.println("星期天");
                break;

            default:
                System.out.println("输入的数字不正确...");
                break;
                
		}
	}
}