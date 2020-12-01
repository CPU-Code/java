/*
 * @Author: cpu_code
 * @Date: 2020-07-07 09:16:42
 * @LastEditTime: 2020-07-07 09:28:08
 * @FilePath: \java\basics\While.java
 * @Gitee: https://gitee.com/cpu_code
 * @CSDN: https://blog.csdn.net/qq_44226094
 */ 

 /**
 * while循环
 * x = 1
 * x = 2
 * x = 3
 * x = 4
 */
public class While 
{
    public static void main(String[] args) 
	{
		int x = 1; // 定义变量x，初始值为1
        
        // 循环条件
		while (x <= 4) 
		{ 
            
            System.out.println("x = " + x); // 条件成立，打印x的值
            
			x++; // x进行自增
		}
	}
}