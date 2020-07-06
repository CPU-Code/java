/*
 * @Author: cpu_code
 * @Date: 2020-07-06 20:49:56
 * @LastEditTime: 2020-07-06 21:02:38
 * @FilePath: \java\basics\accuracy.java
 * @Gitee: https://gitee.com/cpu_code
 * @CSDN: https://blog.csdn.net/qq_44226094
 */ 

 /**
 * 数据精度丢失
 * a == 1
 * b == 257
 */
public class accuracy 
{
    public static void main(String[] args)
    {
        // 定义byte类型的变量a
        byte a;
        // 定义int类型的变量b
        int b = 257;

        a = (byte)b;
        
        System.out.println("a == " + a);
        System.out.println("b == " + b);
    }
}

