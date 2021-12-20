/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-21 21:10:15
 * @LastEditTime: 2020-09-21 21:39:06
 * @FilePath: \java\jdk8\jd.k813.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package com.cpucode.java;

import java.util.function.Predicate;

public class jdk813 {
    public static void main(String[] args) {
        method(s -> s.contains("c"), s -> s.contains("p"));
    }

    private static void method(Predicate<String> one, Predicate<String> two) {
        boolean isValid = one.and(two).test("cpucode");
        System.out.println("字符串符合不 " + isValid);
    }
}

/*
字符串符合不 true
*/