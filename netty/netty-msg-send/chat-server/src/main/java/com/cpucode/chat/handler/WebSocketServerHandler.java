package com.cpucode.chat.handler;

import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.codec.http.websocketx.TextWebSocketFrame;

/**
 * WebSocket协议支持
 * 处理浏览器发送的WebSocket的请求
 *
 * @author : cpucode
 * @date : 2021/8/17 14:22
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class WebSocketServerHandler extends SimpleChannelInboundHandler<TextWebSocketFrame> {
    private MsgProcessor processor = new MsgProcessor();

    @Override
    protected void messageReceived(ChannelHandlerContext channelHandlerContext,
                                   TextWebSocketFrame textWebSocketFrame) throws Exception {
        processor.sendMsg(channelHandlerContext.channel(), textWebSocketFrame.text());
    }


    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        Channel channel = ctx.channel();
        String addr = processor.getAddress(channel);

        System.out.println("WebSocket Client:" + addr + "异常");

        cause.printStackTrace();
        ctx.close();
    }

}
