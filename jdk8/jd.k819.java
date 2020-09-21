/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-21 22:19:19
 * @LastEditTime: 2020-09-21 22:26:10
 * @FilePath: \java\jdk8\jd.k819.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package jdk8;

import java.util.function.Function;

public class jd.k819 {
    public static void main(String[] args) {
        String str = "cpucode, 22";

        int age = getAgeNum(str,
                            s -> s.split(",")[1],
                            s -> Integer.parseInt(s),
                            n -> n += 100);

        System.out.println(age);
    }

    private static int getAgeNum(String str,
                                 Function<String, String> one,
                                 Function<String , Integer> two,
                                 Function<Integer, Integer> three) {
        return one.andThen(two).andThen(three).apply(str);
    }
}
