/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-20 17:11:01
 * @LastEditTime: 2020-09-20 17:22:40
 * @FilePath: \java\IO\io43.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package IO;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class io43 {
    public static void main(String[] args) throws IOException {
        String FileName = "cpucode_gbk.txt";

        InputStreamReader isr = new InputStreamReader(new FileInputStream(FileName));

        InputStreamReader isr2 = new InputStreamReader(new FileInputStream(FileName), "GBK");

        int read;

        while ((read = isr.read()) != -1) {
            System.out.print((char)read);
        }

        isr.close();

        System.out.println();

        while ((read = isr2.read()) != -1) {
            System.out.print((char)read);
        }
        isr2.close();
    }
}

/*
3.cpucode
1.cpu
2.hello
4.java������
3.cpucode
1.cpu
2.hello
4.java最流弊
*/