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
public class Type_conver
{
    public static void main(String[] args) 
    {
		int num = 4;
        byte b = (byte) num;

        System.out.print("byte b = ");
        System.out.println(b);

        //定义byte类型的变量
        byte bt = 10;
        short s = bt;
        int i = bt;
        System.out.println("short s = " + s);
        System.out.println("int i = " + i);

        //这是不可以的，类型不兼容
        //char c = bt;

        //强制类型转换
        int k = (int)88.88;
        System.out.println("int k = " + k);
	}
}

/*
byte b = 4
short s = 10
int i = 10
int k = 88
* */