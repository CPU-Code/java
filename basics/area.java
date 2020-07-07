/*
 * @Author: cpu_code
 * @Date: 2020-07-07 11:37:10
 * @LastEditTime: 2020-07-07 11:37:55
 * @FilePath: \java\basics\area.java
 * @Gitee: https://gitee.com/cpu_code
 * @CSDN: https://blog.csdn.net/qq_44226094
 */ 

/**
 * 使用有返回值的方法求矩形的面积
 * The area is 15
 */
public class area 
{
    public static void main(String[] args) 
	{
		int area = getArea(3, 5); // 调用 getArea方法
		
		System.out.println(" The area is " + area);
	}

	// 下面定义了一个求矩形面积的方法，接收两个参数，其中x为高，y为宽
	public static int getArea(int x, int y) 
	{
		int temp = x * y; // 使用变量temp记住运算结果

		return temp; // 将变量temp的值返回
	}
}
