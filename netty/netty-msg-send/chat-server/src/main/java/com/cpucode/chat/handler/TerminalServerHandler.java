package com.cpucode.chat.handler;

import com.cpucode.netty.imp.ImMessage;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

/**
 * 对自定义协议的支持
 * 用于处理Java控制台发过来的Java Object 消息体
 *
 * @author : cpucode
 * @date : 2021/8/17 14:22
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class TerminalServerHandler extends SimpleChannelInboundHandler<ImMessage> {
    private MsgProcessor processor = new MsgProcessor();

    @Override
    protected void messageReceived(ChannelHandlerContext channelHandlerContext, ImMessage imMessage) throws Exception {

    }
}
