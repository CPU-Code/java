/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-19 22:28:02
 * @LastEditTime: 2020-09-19 22:30:39
 * @FilePath: \java\network\Clienttcp1.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package network;

import java.io.OutputStream;
import java.net.Socket;

public class Clienttcp1 {
    public static void main(String[] args) throws Exception {
        System.out.println("客户端 发送数据");

        // 1.创建 Socket ( ip , port ) , 确定连接到哪里.
        Socket client = new Socket("localhost", 666);

        // 2.获取流对象 . 输出流
        OutputStream os = client.getOutputStream();
        // 3.写出数据.
        os.write("你好 cpucode".getBytes());

        // 4. 关闭资源 .
        os.close();
        client.close();
    }
}

/*
客户端 发送数据
*/