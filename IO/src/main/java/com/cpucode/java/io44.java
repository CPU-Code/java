/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-20 17:25:35
 * @LastEditTime: 2020-09-20 17:30:24
 * @FilePath: \java\IO\io44.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package com.cpucode.java;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class io44 {
    public static void main(String[] args) throws IOException {
        // 定义文件路径
        String FileName = "cpucode_out_utf.txt";
        // 创建流对象,默认UTF8编码
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(FileName));
        // 写出数据
        osw.write("cpucode好");
        osw.close();

        // 定义文件路径
        String FileName2 = "cpucode_out_gbk.txt";
        // 创建流对象,指定GBK编码
        OutputStreamWriter osw2 = new OutputStreamWriter(new FileOutputStream(FileName2), "GBK");
        // 写出数据
        osw2.write("cpucode好");
        osw2.close();
    }
}

/*
cpucode��
cpucode好
*/