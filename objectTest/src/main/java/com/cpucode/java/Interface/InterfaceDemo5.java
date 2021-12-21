/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-13 21:28:58
 * @LastEditTime: 2020-09-13 21:42:11
 * @FilePath: \java\object\Interface\InterfaceDemo5.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package com.cpucode.java.Interface;

public class InterfaceDemo5 {
    public static void main(String[] args){
        C c = new C();

        c.showA();
        c.showB();
        c.show();
    }
}

interface A {
    public abstract void showA();
    public abstract void show();
}

interface B {
    public abstract void showB();
    public abstract void show();
}

class C implements A, B{
    @Override
    public void showA() {
        System.out.println("showA");
    }

    @Override
    public void show() {
        System.out.println("show");
    }

    @Override
    public void showB(){
        System.out.println("showB");
    }

}