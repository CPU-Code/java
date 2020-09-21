/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-21 14:15:16
 * @LastEditTime: 2020-09-21 14:21:48
 * @FilePath: \java\jdk8\jdk81.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package jdk8;

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

/*
Lambda执行
*/