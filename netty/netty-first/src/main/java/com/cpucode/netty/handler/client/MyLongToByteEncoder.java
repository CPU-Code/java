package com.cpucode.netty.handler.client;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

/**
 * @author : cpucode
 * @date : 2021/8/18 9:55
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class MyLongToByteEncoder extends MessageToByteEncoder<Long> {

    /**
     * 编码方法
     * @param channelHandlerContext
     * @param aLong
     * @param byteBuf
     * @throws Exception
     */
    @Override
    protected void encode(ChannelHandlerContext channelHandlerContext,
                          Long aLong, ByteBuf byteBuf) throws Exception {
        System.out.println("MyLongToByteEncoder encode 被调用");
        System.out.println("msg = " + aLong);

        byteBuf.writeLong(aLong);
    }
}
