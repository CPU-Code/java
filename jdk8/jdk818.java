/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-21 22:06:31
 * @LastEditTime: 2020-09-21 22:16:58
 * @FilePath: \java\jdk8\jd.k818.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package jdk8;

import java.util.function.Function;

public class jd.k818 {
    public static void main(String[] args) {
        method(str -> Integer.parseInt(str) + 10, i -> i *= 10);
    }

    private static void method(Function<String, Integer> one, Function<Integer, Integer> two) {
        int num = one.andThen(two).apply("10");

        System.out.println(num + 20);
    }
}