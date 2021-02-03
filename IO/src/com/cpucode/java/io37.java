/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-19 18:39:59
 * @LastEditTime: 2020-09-19 19:41:18
 * @FilePath: \java\IO\io37.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package IO;

import java.io.*;

public class io37 {
    public static void main(String[] args) throws FileNotFoundException {
        // 记录开始时间
        long start = System.currentTimeMillis();

        // 创建流对象
        try(
                BufferedInputStream bis = new BufferedInputStream(new FileInputStream("cpucode.txt"));
                BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("cpu.txt"));
        ){
            // 读写数据
            int b;
            while ((b = bis.read()) != -1) {
                bos.write(b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 记录结束时间
        long end = System.currentTimeMillis();
        System.out.println("缓冲流复制时间:" + (end - start) + "毫秒");
    }
}

/*
缓冲流复制时间:1毫秒
*/