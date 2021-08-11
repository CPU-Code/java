package com.cpucode.rpc;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author : cpucode
 * @date : 2021/8/11
 * @time : 13:43
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class RpcProxyServer {
    ExecutorService executorService = Executors.newCachedThreadPool();

    public void publisher(Object service, int port){
        ServerSocket serverSocket = null;

        try {
            serverSocket = new ServerSocket(port);

            while (true){
                //不断接受请求 , BIO
                Socket socket = serverSocket.accept();
                //每一个socket 交给一个processorHandler来处理
                executorService.execute(new ProcessorHandler(socket, service));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(serverSocket!=null){
                try {
                    serverSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
