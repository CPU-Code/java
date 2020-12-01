package src.array;
/*
 * @Author: cpu_code
 * @Date: 2020-07-07 22:41:25
 * @LastEditTime: 2020-07-08 10:00:26
 * @FilePath: \java\basics\for_array.java
 * @Gitee: https://gitee.com/cpu_code
 * @CSDN: https://blog.csdn.net/qq_44226094
 */ 

/**
 * for循环遍历数组
1
2
3
4
5
 */
public class For_array
{
    public static void main(String[] args) 
    {
        int[] arr = { 1, 2, 3, 4, 5 }; // 定义数组
        
		// 使用for循环遍历数组的元素
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.println(arr[i]); // 通过索引访问元素
		}
	}
}
