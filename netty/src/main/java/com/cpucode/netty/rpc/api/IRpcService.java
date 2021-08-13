package com.cpucode.netty.rpc.api;

/**
 * @author : cpucode
 * @date : 2021/8/13 8:53
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public interface IRpcService {
    /**
     * 加
     * */
    public int add(int a,int b);

    /**
     * 减
     **/
    public int sub(int a,int b);

    /**
     * 乘
     * */
    public int mult(int a,int b);

    /**
     * 除
     * */
    public int div(int a,int b);
}
