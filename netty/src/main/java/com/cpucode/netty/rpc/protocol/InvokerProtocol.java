package com.cpucode.netty.rpc.protocol;

import lombok.Data;

import java.io.Serializable;

/**
 * 自定义传输协议
 *
 * @author : cpucode
 * @date : 2021/8/13 8:54
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
@Data
public class InvokerProtocol implements Serializable {
    /**
     * 类名
     */
    private String className;
    /**
     * 函数名称
     */
    private String methodName;
    /**
     * 形参列表
     */
    private Class<?>[] parames;
    /**
     * 实参列表
     */
    private Object[] values;
}
