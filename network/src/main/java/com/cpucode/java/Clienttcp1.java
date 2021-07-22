package com.cpucode.java;

import java.io.OutputStream;
import java.net.Socket;

public class Clienttcp1 {
    public static void main(String[] args) throws Exception {
        System.out.println("客户端 发送数据");

        // 1.创建 Socket ( ip , port ) , 确定连接到哪里.
        Socket client = new Socket("192.168.184.1", 10000);

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