/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-19 14:47:55
 * @LastEditTime: 2020-09-19 14:48:18
 * @FilePath: \java\IO\io28.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package com.cpucode.java;

import java.io.FileWriter;
import java.io.IOException;

public class io28 {
    public static void main(String[] args) throws IOException {
        // 使用文件名称创建流对象
        FileWriter fw = new FileWriter("cpucode.txt");

        // 字符串转换为字节数组
        char[] chars = "cpucode".toCharArray();

        // 写出字符数组
        fw.write(chars);

        // 写出从索引2开始，2个字节
        fw.write(chars, 2, 2);

        // 关闭资源
        fw.close();
    }
}

/*
cpucodeuc
*/