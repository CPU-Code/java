
package com.cpucode.java;

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