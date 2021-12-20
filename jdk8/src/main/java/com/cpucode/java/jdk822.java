/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-22 10:28:05
 * @LastEditTime: 2020-09-22 10:30:27
 * @FilePath: \java\jdk8\jdk822.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package com.cpucode.java;

import java.util.ArrayList;
import java.util.List;

public class jdk822 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("cpucode");
        list.add("hello cpu");

        list.stream()
                .filter(s -> s.startsWith("cpu"))
                .filter(s -> s.length() == 7)
                .forEach(System.out::println);
    }
}
