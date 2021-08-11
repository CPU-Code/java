/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-19 14:22:20
 * @LastEditTime: 2020-09-19 14:22:43
 * @FilePath: \java\IO\io26.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package com.cpucode.java;

import java.io.FileWriter;
import java.io.IOException;

public class io26 {
    public static void main(String[] args) throws IOException {
        // 使用文件名称创建流对象
        FileWriter fw = new FileWriter("cpucode.txt");

        // 写出数据
        fw.write(99);        // 写出第1个字符
        fw.write('c');
        fw.write('p');
        fw.write(30000);        // 写出第4个字符，中文编码表中30000对应一个汉字

        /*
        【注意】关闭资源时,与FileOutputStream不同。
        如果不关闭,数据只是保存到缓冲区，并未保存到文件。
        */
        fw.close();
    }
}

/*
ccp田
*/