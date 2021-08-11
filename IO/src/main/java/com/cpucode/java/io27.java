/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-19 14:26:27
 * @LastEditTime: 2020-09-19 14:26:57
 * @FilePath: \java\IO\io27.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package com.cpucode.java;

import java.io.FileWriter;
import java.io.IOException;

public class io27 {
    public static void main(String[] args) throws IOException {
        // 使用文件名称创建流对象
        FileWriter fw = new FileWriter("cpucode.txt");

        // 写出数据，通过flush
        // 写出第1个字符
        fw.write('刷');
        fw.flush();
        // 继续写出第2个字符，写出成功
        fw.write('新');
        fw.flush();

        // 写出数据，通过close
        fw.write('c');      // 写出第1个字符
        fw.close();
        // 继续写出第2个字符,【报错】java.io.IOException: Stream closed
        //fw.write('p');
        //fw.close();
    }
}

/*
刷新c
*/