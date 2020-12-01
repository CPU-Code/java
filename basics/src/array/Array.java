package src.array;/*
 * @Author: cpu_code
 * @Date: 2020-07-07 11:46:56
 * @LastEditTime: 2020-07-07 22:11:49
 * @FilePath: \java\basics\array.java
 * @Gitee: https://gitee.com/cpu_code
 * @CSDN: https://blog.csdn.net/qq_44226094
 */ 

/**
 * 定义数组以及访问数组中的元素
arr[0]=0
arr[1]=0
arr[2]=0
数组的长度是：3
 */
public class Array
{
    public static void main(String[] args) 
    {
		int[] arr; 	// 声明变量
        arr = new int[3]; // 创建数组对象
        
		System.out.println("arr[0]=" + arr[0]); 	// 访问数组中的第一个元素
		System.out.println("arr[1]=" + arr[1]); 	// 访问数组中的第二个元素
		System.out.println("arr[2]=" + arr[2]); 	// 访问数组中的第三个元素
		
		System.out.println("数组的长度是：" + arr.length); // 打印数组长度
	}
}
