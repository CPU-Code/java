package com.cpucode.java.array;/*
 * @Author: cpu_code
 * @Date: 2020-07-07 22:31:36
 * @LastEditTime: 2020-07-07 22:32:30
 * @FilePath: \java\basics\point_excep.java
 * @Gitee: https://gitee.com/cpu_code
 * @CSDN: https://blog.csdn.net/qq_44226094
 */ 

/**
 * 空指针异常
 * arr[0]=5
Exception in thread "main" java.lang.NullPointerException
        at point_excep.main(point_excep.java:24)
 */
public class Point_excep
{
    public static void main(String[] args) 
	{
		int[] arr = new int[3]; // 定义一个长度为3的数组
		arr[0] = 5; // 为数组的第一个元素赋值

		System.out.println("arr[0]=" + arr[0]); // 访问数组的元素

		arr = null; // 将变量arr置为null
		
		System.out.println("arr[0]=" + arr[0]); // 访问数组的元素
	}
}
