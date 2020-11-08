package object;
/*
 * @Author: cpu_code
 * @Date: 2020-07-08 14:24:00
 * @LastEditTime: 2020-07-08 14:28:20
 * @FilePath: \java\object\member.java
 * @Gitee: https://gitee.com/cpu_code
 * @CSDN: https://blog.csdn.net/qq_44226094
 */ 

/**
 * 访问对象的成员

大家好，我今年18岁!
大家好，我今年0岁!
 */
public class member 
{
    public static void main(String[] args) 
    {
		Person p1 = new Person(); // 创建第一个Person对象
        Person p2 = new Person(); // 创建第二个Person对象
        
        p1.age = 18; // 为age属性赋值
        
		p1.speak(); // 调用对象的方法
		p2.speak();
    }

    static class Person
    {
        int age; // 定义int类型的变量age

        // 定义 speak() 方法
        void speak()
        {
            System.out.println("大家好，我今年" + age + "岁!");
        }
    }
    
}

