/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-21 22:40:43
 * @LastEditTime: 2020-09-21 22:45:00
 * @FilePath: \java\jdk8\jdk820.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package com.cpucode.java;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;


/* public是访问修饰符，表示该class是公开的 */
public class jdk820    // 类名是 First
{
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("cpucode");
        list.add("cpu");

        for (String name : list) {
            System.out.println(name);
        }
    }

}

/*
cpucode
cpu
*/