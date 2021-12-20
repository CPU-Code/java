/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-21 22:03:04
 * @LastEditTime: 2020-09-21 22:05:41
 * @FilePath: \java\jdk8\jd.k817.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package com.cpucode.java;

import java.util.function.Function;

public class jdk817 {
    public static void main(String[] args) {
        method(s -> Integer.parseInt(s));
    }

    private static void method(Function<String, Integer> function) {
        int num = function.apply("10");

        System.out.println(num + 22);
    }
}

/*
32
*/