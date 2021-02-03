package com.cpucode.java.variable;/*
 * @Author: cpu_code
 * @Date: 2020-07-06 21:11:19
 * @LastEditTime: 2020-07-06 21:14:00
 * @FilePath: \java\basics\scope.java
 * @Gitee: https://gitee.com/cpu_code
 * @CSDN: https://blog.csdn.net/qq_44226094
 */ 

 /**
 * 变量的作用域
 * x == 12
 * y == 96
 * x == 12
 */
public class Scope
{
    public static void main(String[] args) 
    {
        // 定义了变量x
        int x = 12; 
        
		{
            // 定义了变量y
            int y = 96; 
            
			System.out.println("x == " + x); // 访问变量x
			System.out.println("y == " + y); // 访问变量y
        }
        
        //y = x; // 访问变量x，为变量y赋值
        //System.out.println("y == " + y); // 访问变量y

        System.out.println("x == " + x); // 访问变量x

	}
}