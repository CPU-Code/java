
package com.cpucode.java;

import java.io.IOException;

public class jdk81{
    public static void main(String[] args) throws IOException {
        // 调用使用函数式接口的方法
        doSomething(() -> System.out.println("Lambda执行"));
    }

    // 使用自定义的函数式接口作为方法参数
    private static void doSomething(MyFunctionalInterface inter) {
        // 调用自定义的函数式接口方法
        inter.myMethod();
    }

    @FunctionalInterface
    interface MyFunctionalInterface {
        void myMethod();
    }
}