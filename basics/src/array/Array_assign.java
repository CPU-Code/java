package src.array;/*
 * @Author: cpu_code
 * @Date: 2020-07-07 22:15:09
 * @LastEditTime: 2020-07-07 22:16:19
 * @FilePath: \java\basics\array_assign.java
 * @Gitee: https://gitee.com/cpu_code
 * @CSDN: https://blog.csdn.net/qq_44226094
 */ 

/**
 * 为数组的元素赋值
arr[0]=1
arr[1]=2
arr[2]=0
arr[3]=0
 */
public class Array_assign
{
    public static void main(String[] args) 
    {
        int[] arr = new int[4];     // 定义可以存储4个元素的整数类型数组
        
		arr[0] = 1;     // 为第1个元素赋值1
        arr[1] = 2;     // 为第2个元素赋值2
        
		// 依次打印数组中每个元素的值
		System.out.println("arr[0]=" + arr[0]);
		System.out.println("arr[1]=" + arr[1]);
		System.out.println("arr[2]=" + arr[2]);
		System.out.println("arr[3]=" + arr[3]);
	}
}
