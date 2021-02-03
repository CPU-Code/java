package com.cpucode.java.cycle;/*
 * @Author: cpu_code
 * @Date: 2020-07-07 10:57:47
 * @LastEditTime: 2020-07-07 10:58:48
 * @FilePath: \java\basics\Continue.java
 * @Gitee: https://gitee.com/cpu_code
 * @CSDN: https://blog.csdn.net/qq_44226094
 */ 

/**
 * continue语句
 * sum = 2500
 */
public class Continue 
{
    public static void main(String[] args) 
    {
        int sum = 0; // 定义变量sum，用于记住和
        
        for (int i = 1; i <= 100; i++) 
        {
            if (i % 2 == 0)     // i是一个偶数，不累加
            { 
				continue; // 结束本次循环
            }
            
			sum += i; // 实现sum和i的累加
        }
        
		System.out.println("sum = " + sum);
	}
}
