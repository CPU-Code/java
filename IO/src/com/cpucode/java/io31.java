/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-19 15:13:39
 * @LastEditTime: 2020-09-19 15:14:04
 * @FilePath: \java\IO\io31.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package IO;

import java.io.FileWriter;
import java.io.IOException;

public class io31 {
    public static void main(String[] args) {
        // 声明变量
        FileWriter fw = null;

        try{
            //创建流对象
            fw = new FileWriter("cpucode.txt");
            // 写出数据
            fw.write("cpucode好");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(fw != null) {
                    fw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

/*
cpucode好
*/