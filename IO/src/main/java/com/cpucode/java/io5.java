/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-18 10:50:02
 * @LastEditTime: 2020-09-18 10:54:23
 * @FilePath: \java\IO\io5.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package com.cpucode.java;

import java.io.File;

public class io5 {
    public static void main(String[] args) {
        File dir = new File("D:/Date/github/java/IO");

        //获取当前目录下的文件以及文件夹的名称。
        String[] names = dir.list();
        for(String name : names){
            System.out.println(name);
        }

        //获取当前目录下的文件以及文件夹对象，只要拿到了文件对象，那么就可以获取更多信息
        File[] files = dir.listFiles();
        for (File file : files) {
            System.out.println(file);
        }
    }
}

/*
io1.java
io2.java
io3.java
io4.java
io5.java
test.txt
D:\Date\github\java\IO\io1.java
D:\Date\github\java\IO\io2.java
D:\Date\github\java\IO\io3.java
D:\Date\github\java\IO\io4.java
D:\Date\github\java\IO\io5.java
D:\Date\github\java\IO\test.txt
*/