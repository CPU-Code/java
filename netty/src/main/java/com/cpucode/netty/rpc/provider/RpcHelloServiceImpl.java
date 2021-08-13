package com.cpucode.netty.rpc.provider;

import com.cpucode.netty.rpc.api.IRpcHelloService;

/**
 * @author : cpucode
 * @date : 2021/8/13 8:55
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class RpcHelloServiceImpl implements IRpcHelloService {
    @Override
    public String hello(String name) {
        return "Hello " + name + "!";
    }
}
