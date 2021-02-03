package com.cpucode.java.judgment;

/*
 * @Author: cpu_code
 * @Date: 2020-07-07 09:15:28
 * @LastEditTime: 2020-07-07 09:16:12
 * @FilePath: \java\basics\Case.java
 * @Gitee: https://gitee.com/cpu_code
 * @CSDN: https://blog.csdn.net/qq_44226094
 */ 

 /**
 * switch语句的使用(多个case条件后面的执行语句是一样的情况)
 * 今天是工作日
 */
public class Case 
{
    public static void main(String[] args) 
	{
		int week = 2;
		
		switch (week) 
		{
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				// 当 week 满足值 1、2、3、4、5 中任意一个时，处理方式相同
				System.out.println("今天是工作日");
				break;

			case 6:
			case 7:
				// 当 week 满足值 6、7 中任意一个时，处理方式相同
				System.out.println("今天是休息日");
				break;
				
		}
	}
}