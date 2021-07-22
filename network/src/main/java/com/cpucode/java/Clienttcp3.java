package com.cpucode.java;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.Socket;

public class Clienttcp3 {
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

        System.out.println("文件发送完毕");

        // 关闭资源
        bos.close();
        socket.close();
        bis.close();

        System.out.println("文件上传完毕 ");
    }
}

/*
文件发送完毕
文件上传完毕 
*/