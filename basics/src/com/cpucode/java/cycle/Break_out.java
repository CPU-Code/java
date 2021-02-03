package com.cpucode.java.cycle;/*
 * @Author: cpu_code
 * @Date: 2020-07-07 10:55:48
 * @LastEditTime: 2020-07-07 10:57:21
 * @FilePath: \java\basics\break_out.java
 * @Gitee: https://gitee.com/cpu_code
 * @CSDN: https://blog.csdn.net/qq_44226094
 */ 

/**
 * break语句(跳出外层循环)
*
**
***
****
itcast
 */
public class Break_out
{
	public static void main(String[] args) 
	{
		
        int i, j; // 定义两个循环变量
        
	    itcast: for (i = 1; i <= 9; i++)    // 外层循环
		{ 
			
			for (j = 1; j <= i; j++)    // 内层循环
			{ 
				if (i > 4)  // 判断i的值是否大于4
				{ 
                    
					//break;
					break itcast; // 跳出外层循环
				}

				System.out.print("*"); // 打印*
			}

			System.out.print("\n"); // 换行
		}

		System.out.print("itcast");
	}
}
