package com.cpucode.java.operator;/*
 * @Author: cpu_code
 * @Date: 2020-07-06 21:57:36
 * @LastEditTime: 2020-07-06 22:34:58
 * @FilePath: \java\basics\and_use.java
 * @Gitee: https://gitee.com/cpu_code
 * @CSDN: https://blog.csdn.net/qq_44226094
 */ 

/*	
优先级		运算符										结合性
1			() [] .										从左到右
2		! +(正)  -(负) ~ ++ --							从右向左
3		* / %											从左向右
4		+(加) -(减)										从左向右
5		<< >> >>>										从左向右
6		< <= > >= instanceof							从左向右
7		==   !=											从左向右
8		&(按位与)											从左向右
9			^												从左向右
10			|												从左向右
11			&&												从左向右
12			||												从左向右
13			?:												从右向左
14		= += -= *= /= %= &= |= ^=  ~=  <<= >>=   >>>=		从右向左
*/
/**
 * “&”和“&&”的使用
a == false
y == 2
b == false
z == 1
 */
public class And_use {
    public static void main(String[] args) {
		int x = 0; // 定义变量x
		int y = 1; // 定义变量y
		int z = 1; // 定义变量z
		boolean a, b; // 定义boolean变量a和b

		// 逻辑运算符&对表达式进行运算
		a = x > 0 & y++ > 1; 

		System.out.println("a == " + a);
		System.out.println("y == " + y);

		// 逻辑运算符&&对表达式进行运算
		b = x > 0 && z++ > 1; 

		System.out.println("b == " + b);
		System.out.println("z == " + z);
	}
}
