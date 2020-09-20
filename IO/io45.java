/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-20 17:36:15
 * @LastEditTime: 2020-09-20 17:37:06
 * @FilePath: \java\IO\io45.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package IO;

import java.io.*;

public class io45 {
    public static void main(String[] args) throws IOException {
        //.定义文件路径
        String srcFile = "cpucode_gbk.txt";
        String destFile = "cpucode_out_utf.txt";

        //创建流对象
        //转换输入流,指定GBK编码
        InputStreamReader isr = new InputStreamReader(new FileInputStream(srcFile), "GBK");
        // 转换输出流,默认utf8编码
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(destFile));

        //.读写数据
        //  定义数组
        char[] cbuf = new char[1024];
        //定义长度
        int len;
        // 循环读取
        while ((len = isr.read(cbuf)) != -1) {
            //循环写出
            osw.write(cbuf, 0, len);
        }

        // 释放资源
        osw.close();
        isr.close();
    }
}

/*
3.cpucode
1.cpu
2.hello
4.java最流弊
*/