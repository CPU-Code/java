/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-21 20:52:47
 * @LastEditTime: 2020-09-21 20:57:31
 * @FilePath: \java\jdk8\jd.k811.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package jdk8;

import java.util.function.Consumer;

public class jdk811 {
    public static void main(String[] args) {
        String[] array = {"cpucode, 男", "cpu, 女"};
        printInfo(
                s -> System.out.print("姓名 : " + s.split(",")[0]),
                s -> System.out.println(" 性别 :" + s.split(",")[1]),
                array);
    }

    private static void printInfo(Consumer<String> one, Consumer<String> two, String[] array) {
        for(String info : array) {
            one.andThen(two).accept(info);
        }
    }
}

/*
姓名 : cpucode 性别 : 男
姓名 : cpu 性别 : 女
*/