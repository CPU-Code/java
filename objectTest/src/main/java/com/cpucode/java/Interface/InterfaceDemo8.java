/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-13 22:36:31
 * @LastEditTime: 2020-09-13 22:42:47
 * @FilePath: \java\object\Interface\InterfaceDemo8.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package com.cpucode.java.Interface;

public class InterfaceDemo8 {
    public static void main(String[] args){

        D c = new D();

        c.method();
    }

    // 定义接口
    interface A {
        public default void method() {
            System.out.println("cpucode");
        }
    }

    interface B {
        public default void method() {
            System.out.println("cpu");
        }
    }

    interface C extends A, B{
        @Override
        public default void method() {
            System.out.println("cpu_code");
        }
    }

    static class D implements C{

    }
}



/*
cpu_code
*/