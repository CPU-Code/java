/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-20 17:09:04
 * @LastEditTime: 2020-09-20 17:09:28
 * @FilePath: \java\IO\io42.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package com.cpucode.java;

import java.io.FileReader;
import java.io.IOException;

public class io42 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("cpucode_gbk.txt");
        int read;

        while ((read = fileReader.read()) != -1) {
            System.out.print((char)read);
        }
        fileReader.close();
    }
}

/*
3.cpucode
1.cpu
2.hello
4.java������
*/