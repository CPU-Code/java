/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-19 11:24:47
 * @LastEditTime: 2020-09-19 11:25:11
 * @FilePath: \java\IO\io22.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class io22 {
    public static void main(String[] args) throws IOException {
        // 使用文件名称创建流对象
        FileInputStream fis = new FileInputStream("test.jpg");

        //指定目的地
        FileOutputStream fos = new FileOutputStream("test_copy.jpg");

        //  定义长度
        int len;
        // 定义数组
        byte[] b = new byte[1024];

        // 循环读取
        while ((len = fis.read(b)) != -1) {
            //写出数据
            fos.write(b, 0, len);
        }

        // 关闭资源
        fos.close();
        fis.close();
    }
}
