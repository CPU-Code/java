/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-18 10:18:34
 * @LastEditTime: 2020-09-18 10:20:27
 * @FilePath: \java\IO\io1.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package IO;

import java.io.File;

/* public是访问修饰符，表示该class是公开的 */
public class io1    // 类名是 First
{
    public static void main(String[] args) {
        File f = new File("D:/Date/github/java/IO/test.txt");

        System.out.println("文件绝对路径 : " + f.getAbsolutePath());
        System.out.println("文件构造路径 : " + f.getPath());
        System.out.println("文件名称 : " + f.getName());
        System.out.println("文件长度 : " + f.length() + "长度");

        File f2 = new File("D:/Date/github/java/IO");
        System.out.println("目录绝对路径 : " + f.getAbsolutePath());
        System.out.println("目录构造路径 : " + f.getPath());
        System.out.println("目录名称 : " + f.getName());
        System.out.println("目录长度 : " + f.length());
    }
}

/*
文件绝对路径 : D:\Date\github\java\IO\test.txt
文件构造路径 : D:\Date\github\java\IO\test.txt
文件名称 : test.txt
文件长度 : 7长度
目录绝对路径 : D:\Date\github\java\IO\test.txt
目录构造路径 : D:\Date\github\java\IO\test.txt
目录名称 : test.txt
目录长度 : 7
*/