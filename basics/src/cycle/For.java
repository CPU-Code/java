/*
 * @Author: cpu_code
 * @Date: 2020-07-07 10:14:45
 * @LastEditTime: 2020-07-07 10:15:30
 * @FilePath: \java\basics\For.java
 * @Gitee: https://gitee.com/cpu_code
 * @CSDN: https://blog.csdn.net/qq_44226094
 */ 

 /**
 * for循环
 * sum = 10
 */
public class For 
{
    public static void main(String[] args) 
    {
        int sum = 0; // 定义变量sum，用于记住累加的和
        
        // i的值会在1~4之间变化
        for (int i = 1; i <= 4; i++) 
        { 
			sum += i; // 实现sum与i的累加
        }
        
		System.out.println("sum = " + sum); // 打印累加的和
	}
}
