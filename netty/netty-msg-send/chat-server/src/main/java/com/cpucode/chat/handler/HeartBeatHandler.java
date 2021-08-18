package com.cpucode.chat.handler;

import com.cpucode.netty.imp.ImMessage;
import com.cpucode.netty.imp.ImP;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.timeout.IdleStateEvent;

/**
 * 心跳检测
 *
 * @author : cpucode
 * @date : 2021/8/17 13:57
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class HeartBeatHandler extends SimpleChannelInboundHandler<ImMessage> {

    int readIdleTimes = 0;

    @Override
    protected void messageReceived(ChannelHandlerContext channelHandlerContext,
                                   ImMessage imMessage) throws Exception {
        if (ImP.PING.name().equals(imMessage.getCmd())) {
            imMessage.setTime(System.currentTimeMillis());
            imMessage.setContent("copy that");
            imMessage.setSender(ImP.SYSTEM.name());
            imMessage.setCmd(ImP.PONG.name());

            channelHandlerContext.channel().writeAndFlush(imMessage);
        }else {
            channelHandlerContext.fireChannelRead(imMessage);
        }
    }

    @Override
    public void userEventTriggered(ChannelHandlerContext ctx, Object evt) throws Exception {
        IdleStateEvent event = (IdleStateEvent) evt;

        String eventType = null;
        switch (event.state()) {
            case READER_IDLE:
                eventType = "读空闲";
                // 读空闲的计数加1
                readIdleTimes++;
                break;
            case WRITER_IDLE:
                eventType = "写空闲";
                // 不处理
                break;
            case ALL_IDLE:
                eventType = "读写空闲";
                // 不处理
                break;
        }

        if (readIdleTimes > 3) {
            System.out.println(" [server]读空闲超过3次，关闭连接");
            ctx.channel().writeAndFlush(
                    new ImMessage(ImP.CLOSE.name(), System.currentTimeMillis(),
                            ImP.SYSTEM.name(), "you are out!"));
            ctx.channel().close();
        }

    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        super.channelActive(ctx);
    }
}
