package com.cpucode.netty.rpc.consumer;

import com.cpucode.netty.rpc.api.IRpcHelloService;
import com.cpucode.netty.rpc.api.IRpcService;
import com.cpucode.netty.rpc.consumer.proxy.RpcProxy;

/**
 * @author : cpucode
 * @date : 2021/8/13 8:56
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class RpcConsumer {
    public static void main(String[] args) {
        IRpcHelloService rpcHello = RpcProxy.create(IRpcHelloService.class);
        System.out.println(rpcHello.hello("cpuCode"));

        IRpcService service = RpcProxy.create(IRpcService.class);

        System.out.println("8 + 2 = " + service.add(8, 2));
        System.out.println("8 - 2 = " + service.sub(8, 2));
        System.out.println("8 * 2 = " + service.mult(8, 2));
        System.out.println("8 / 2 = " + service.div(8, 2));
    }
}
