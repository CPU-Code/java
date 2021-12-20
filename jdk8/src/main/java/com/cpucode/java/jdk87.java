/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-21 15:58:32
 * @LastEditTime: 2020-09-21 16:01:17
 * @FilePath: \java\jdk8\jdk87.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package com.cpucode.java;

import java.util.function.Supplier;

public class jdk87 {
    public static void main(String[] args) {
        String msgA = "cpucode";
        String msgB = "hello";

        System.out.println(getString(() -> msgA + msgB));
    }

    private static String getString(Supplier<String> function) {
        return function.get();
    }
}

/*
cpucodehello
*/