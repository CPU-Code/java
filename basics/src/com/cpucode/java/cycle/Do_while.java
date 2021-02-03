package com.cpucode.java.cycle;/*
 * @Author: cpu_code
 * @Date: 2020-07-07 09:29:29
 * @LastEditTime: 2020-07-07 09:30:19
 * @FilePath: \java\basics\do_while.java
 * @Gitee: https://gitee.com/cpu_code
 * @CSDN: https://blog.csdn.net/qq_44226094
 */ 

/**
 * do...while循环
 * x = 1
 * x = 2
 * x = 3
 * x = 4
 */
public class Do_while
{
    public static void main(String[] args) 
    {
        int x = 1; // 定义变量x，初始值为1
        
        do 
        {
			System.out.println("x = " + x); // 打印x的值
			x++; // 将x的值自增
		} while (x <= 4); // 循环条件
	}
}
