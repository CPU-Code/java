/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-21 21:06:26
 * @LastEditTime: 2020-09-21 21:09:40
 * @FilePath: \java\jdk8\jd.k812.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package com.cpucode.java;

import java.util.function.Predicate;

public class jdk812 {
    public static void main(String[] args) {
        method(s -> s.length() > 5);
    }

    private static void method(Predicate<String> predicate) {
        boolean veryLong = predicate.test("cpucode");
        System.out.println("字符串很长 " + veryLong);
    }
}

/*
字符串很长 true
*/