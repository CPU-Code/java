package com.cpucode.netty.customize.protocol.client;

import com.cpucode.netty.customize.protocol.SmartCarProtocol;
import io.netty.channel.ChannelHandlerAdapter;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.util.ReferenceCountUtil;

/**
 * 用于读取客户端发来的信息
 *
 * @author : cpucode
 * @date : 2021/8/19 13:11
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class ClientHandler extends SimpleChannelInboundHandler<SmartCarProtocol> {

    /**
     * 客户端与服务端，连接成功的售后
     * @param ctx
     * @throws Exception
     */
    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        // 发送SmartCar协议的消息
        // 要发送的信息
        String data = "I am client ...";
        // 获得要发送信息的字节数组
        byte[] content = data.getBytes();
        // 要发送信息的长度
        int contentLength = content.length;

        SmartCarProtocol protocol = new SmartCarProtocol(contentLength, content);

        ctx.writeAndFlush(protocol);
    }


    // 只是读数据，没有写数据的话
    // 需要自己手动的释放的消息
    @Override
    protected void channelRead0(ChannelHandlerContext channelHandlerContext,
                                SmartCarProtocol smartCarProtocol) throws Exception {
        try {
            // 用于获取客户端发来的数据信息
            System.out.println("Client接受的客户端的信息 :" + smartCarProtocol.toString());

        } finally {
            ReferenceCountUtil.release(smartCarProtocol);
        }
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause)
            throws Exception {
        ctx.close();
    }
}
