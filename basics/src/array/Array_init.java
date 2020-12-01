package src.array;
/*
 * @Author: cpu_code
 * @Date: 2020-07-07 22:17:22
 * @LastEditTime: 2020-07-07 22:17:54
 * @FilePath: \java\basics\array_init.java
 * @Gitee: https://gitee.com/cpu_code
 * @CSDN: https://blog.csdn.net/qq_44226094
 */ 

/**
 * 数组静态初始化
arr[0] = 1
arr[1] = 2
arr[2] = 3
arr[3] = 4
 */
public class Array_init
{
    public static void main(String[] args) 
	{
        int[] arr = { 1, 2, 3, 4 }; 	// 静态初始化
        
		// 依次访问数组中的元素
		System.out.println("arr[0] = " + arr[0]);
		System.out.println("arr[1] = " + arr[1]);
		System.out.println("arr[2] = " + arr[2]);
		System.out.println("arr[3] = " + arr[3]);
	}
}