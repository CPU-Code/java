/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-19 15:19:20
 * @LastEditTime: 2020-09-19 15:23:39
 * @FilePath: \java\IO\io33.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package IO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class io33 {
    public static void main(String[] args) throws IOException {
        // 创建流对象
        final FileReader fr = new FileReader("cpucode.txt");
        FileWriter fw = new FileWriter("cpu.txt");

        /*
        // 引入到try中
        try (fr : fw){
            // 定义变量
            int b;
            // 读取数据
            while ((b = fr.read()) != -1){
                // 写出数据
                fw.write(b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        */
    }
}

/*
cpucode好
*/