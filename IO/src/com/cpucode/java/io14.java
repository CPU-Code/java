/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-18 22:59:16
 * @LastEditTime: 2020-09-18 23:01:38
 * @FilePath: \java\IO\io14.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package IO;

import java.io.FileOutputStream;
import java.io.IOException;

public class io14 {
    public static void main(String[] args) throws IOException {
        // 使用文件名称创建流对象
        FileOutputStream fos = new FileOutputStream("cpucode.txt");

        // 字符串转换为字节数组
        byte[] b = "cpucode".getBytes();

        // 写出字节数组数据
        fos.write(b);

        // 关闭资源
        fos.close();
    }
}

/*
cpucode
*/