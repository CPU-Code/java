/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-21 18:26:47
 * @LastEditTime: 2020-09-21 18:33:42
 * @FilePath: \java\jdk8\jdk89.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package com.cpucode.java;

import java.util.function.Consumer;

public class jdk89 {
    public static void main(String[] args) {
        consumeString(s -> System.out.println(s));
    }

    private static void consumeString(Consumer<String> function) {
        function.accept("cpucode");
    }
}

/*
cpucode
*/