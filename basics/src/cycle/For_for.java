/*
 * @Author: cpu_code
 * @Date: 2020-07-07 10:16:59
 * @LastEditTime: 2020-07-07 10:17:51
 * @FilePath: \java\basics\For_for.java
 * @Gitee: https://gitee.com/cpu_code
 * @CSDN: https://blog.csdn.net/qq_44226094
 */ 

 /**
 * for循环(使用*打印直角三角形)
*
**
***
****
*****
******
*******
********
*********
 */
public class For_for 
{
    public static void main(String[] args) 
    {
        int i, j; // 定义两个循环变量
        
        for (i = 1; i <= 9; i++)  // 外层循环
        {
            for (j = 1; j <= i; j++) // 内层循环
            { 
				System.out.print("*"); // 打印*
            }
            
			System.out.print("\n"); // 换行
		}
	}
}
