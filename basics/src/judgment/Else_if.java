package src.judgment;
/*
 * @Author: cpu_code
 * @Date: 2020-07-07 08:52:44
 * @LastEditTime: 2020-07-07 08:55:25
 * @FilePath: \java\basics\else_if.java
 * @Gitee: https://gitee.com/cpu_code
 * @CSDN: https://blog.csdn.net/qq_44226094
 */ 

 /**
 * if…else if…else语句的使用
 * 该成绩的等级为良
 */
public class Else_if
{
    public static void main(String[] args) 
	{
		int grade = 75; // 定义学生成绩
		
		if (grade > 80) 
		{
            // 满足条件 grade > 80
            
			System.out.println("该成绩的等级为优");
		} 
		else if (grade > 70) 
		{
            // 不满足条件 grade > 80 ，但满足条件 grade > 70
            
			System.out.println("该成绩的等级为良");
		} 
		else if (grade > 60) 
		{
            // 不满足条件 grade > 70 ，但满足条件 grade > 60
            
			System.out.println("该成绩的等级为中");
		} 
		else 
		{
            //  grade =< 60
            
			System.out.println("该成绩的等级为差");
		}
	}
}
