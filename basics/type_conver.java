/*
 * @Author: cpu_code
 * @Date: 2020-07-06 20:42:30
 * @LastEditTime: 2020-07-06 20:47:14
 * @FilePath: \java\basics\type_conver.java
 * @Gitee: https://gitee.com/cpu_code
 * @CSDN: https://blog.csdn.net/qq_44226094
 */ 

/**
 * 强制类型转换
 * b == 4
 */
public class type_conver
{
    public static void main(String[] args) 
    {
		int num = 4;
        byte b = (byte) num;
        
        System.out.print("b == ");
		System.out.println(b);
	}
}

/*
b == 4
* */