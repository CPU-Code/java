/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-20 20:11:44
 * @LastEditTime: 2020-09-20 20:13:14
 * @FilePath: \java\IO\io49.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package IO;

import java.io.IOException;
import java.io.PrintStream;

public class io49 {
    public static void main(String[] args) throws IOException {
        System.out.println("cpucode");

        PrintStream ps = new PrintStream("cpucode_out.txt");

        System.setOut(ps);

        System.out.println("cpucode");
    }
}

/*
cpucode
*/