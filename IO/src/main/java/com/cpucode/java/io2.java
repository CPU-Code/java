/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-18 10:23:18
 * @LastEditTime: 2020-09-18 10:23:44
 * @FilePath: \java\IO\io2.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package com.cpucode.java;

import java.io.File;

public class io2 {
    public static void main(String[] args) {
        File f = new File("D:/Date/github/java/IO/test.txt");
        System.out.println(f.getAbsolutePath());

        File f2 = new File("test.txt");
        System.out.println(f2.getAbsolutePath());
    }
}

/*

*/