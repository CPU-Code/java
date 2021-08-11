/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-19 10:31:21
 * @LastEditTime: 2020-09-19 10:31:55
 * @FilePath: \java\IO\io18.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package com.cpucode.java;

import java.io.FileInputStream;
import java.io.IOException;

public class io18 {
    public static void main(String[] args) throws IOException {

        // 使用文件名称创建流对象
        FileInputStream fis = new FileInputStream("cpucode.txt");

        // 读取数据，返回一个字节
        int read = fis.read();
        System.out.println((char) read);
        read = fis.read();
        System.out.println((char) read);
        read = fis.read();
        System.out.println((char) read);
        read = fis.read();
        System.out.println((char) read);
        
        // 读取到末尾,返回‐1
        read = fis.read();
        System.out.println(read);

        // 关闭资源
        fis.close();
    }
}

/*
c
p
u
￿
-1
*/