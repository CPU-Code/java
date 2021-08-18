package com.cpucode.netty.handler.client;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

/**
 * @author : cpucode
 * @date : 2021/8/18 9:55
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class MyClientHandler extends SimpleChannelInboundHandler<Long> {
    @Override
    protected void channelRead0(ChannelHandlerContext channelHandlerContext, Long aLong) throws Exception {
        System.out.println("服务器的ip = " + channelHandlerContext.channel().remoteAddress());
        System.out.println("收到服务器消息 = " + aLong);
    }

    /**
     * 重写channelActive 发送数据
     * @param ctx
     * @throws Exception
     */
    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        System.out.println("MyClientHandler 发送数据");

        //ctx.writeAndFlush(Unpooled.copiedBuffer(""));
        //发送的是一个long
        ctx.writeAndFlush(123456L);
    }
}
