package com.cpucode.netty.tcp.protocol;

import lombok.Data;

/**
 * 协议包
 *
 * @author : cpucode
 * @date : 2021/8/18 13:44
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
@Data
public class MessageProtocol {
    //关键
    private int len;
    private byte[] content;
}
