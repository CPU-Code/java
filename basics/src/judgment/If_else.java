/*
 * @Author: cpu_code
 * @Date: 2020-07-07 08:47:46
 * @LastEditTime: 2020-07-07 08:50:38
 * @FilePath: \java\basics\if_else.java
 * @Gitee: https://gitee.com/cpu_code
 * @CSDN: https://blog.csdn.net/qq_44226094
 */ 

/**
 * if...else...语句的使用
 * num是一个偶数
 */
public class If_else
{
    public static void main(String[] args)
    {
        int num = 18;
        
        if(num % 2 == 0)
        {
            System.out.println("num是一个偶数");
        }
        else
        {
            System.out.println("num是一个奇数");
        }
    }
}