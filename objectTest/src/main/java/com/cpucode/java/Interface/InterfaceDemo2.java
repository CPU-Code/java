/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-13 20:37:41
 * @LastEditTime: 2020-09-13 20:41:04
 * @FilePath: \java\object\Interface\InterfaceDemo2.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package com.cpucode.java.Interface;

public class InterfaceDemo2 {
    public static void main(String[] args){
        // 创建子类对象
        Animal a = new Animal();
        // 调用默认方法
        a.fly();
    }

    interface LiveAble{
        // 继承默认方法
        public default void fly(){
            System.out.println("飞呀");
        }
    }

    static class Animal implements LiveAble{
        // 继承，什么都不用写，直接调用
    }
}




/*
飞呀
*/