/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-19 19:53:07
 * @LastEditTime: 2020-09-19 20:02:07
 * @FilePath: \java\IO\io40.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package com.cpucode.java;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class io40 {
    public static void main(String[] args) throws IOException {
        // 创建流对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("cpucode.txt"));

        // 写出数据
        bw.write("cpu");

        // 写出换行
        bw.newLine();

        bw.write("流弊");
        bw.newLine();

        // 释放资源
        bw.close();
    }
}

/*
cpu
流弊

*/