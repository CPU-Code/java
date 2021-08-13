package com.cpucode.netty.rpc.provider;

import com.cpucode.netty.rpc.api.IRpcService;

/**
 * @author : cpucode
 * @date : 2021/8/13 8:55
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class RpcServiceImpl implements IRpcService {

    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int sub(int a, int b) {
        return a - b;
    }

    @Override
    public int mult(int a, int b) {
        return a * b;
    }

    @Override
    public int div(int a, int b) {
        return a / b;
    }
}
