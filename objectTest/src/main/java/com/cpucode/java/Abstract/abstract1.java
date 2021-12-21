/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-13 16:26:15
 * @LastEditTime: 2020-09-13 16:35:09
 * @FilePath: \java\object\abstract\abstract1.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package com.cpucode.java.Abstract;

public class abstract1 {
    public static void main(String[] args){

        // 创建子类对象
        Cat c = new Cat();
        // 调用run方法
        c.run();
    }
}

abstract class Animal{
    public abstract void run();
}

class Cat extends Animal{
    public void run() {
        System.out.println("cpucode");
    }
}

/*
cpucode
*/