/*
 * @Author: cpu_code
 * @Date: 2020-07-07 11:17:15
 * @LastEditTime: 2020-07-07 11:18:31
 * @FilePath: \java\basics\rectangle.java
 * @Gitee: https://gitee.com/cpu_code
 * @CSDN: https://blog.csdn.net/qq_44226094
 */ 

/**
 * 不使用方法时实现打印三个长宽不同的矩形
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
public class rectangle 
{
    public static void main(String[] args) 
    {
		// 下面的循环是使用*打印一个宽为5、高为3的矩形
        for (int i = 0; i < 3; i++) 
        {
            for (int j = 0; j < 5; j++) 
            {
				System.out.print("*");
			}
			System.out.print("\n");
		}
        System.out.print("\n");
        
		// 下面的循环是使用*打印一个宽为4、高为2的矩形
        for (int i = 0; i < 2; i++) 
        {
            for (int j = 0; j < 4; j++) 
            {
				System.out.print("*");
			}
			System.out.print("\n");
		}
        System.out.print("\n");
        
		// 下面的循环是使用*打印一个宽为10、高为6的矩形
        for (int i = 0; i < 6; i++) 
        {
            for (int j = 0; j < 10; j++) 
            {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		System.out.print("\n");
	}
}
