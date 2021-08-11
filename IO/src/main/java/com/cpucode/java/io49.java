/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-20 20:11:44
 * @LastEditTime: 2020-09-20 20:14:17
 * @FilePath: \java\IO\io49.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package com.cpucode.java;

import java.io.IOException;
import java.io.PrintStream;

public class io49 {
    public static void main(String[] args) throws IOException {
        // 调用系统的打印流,控制台直接输出
        System.out.println("cpucode");

        // 创建打印流,指定文件的名称
        PrintStream ps = new PrintStream("cpucode_out.txt");
        // 设置系统的打印流流向,输出到ps.txt
        System.setOut(ps);

        // 调用系统的打印流,ps.txt中输出
        System.out.println("cpucode");
    }
}

/*
cpucode
*/