/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-19 11:44:32
 * @LastEditTime: 2020-09-19 11:44:56
 * @FilePath: \java\IO\io23.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package com.cpucode.java;

import java.io.FileReader;
import java.io.IOException;

public class io23 {
    public static void main(String[] args) throws IOException {
        // 使用文件名称创建流对象
        FileReader fr = new FileReader("cpucode.txt");

        // 定义变量，保存数据
        int b;

        // 循环读取
        while ((b = fr.read()) != -1) {
            System.out.println((char) b);
        }

        // 关闭资源
        fr.close();
    }
}

/*
c
p
u
*/