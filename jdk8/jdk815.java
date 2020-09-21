/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-21 21:41:49
 * @LastEditTime: 2020-09-21 21:44:40
 * @FilePath: \java\jdk8\jd.k815.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package jdk8;

import java.util.function.Predicate;

public class jd.k815 {
    public static void main(String[] args) {
        method(s -> s.length() < 5);
    }

    private static void method(Predicate<String> predicate) {
        boolean veryLone = predicate.negate().test("cpucode");
        System.out.println("字符串符合不 " + veryLone);
    }
}

/*
字符串符合不 true
*/