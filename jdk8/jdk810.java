/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-21 18:35:58
 * @LastEditTime: 2020-09-21 18:39:49
 * @FilePath: \java\jdk8\jdk810.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package jdk8;

import java.util.function.Consumer;

public class jdk810 {
    public static void main(String[] args) {
        consumeString(
                s -> System.out.println(s.toUpperCase()),
                s -> System.out.println(s.toLowerCase()));
    }

    private static void consumeString(Consumer<String> one, Consumer<String> two) {
        one.andThen(two).accept("cpucode");
    }
}

/*
CPUCODE
cpucode
*/