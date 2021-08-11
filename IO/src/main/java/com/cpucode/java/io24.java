/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-19 11:47:48
 * @LastEditTime: 2020-09-19 11:48:08
 * @FilePath: \java\IO\io24.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package com.cpucode.java;

import java.io.FileReader;
import java.io.IOException;

public class io24 {
    public static void main(String[] args) throws IOException {
        // 使用文件名称创建流对象
        FileReader fr = new FileReader("cpucode.txt");

        // 定义变量，保存数据
        int len;

        char[] cbuf = new char[2];
        // 循环读取
        while ((len = fr.read(cbuf)) != -1) {
            System.out.println(new String(cbuf));
        }

        // 关闭资源
        fr.close();
    }
}

/*
cp
up
*/