/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-18 11:53:27
 * @LastEditTime: 2020-09-18 12:01:56
 * @FilePath: \java\IO\io9.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package com.cpucode.java;

import java.io.File;

public class io9 {
    public static void main(String[] args) {
        //创建File对象
        File dir = new File("D:/Date/github/java/IO");

        //调用打印目录方法
        printDir(dir);
    }

    public static void printDir(File dir) {
        //获取子文件和目录
        File[] files = dir.listFiles();

        //循环打印
        //判断:
        //当是文件时,打印绝对路径.
        //当是目录时,继续调用打印目录的方法,形成递归调用.
        for (File file : files) {
            if(file.isFile()) {
                // 是文件,输出文件绝对路径
                System.out.println("文件名 : "+ file.getAbsolutePath());
            } else {
                // 是目录,输出目录绝对路径
                System.out.println("目录 :" + file.getAbsolutePath());
                // 继续遍历,调用printDir,形成递归
                printDir(file);
            }
        }
    }
}
/*
文件名 : D:\Date\github\java\IO\io1.java
文件名 : D:\Date\github\java\IO\io2.java
文件名 : D:\Date\github\java\IO\io3.java
文件名 : D:\Date\github\java\IO\io4.java
文件名 : D:\Date\github\java\IO\io5.java
文件名 : D:\Date\github\java\IO\io6.java
文件名 : D:\Date\github\java\IO\io7.java
文件名 : D:\Date\github\java\IO\io8.java
文件名 : D:\Date\github\java\IO\io9.java
文件名 : D:\Date\github\java\IO\test.txt
*/
