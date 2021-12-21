/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-13 15:05:12
 * @LastEditTime: 2020-09-13 15:11:13
 * @FilePath: \java\object\Extends\Extend_test.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package com.cpucode.java.Extends;

//定义测试类
public class Extend_test {
    public static void main(String[] args){
        // 创建一个讲师类对象
        Teacher t = new Teacher();

        // 为该员工类的name属性进行赋值
        t.name = "cpucode";

        // 调用该员工的printName()方法
        t.printName();

        // 调用Teacher类继承来的work()方法
        t.work();
    }
}

// 定义员工类Employee，做为父类
class Employee{
    // 定义name属性
    String name;

    // 定义员工的工作方法
    public void work(){
        System.out.println("好好学习");
    }
}

//定义讲师类Teacher 继承 员工类Employee
class Teacher extends Employee{
    // 定义一个打印name的方法
    public void printName(){
        System.out.println("name =" + name);
    }
}

/*
name =cpucode
好好学习
*/