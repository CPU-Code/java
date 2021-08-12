/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-18 10:25:01
 * @LastEditTime: 2020-09-18 10:28:56
 * @FilePath: \java\IO\io3.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package com.cpucode.java.file.io;

import java.io.File;

public class io3 {
    public static void main(String[] args) {
        File f = new File("D:/Date/github/java/IO/test.txt");
        File f2 = new File("D:/cpucode");

        // 判断是否存在
        System.out.println("D:/Date/github/java/IO/test.txt 是否存在" + f.exists());
        System.out.println("D:/cpucode 是否存在:" + f2.exists());

        // 判断是文件还是目录
        System.out.println("D:/Date/github/java/IO文件" + f.isFile());
        System.out.println("D:/Date/github/java/IO目录" + f.isDirectory());
    }
}

/*
D:/Date/github/java/IO/test.txt 是否存在true
D:/cpucode 是否存在:false
D:/Date/github/java/IO文件true
D:/Date/github/java/IO目录false
*/