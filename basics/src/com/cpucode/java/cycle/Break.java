package com.cpucode.java.cycle;/*
 * @Author: cpu_code
 * @Date: 2020-07-07 10:18:13
 * @LastEditTime: 2020-07-07 10:24:50
 * @FilePath: \java\basics\Break.java
 * @Gitee: https://gitee.com/cpu_code
 * @CSDN: https://blog.csdn.net/qq_44226094
 */ 

 /**
 * break语句
x = 1
x = 2
x = 3
 */
public class Break 
{
	public static void main(String[] args) 
	{
		int x = 1; // 定义变量x，初始值为1

		while (x <= 4) // 循环条件
		{ 
			System.out.println("x = " + x); // 条件成立，打印x的值

			if (x == 3) 
			{
				break;
			}

			x++; // x进行自增
		}
	}
}
