/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-18 19:14:40
 * @LastEditTime: 2020-09-18 19:15:12
 * @FilePath: \java\IO\io11.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package com.cpucode.java;

import java.io.File;
import java.io.FileFilter;

public class io11 {
    public static void main(String[] args) {
        File dir = new File("D:/Date/github/java/IO");
        printDir2(dir);
    }

    public static void printDir2(File dir) {
        // 匿名内部类方式,创建过滤器子类对象
        File[] files = dir.listFiles(new FileFilter() {

            // 测试pathname是否应该包含在当前File目录中
            @Override
            public boolean accept(File pathname) {
                return pathname.getName().endsWith(".java") || pathname.isDirectory();
            }
        });

        // 循环打印
        for (File file : files) {
            if(file.isFile()) {
                System.out.println("文件名" + file.getAbsolutePath());
            } else {
                printDir2(file);
            }
        }
    }
}

/*
文件名D:\Date\github\java\IO\io1.java
文件名D:\Date\github\java\IO\io10.java
文件名D:\Date\github\java\IO\io2.java
文件名D:\Date\github\java\IO\io3.java
文件名D:\Date\github\java\IO\io4.java
文件名D:\Date\github\java\IO\io5.java
文件名D:\Date\github\java\IO\io6.java
文件名D:\Date\github\java\IO\io7.java
文件名D:\Date\github\java\IO\io8.java
文件名D:\Date\github\java\IO\io9.java
*/