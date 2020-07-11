/*
 * @Author: cpu_code
 * @Date: 2020-07-08 19:19:06
 * @LastEditTime: 2020-07-08 19:32:31
 * @FilePath: \java\object\empty_object.java
 * @Gitee: https://gitee.com/cpu_code
 * @CSDN: https://blog.csdn.net/qq_44226094
 */ 

/**
 * 垃圾对象
 */
class Person
{
	// 创建say()方法，输出一句话
	void say() 
	{ 
		System.out.println("我是一个人!");
	}
}

class empty_object 
{
    public static void main(String[] args) 
	{
		Person p2 = new Person(); // 创建Person2对象
		p2.say(); // 调用say()方法

		p2 = null; // 将Person对象置为null

		p2.say();
	}
}

