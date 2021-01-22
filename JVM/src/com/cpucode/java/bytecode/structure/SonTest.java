package com.cpucode.java.bytecode.structure;

/**
 * 成员变量（非静态的）的赋值过程：
 *      ① 默认初始化
 *      ② 显式初始化 /代码块中初始化
 *      ③ 构造器中初始化
 *      ④ 有了对象之后，可以“对象.属性”或"对象.方法"的方式对成员变量进行赋值。
 *
 * @author : cpucode
 * @Date : 2021/1/21
 * @Time : 21:42
 * @Github : https://github.com/CPU-Code
 * @CSDN : https://blog.csdn.net/qq_44226094
 */
public class SonTest {
    public static void main(String[] args) {
        Father f = new Son();

        System.out.println(f.x);
    }
}

class Father{
    int x = 10;

    public Father(){
        this.print();
        x = 20;
    }

    public void print(){
        System.out.println("Father.x = " + x);
    }
}

class Son extends Father{
    int x = 30;

    public Son(){
        this.print();
        x = 40;
    }

    @Override
    public void print(){
        System.out.println("Son.x = " + x);
    }
}