package src.variable;
/*
 * @Author: cpu_code
 * @Date: 2020-07-06 21:05:44
 * @LastEditTime: 2020-07-06 21:07:53
 * @FilePath: \java\basics\byte_assign.java
 * @Gitee: https://gitee.com/cpu_code
 * @CSDN: https://blog.csdn.net/qq_44226094
 */

/**
 * 表达式类型自动提升
 * b3 = 7
 */
public class Byte_assign
{
	public static void main(String[] args) 
	{
		byte b1 = 3; // 定义一个byte类型的变量
		byte b2 = 4;
		
		// 两个byte类型变量相加，赋值给一个byte类型变量
		byte b3 = (byte) (b1 + b2); 
		
		System.out.println("b3 = " + b3);
	}
}