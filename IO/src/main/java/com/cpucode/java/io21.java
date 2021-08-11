/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-19 11:09:28
 * @LastEditTime: 2020-09-19 11:09:53
 * @FilePath: \java\IO\io21.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package com.cpucode.java;

import java.io.FileInputStream;
import java.io.IOException;

public class io21 {
    public static void main(String[] args) throws IOException {
        // 使用文件名称创建流对象
        FileInputStream fis = new FileInputStream("cpucode.txt");

        // 定义变量，作为有效个数
        int len;
        // 定义字节数组，作为装字节数据的容器
        byte[] b = new byte[2];

        // 循环读取
        while ((len = fis.read(b)) != -1) {
            // 每次读取后,把数组变成字符串打印
            // len 每次读取的有效字节个数
            System.out.println(new String(b, 0, len));
        }

        // 关闭资源
        fis.close();
    }
}

/*
cp
u
*/