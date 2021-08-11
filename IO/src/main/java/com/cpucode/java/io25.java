/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-19 12:42:37
 * @LastEditTime: 2020-09-19 14:17:28
 * @FilePath: \java\IO\io25.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */

package com.cpucode.java;

import java.io.FileReader;
import java.io.IOException;

public class io25{
    public static void main(String[] args) throws IOException {
        //使用文件名称创建流对象
        FileReader fr = new FileReader("cpucode.txt");

        // 定义变量，保存有效字符个数
        int len;
        // 定义字符数组，作为装字符数据的容器
        char[] cbuf = new char[2];

        //循环读取
        while ((len = fr.read(cbuf)) != -1) {
            System.out.println(new String(cbuf, 0, len));
        }

        //关闭资源
        fr.close();
    }
}
/*
cp
u
*/