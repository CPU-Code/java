package com.cpucode.java.object.socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author : cpucode
 * @date : 2021/8/10
 * @time : 9:43
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class SocketServerProvider {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = null;

        try{
            serverSocket = new ServerSocket(8080);
            Socket socket = serverSocket.accept();

            ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
            User user = (User)in.readObject();

            System.out.println(user);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (serverSocket != null){
                serverSocket.close();
            }
        }

    }
}
