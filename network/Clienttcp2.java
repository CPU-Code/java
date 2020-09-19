/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-19 22:44:34
 * @LastEditTime: 2020-09-19 22:45:33
 * @FilePath: \java\network\Clienttcp2.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package network;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Clienttcp2 {
    public static void main(String[] args) throws Exception {
        System.out.println("客户端 发送数据");

        // 1.创建 Socket ( ip , port ) , 确定连接到哪里.
        Socket client = new Socket("localhost", 666);

        // 通过 Scoket, 获取输出流对象
        OutputStream os = client.getOutputStream();
        // 3.写出数据.
        os.write("你好 cpucode".getBytes());

        // ==============解析回写=========================
        // 4. 通过 Scoket,获取 输入流对象
        InputStream in = client.getInputStream();

        //读取数据数据
        byte[] b = new byte[100];
        int len = in.read(b);

        System.out.println(new String(b, 0, len));
        // 关闭资源
        in.close();
        os.close();
        client.close();
    }
}

/*
客户端 发送数据
你好, 我很好
*/