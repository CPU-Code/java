/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-21 15:44:41
 * @LastEditTime: 2020-09-21 15:51:05
 * @FilePath: \java\jdk8\jdk86.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package com.cpucode.java;

import java.util.Arrays;
import java.util.Comparator;

public class jdk86 {
    public static void main(String[] args) {

        String[] array = {"cpu", "cpucode"};
        System.out.println(Arrays.toString(array));

        Arrays.sort(array, newComparator());
        System.out.println(Arrays.toString(array));
    }

    private static Comparator<String> newComparator() {
        return (a, b) -> b.length() - a.length();
    }
}

/*
[cpu, cpucode]
[cpucode, cpu]
*/