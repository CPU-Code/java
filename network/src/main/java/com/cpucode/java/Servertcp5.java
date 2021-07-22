/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-20 11:32:10
 * @LastEditTime: 2020-09-20 11:43:05
 * @FilePath: \java\network\Servertcp5.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package network;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Servertcp5 {
    public static void main(String[] args) throws IOException {
        System.out.println("服务器启动, 等待连接");
        // 1.创建 ServerSocket 对象，绑定端口，开始等待连接
        ServerSocket serverSocket = new ServerSocket(666);

        //循环接收,建立连接
        while (true) {
            // 2.接收连接 accept 方法, 返回 socket 对象.
            Socket accept = serverSocket.accept();

            //socket对象交给子线程处理,进行读写操作
            // Runnable接口中,只有一个run方法,使用lambda表达式简化格式
            new Thread(() -> {
                try (
                    // 创建流对象
                    // 获取输入流,读取文件数据
                    BufferedInputStream bis = new BufferedInputStream(accept.getInputStream());
                    // 创建输出流,保存到本地
                    FileOutputStream fis = new FileOutputStream(System.currentTimeMillis() + ".jpg");
                    BufferedOutputStream bos = new BufferedOutputStream(fis);
                ){
                    //  读写数据
                    byte[] b = new byte[1024 * 8];
                    int len;

                    while ((len = bis.read(b)) != -1) {
                        bos.write(b, 0, len);
                    }

                    // 4.=======信息回写===========================
                    System.out.println("back-------");
                    OutputStream out = accept.getOutputStream();
                    out.write("上传成功".getBytes());
                    out.close();
                    //================================

                    // 7.关闭资源
                    bos.close();
                    bis.close();
                    accept.close();

                    System.out.println("文件上传成功");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }
}

/*
服务器启动, 等待连接
back-------
文件上传成功
*/