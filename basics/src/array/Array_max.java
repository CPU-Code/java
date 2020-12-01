package src.array;/*
 * @Author: cpu_code
 * @Date: 2020-07-08 10:00:46
 * @LastEditTime: 2020-07-08 10:01:53
 * @FilePath: \java\basics\array_max.java
 * @Gitee: https://gitee.com/cpu_code
 * @CSDN: https://blog.csdn.net/qq_44226094
 */ 

/**
 * 获取数组中元素的最大值
 * max == 9
 */
public class Array_max
{
    public static void main(String[] args) 
    {
		int[] arr = { 4, 1, 6, 3, 9, 8 }; // 定义一个数组
        int max = getMax(arr); // 调用获取元素最大值的方法
        
		System.out.println("max == " + max); // 打印最大值
	}

    static int getMax(int[] arr) 
    {
        int max = arr[0]; // 定义变量max用于记住最大数，首先假设第一个元素为最大值
        
		// 下面通过一个for循环遍历数组中的元素
        for (int x = 1; x < arr.length; x++) 
        {
            // 比较 arr[x]的值是否大于max
            if (arr[x] > max) 
            { 
				max = arr[x]; // 条件成立，将arr[x]的值赋给max
			}
        }
        
		return max; // 返回最大值max
	}
}
