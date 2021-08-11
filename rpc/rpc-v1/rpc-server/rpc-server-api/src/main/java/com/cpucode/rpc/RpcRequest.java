package com.cpucode.rpc;

import lombok.Data;

import java.io.Serializable;

/**
 * @author : cpucode
 * @date : 2021/8/11
 * @time : 13:42
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
@Data
public class RpcRequest implements Serializable {
    private String className;
    private String methodName;
    private Object[] parameters;
}
