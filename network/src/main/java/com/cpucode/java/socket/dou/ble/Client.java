package com.cpucode.java.socket.dou.ble;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * @author : cpucode
 * @date : 2021/8/9
 * @time : 17:16
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class Client {
    public static void main(String[] args) throws IOException {
        try {
            //找到目标的ip和端口
            Socket socket = new Socket("127.0.0.1", 8080);

            //控制台的输入流
            BufferedReader sin = new BufferedReader(new InputStreamReader(System.in));
            //在当前链接上写入输入
            PrintWriter os = new PrintWriter(socket.getOutputStream());
            //拿到输入流
            BufferedReader is = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            //获得控制台的输入
            String readLine = sin.readLine();

            while (!readLine.equals("bye")) {
                os.println(readLine);
                os.flush();

                System.out.println("Client : " + readLine);
                System.out.println("Server : " + is.readLine());

                //重新获取
                readLine = sin.readLine();
            }

            os.close();
            is.close();
            socket.close();
        }catch (Exception e){
            System.out.println("Error : " + e);
        }
    }
}
