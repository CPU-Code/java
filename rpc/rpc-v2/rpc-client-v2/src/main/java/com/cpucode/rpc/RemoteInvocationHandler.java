package com.cpucode.rpc;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author : cpucode
 * @date : 2021/8/11 15:24
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class RemoteInvocationHandler implements InvocationHandler {
    private String host;
    private int port;
    private String version;

    public RemoteInvocationHandler(String host, int port) {
        this.host = host;
        this.port = port;
    }

    public RemoteInvocationHandler(String host, int port, String version) {
        this.host = host;
        this.port = port;
        this.version = version;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //请求会进入到这里
        System.out.println("come in");

        //请求数据的包装
        RpcRequest rpcRequest=new RpcRequest();
        rpcRequest.setClassName(method.getDeclaringClass().getName());
        rpcRequest.setMethodName(method.getName());
        rpcRequest.setParameters(args);

        if (this.version != null){
            rpcRequest.setVersion(version);
        }


        //远程通信
        RpcNetTransport netTransport = new RpcNetTransport(host, port);
        Object result = netTransport.send(rpcRequest);

        return result;
    }
}
