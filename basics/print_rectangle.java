/*
 * @Author: cpu_code
 * @Date: 2020-07-07 11:20:48
 * @LastEditTime: 2020-07-07 11:21:42
 * @FilePath: \java\basics\print_rectangle.java
 * @Gitee: https://gitee.com/cpu_code
 * @CSDN: https://blog.csdn.net/qq_44226094
 */ 

/**
 * 使用方法时实现打印三个长宽不同的矩形
 * 
*****
*****
*****

****
****

**********
**********
**********
**********
**********
**********

 */
public class print_rectangle 
{
    public static void main(String[] args) 
	{
		printRectangle(3, 5); // 调用 printRectangle()方法实现打印矩形
		printRectangle(2, 4);
		printRectangle(6, 10);
	}

	// 下面定义了一个打印矩形的方法，接收两个参数，其中height为高，width为宽
	public static void printRectangle(int height, int width) 
	{
		// 下面是使用嵌套for循环实现*打印矩形
		for (int i = 0; i < height; i++) 
		{
			for (int j = 0; j < width; j++) 
			{
				System.out.print("*");
			}
			
			System.out.print("\n");
		}
		System.out.print("\n");
	}
}
