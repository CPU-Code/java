package com.cpucode.java.socket.single;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * @author : cpucode
 * @date : 2021/8/9
 * @time : 16:55
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class ClientTcp {
    public static void main(String[] args) throws IOException {
        Socket socket = null;
        PrintWriter out = null;

        try {
            socket = new Socket("127.0.0.1",8080);
            out = new PrintWriter(socket.getOutputStream(), true);

            out.println("Hello, CpuCode");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(out != null){
                out.close();
            }
            if(socket != null){
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
