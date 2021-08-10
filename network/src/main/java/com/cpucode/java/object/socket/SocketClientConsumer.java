package com.cpucode.java.object.socket;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 * @author : cpucode
 * @date : 2021/8/10
 * @time : 9:48
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class SocketClientConsumer {
    public static void main(String[] args) {
        Socket socket = null;
        ObjectOutputStream out = null;

        try {
            socket = new Socket("127.0.0.1", 8080);
            User user = new User();
            user.setName("cpuCode");
            out = new ObjectOutputStream(socket.getOutputStream());

            out.writeObject(user);
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if(out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
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
