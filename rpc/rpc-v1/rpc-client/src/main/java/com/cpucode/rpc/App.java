package com.cpucode.rpc;

/**
 * @author : cpucode
 * @date : 2021/8/11
 * @time : 13:37
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class App {
    public static void main(String[] args) {
        RpcProxyClient rpcProxyClient = new RpcProxyClient();
        IHelloService iHelloService =
                rpcProxyClient.clientProxy(IHelloService.class, "localhost", 8080);

        String result = iHelloService.sayHello("cpuCode");

        System.out.println(result);
    }
}
