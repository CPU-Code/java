/*
 * @Author: cpu_code
 * @Date: 2020-07-07 22:28:07
 * @LastEditTime: 2020-07-07 22:28:41
 * @FilePath: \java\basics\array_excep.java
 * @Gitee: https://gitee.com/cpu_code
 * @CSDN: https://blog.csdn.net/qq_44226094
 */ 

/**
 * 数组越界异常
 */
public class array_excep 
{
    
	public static void main(String[] args) 
	{
		int[] arr = new int[4]; // 定义一个长度为4的数组
		
		System.out.println("arr[0]=" + arr[4]); // 通过角标4访问数组元素
	}
}
