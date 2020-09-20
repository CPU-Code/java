/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-20 11:32:06
 * @LastEditTime: 2020-09-20 11:43:29
 * @FilePath: \java\network\Clienttcp5.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package network;

import java.io.*;
import java.net.Socket;

public class Clienttcp5 {
    public static void main(String[] args) throws IOException {
        // 1.创建流对象
        // 1.1 创建输入流,读取本地文件
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("test.jpg"));

        // // 1.2 创建输出流,写到服务端
        Socket socket = new Socket("localhost", 666);

        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());

        //.写出数据
        byte[] b = new byte[1024 * 8];
        int len;

        while ((len = bis.read(b)) != -1) {
            bos.write(b, 0, len);
            bos.flush();
        }

        // 关闭输出流,通知服务端,写出数据完毕
        socket.shutdownOutput();
        System.out.println("文件发送完毕");

        // 3. =====解析回写============
        InputStream in = socket.getInputStream();
        byte[] back = new byte[20];
        in.read(back);
        System.out.println(new String(back));
        in.close();
        //=============

        // 关闭资源
        bos.close();
        socket.close();
        bis.close();

        System.out.println("文件上传完毕 ");
    }
}

/*
文件发送完毕
上传成功        
文件上传完毕 
*/