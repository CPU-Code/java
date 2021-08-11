package com.cpucode.rpc;

/**
 * @author : cpucode
 * @date : 2021/8/11
 * @time : 13:38
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class App {
    public static void main(String[] args) {
        IHelloService helloService = new HelloServiceImpl();
        RpcProxyServer proxyServer = new RpcProxyServer();

        proxyServer.publisher(helloService, 8080);
    }
}
