/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-13 20:28:22
 * @LastEditTime: 2020-09-13 20:36:02
 * @FilePath: \java\object\Interface\InterfaceDemo.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package com.cpucode.java.Interface;

public class InterfaceDemo {
    public static void main(String[] args){
        // 创建子类对象
        Animal a = new Animal();
        
        // 调用实现后的方法
        a.eat();
        a.sleep();
    }
}


interface LiveAble{
    //定义抽象方法
    // 使用 abstract 关键字修饰，可以省略，没有方法体
    public abstract void eat();
    public abstract void sleep();
}

class Animal implements LiveAble{
    @Override
    public void eat(){
        System.out.println("吃东西");
    }

    @Override
    public void sleep(){
        System.out.println("晚上睡");
    }
}

/*
吃东西
晚上睡
*/