/*
 * @Author: cpu_code
 * @Date: 2020-07-11 10:48:13
 * @LastEditTime: 2020-07-11 10:49:51
 * @FilePath: \java\object\object_mem.java
 * @Gitee: https://gitee.com/cpu_code
 * @CSDN: https://blog.csdn.net/qq_44226094
 */ 

/**
 * 访问对象成员
 * 大家好，我叫韩强,我今年-30岁!
 */
public class object_mem 
{
    public static void main(String[] args) 
    {
        Student stu = new Student(); // 创建学生对象
        
		stu.name = "韩强"; // 为对象的name属性赋值
        stu.age = -30; // 为对象的age属性赋值
        
		stu.introduce(); // 调用对象的方法
	}
}

class Student
{
	String name;  //定义一个姓名属性
    int age;      //定义一个年龄属性
    
    public void introduce() 
    {
		// 方法中打印属性name和age的值
		System.out.println("大家好，我叫" + name + ",我今年" + age + "岁!");	
	}
}