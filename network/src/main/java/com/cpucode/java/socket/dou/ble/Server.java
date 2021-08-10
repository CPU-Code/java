package com.cpucode.java.socket.dou.ble;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author : cpucode
 * @date : 2021/8/9
 * @time : 17:09
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket server = null;

        // 创建一个ServerSocket 在端口8080监听容户请求
        server = new ServerSocket(8080);

        Socket socket = null;

        try{
            /**
             * 使用accept()阻塞等待客户请求,有容户
             * 请求到来则产生一个Socket对象,并继续执行
             */
            socket = server.accept();
        }catch (Exception e){
            System.out.println("Error : " + e);
        }

        String line;
        //由Socket耐象得到输入流,并构造相应的BufferedReader耐象
        BufferedReader is = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        // 由Socket耐象得到输出流,并构造 PrintWriter 耐象
        PrintWriter os = new PrintWriter(socket.getOutputStream());

        // 由系统标准输入设备构造BufferedReader耐象
        BufferedReader sin = new BufferedReader(new InputStreamReader(System.in));
        // 在标准腧出上打印从客户端渎入的字符串
        System.out.println("Client : " + is.readLine());

        //获得控制台输入的数据
        line = sin.readLine();

        //从标准输入读入一字符串
        while (!line.equals("bye")){
            //写回到客户端
            os.println(line);
            os.flush();

            //读取客户端传过来的数据
            System.out.println("Server : " + line);
            System.out.println("Client : " + is.readLine());

            //重新读取控制台的数据
            line = sin.readLine();
        }

        os.close();
        is.close();
        socket.close();
        server.close();
    }
}
