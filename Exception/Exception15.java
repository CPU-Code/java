/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-15 09:59:51
 * @LastEditTime: 2020-09-15 10:02:40
 * @FilePath: \java\Exception\Exception15.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package Exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Exception15 {
    public static void main(String[] args) throws IOException {
        try{
            // 可能产生异常的代码
            // 当产生异常时，必须有处理方式。要么捕获，要么声明。
            read("b.txt");
        } catch(FileNotFoundException e) {
            // 实现对捕获到的异常进行处理
            //try中抛出的是什么异常，在括号中就定义什么异常类型
            System.out.println(e);
        } finally {
            System.out.println("都必须执行这");
        }

        System.out.println("over");
    }

    // 我们 当前的这个方法中 有异常 有编译期异常
    public static void read(String path) throws FileNotFoundException{
        if(!path.equals("a.txt")) {
            //如果不是 a.txt这个文件
            // 我假设 如果不是 a.txt 认为 该文件不存在 是一个错误 也就是异常 throw
            throw new FileNotFoundException("文件不存在");
        }
    }
}

/*
java.io.FileNotFoundException: 文件不存在
都必须执行这
over
*/