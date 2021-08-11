package com.cpucode.rpc;

import java.lang.reflect.Proxy;

/**
 * @author : cpucode
 * @date : 2021/8/11
 * @time : 13:44
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class RpcProxyClient {
    public <T> T clientProxy(final Class<T> interfaceCls,
                             final String host,
                             final int port){
        return (T) Proxy.newProxyInstance(interfaceCls.getClassLoader(),
                new Class<?>[]{interfaceCls},
                new RemoteInvocationHandler(host, port));
    }
}
