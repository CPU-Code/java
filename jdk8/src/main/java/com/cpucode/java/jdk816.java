/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-21 21:48:59
 * @LastEditTime: 2020-09-21 21:59:38
 * @FilePath: \java\jdk8\jd.k816.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package com.cpucode.java;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class jdk816 {
    public static void main(String[] args) {
        String[] array = {"cpucode, 男", "cpu, 女", "流弊, 男"};
        List<String> list = filter(array,
                s -> "男".equals(s.split(",")[1]),
                s -> s.split(",")[0].length() == 2);

        System.out.println(list);
    }

    private static List<String> filter(String[] array, Predicate<String> one, Predicate<String> two) {
        List<String> list = new ArrayList<>();

        for (String info : array) {
            if(one.and(two).test(info)){
                list.add(info);
            }
        }

        return list;
    }
}
