/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-18 23:14:21
 * @LastEditTime: 2020-09-18 23:17:55
 * @FilePath: \java\IO\io17.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package com.cpucode.java;

import java.io.FileOutputStream;
import java.io.IOException;

public class io17 {
    public static void main(String[] args) throws IOException {
        // 使用文件名称创建流对象
        FileOutputStream fos = new FileOutputStream("cpucode.txt", true);

        // 定义字节数组
        byte[] words = {11, 22, 33, 44, 55, 66};

        // 遍历数组
        for (int i = 0; i < words.length; i++){
            // 写出一个字节
            fos.write(words[i]);
            // 写出一个换行, 换行符号转成数组写出
            fos.write("\r\n".getBytes());
        }
        // 关闭资源
        fos.close();
    }
}

/*
uccpucode

!
,
7
B

*/