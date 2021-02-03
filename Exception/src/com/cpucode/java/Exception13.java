/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-14 22:26:12
 * @LastEditTime: 2020-09-14 22:30:38
 * @FilePath: \java\Exception\Exception13.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package Exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Exception13 {
    public static void main(String[] args) throws IOException {
        read("a.txt");
    }

    public static void read(String path) throws FileNotFoundException, IOException {
        if(!path.equals("a.txt")){
            //如果不是 a.txt这个文件
            // 我假设 如果不是 a.txt 认为 该文件不存在 是一个错误 也就是异常 throw
            throw new FileNotFoundException("a文件不存在");
        }

        if(!path.equals("b.txt")){
            throw new IOException("b文件不存在");
        }
    }
}

/*
Exception in thread "main" java.io.IOException: b文件不存在
	at com.company.Main.read(Main.java:25)
	at com.company.Main.main(Main.java:14)
*/