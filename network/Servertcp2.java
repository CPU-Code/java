/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-19 22:33:57
 * @LastEditTime: 2020-09-19 22:45:22
 * @FilePath: \java\network\Servertcp2.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package network;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Servertcp2 {
    public static void main(String[] args) throws IOException {
        System.out.println("服务器启动, 等待连接");
        // 1.创建 ServerSocket 对象，绑定端口，开始等待连接
        ServerSocket ss = new ServerSocket(666);

        // 2.接收连接 accept 方法, 返回 socket 对象.
        Socket server = ss.accept();

        // 3.通过socket 获取输入流
        InputStream is = server.getInputStream();

        // 4.一次性读取数据
        // 4.1 创建字节数组
        byte[] b = new byte[1024];

        // 4.2 据读取到字节数组中
        int len = is.read(b);

        // 4.3 解析数组,打印字符串信息
        String msg = new String(b, 0, len);
        System.out.println(msg);

        // =================回写数据=======================
        // 5. 通过 socket 获取输出流
        OutputStream out = server.getOutputStream();
        // 6. 回写数据
        out.write("你好, 我很好".getBytes());

        // 7.关闭资源
        out.close();
        is.close();
        server.close();
    }
}

/*
服务器启动, 等待连接
你好 cpucode
*/