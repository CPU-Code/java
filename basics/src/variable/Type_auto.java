/*
 * @Author: cpu_code
 * @Date: 2020-07-06 21:41:19
 * @LastEditTime: 2020-07-06 22:04:48
 * @FilePath: \java\basics\type_auto.java
 * @Gitee: https://gitee.com/cpu_code
 * @CSDN: https://blog.csdn.net/qq_44226094
 */ 


 /**
 * 赋值运算符中的自动类型转换
 * s == 8
 */
public class Type_auto
{
	public static void main(String[] args) 
	{
		short s = 3;
		int i = 5;
		
		s += i;

		System.out.println("s == " + s);
	}
}