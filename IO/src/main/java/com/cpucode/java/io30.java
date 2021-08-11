/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-19 14:57:33
 * @LastEditTime: 2020-09-19 14:59:22
 * @FilePath: \java\IO\io30.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package com.cpucode.java;

import java.io.FileWriter;
import java.io.IOException;

public class io30 {
    public static void main(String[] args) throws IOException {
        // 使用文件名称创建流对象，可以续写数据
        FileWriter fw = new FileWriter("cpucode.txt", true);

        // 写出字符串
        fw.write("cpucode好");

        // 写出换行
        fw.write("\r\n");

        // 写出字符串
        fw.write("流弊");

        // 关闭资源
        fw.close();
    }
}

/*
cpucode好uccpucode好
流弊
*/