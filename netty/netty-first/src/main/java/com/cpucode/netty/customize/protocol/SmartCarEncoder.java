package com.cpucode.netty.customize.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

/**
 * 自己定义的协议
 *  数据包格式
 * +——----——+——-----——+——----——+
 * |协议开始标志|  长度             |   数据       |
 * +——----——+——-----——+——----——+
 * 1.协议开始标志head_data，为int类型的数据，16进制表示为0X76
 * 2.传输数据的长度contentLength，int类型
 * 3.要传输的数据
 *
 * @author : cpucode
 * @date : 2021/8/19 13:09
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class SmartCarEncoder extends MessageToByteEncoder<SmartCarProtocol> {

    @Override
    protected void encode(ChannelHandlerContext channelHandlerContext,
                          SmartCarProtocol smartCarProtocol, ByteBuf byteBuf) throws Exception {
        // 写入消息SmartCar的具体内容
        // 1.写入消息的开头的信息标志(int类型)
        byteBuf.writeInt(smartCarProtocol.getHead_data());
        // 2.写入消息的长度(int 类型)
        byteBuf.writeInt(smartCarProtocol.getContentLength());
        // 3.写入消息的内容(byte[]类型)
        byteBuf.writeBytes(smartCarProtocol.getContent());
    }
}
