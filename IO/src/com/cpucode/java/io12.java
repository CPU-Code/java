/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-18 19:16:02
 * @LastEditTime: 2020-09-18 19:23:06
 * @FilePath: \java\IO\io12.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package IO;

import java.io.File;

public class io12 {
    public static void main(String[] args) {
        File dir = new File("D:/Date/github/java/IO");
        printDir3(dir);
    }

    public static void printDir3(File dir) {
        File[] files = dir.listFiles(f -> {
           return f.getName().endsWith(".java") || f.isDirectory();
        });

        for (File file : files) {
            if(file.isFile()) {
                System.out.println("文件名 " + file.getAbsolutePath());
            } else {
                printDir3(file);
            }
        }
    }
}

/*
文件名 D:\Date\github\java\IO\io1.java
文件名 D:\Date\github\java\IO\io10.java
文件名 D:\Date\github\java\IO\io11.java
文件名 D:\Date\github\java\IO\io12.java
文件名 D:\Date\github\java\IO\io2.java
文件名 D:\Date\github\java\IO\io3.java
文件名 D:\Date\github\java\IO\io4.java
文件名 D:\Date\github\java\IO\io5.java
文件名 D:\Date\github\java\IO\io6.java
文件名 D:\Date\github\java\IO\io7.java
文件名 D:\Date\github\java\IO\io8.java
文件名 D:\Date\github\java\IO\io9.java
*/