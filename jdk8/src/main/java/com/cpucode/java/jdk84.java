/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-21 15:38:23
 * @LastEditTime: 2020-09-21 15:40:08
 * @FilePath: \java\jdk8\jdk84.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package com.cpucode.java;

public class jdk84 {
    public static void main(String[] args) {
        String msgA = "hello";
        String msgB = "world";
        String msgC = "java";

        log(2, () -> {
            System.out.println("Lambda执行");
            return msgA + msgB + msgC;
        });
    }

    private static void log(int level, MessageBuilder builder) {
        if(level == 1) {
            System.out.println(builder.buildMessage());
        }
    }

    @FunctionalInterface
    interface MessageBuilder {
        String buildMessage();
    }
}
