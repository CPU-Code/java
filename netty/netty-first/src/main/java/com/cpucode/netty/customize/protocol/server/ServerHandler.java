package com.cpucode.netty.customize.protocol.server;

import com.cpucode.netty.customize.protocol.SmartCarProtocol;
import io.netty.channel.ChannelHandlerAdapter;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

/**
 * @author : cpucode
 * @date : 2021/8/19 13:11
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class ServerHandler extends SimpleChannelInboundHandler<SmartCarProtocol> {

    @Override
    protected void channelRead0(ChannelHandlerContext channelHandlerContext,
                                SmartCarProtocol smartCarProtocol) throws Exception {

        System.out.println("Server接受的客户端的信息 :" + smartCarProtocol.toString());

        // 会写数据给客户端
        String str = "Hi I am Server ...";
        SmartCarProtocol response = new SmartCarProtocol(str.getBytes().length, str.getBytes());
        // 当服务端完成写操作后，关闭与客户端的连接
        channelHandlerContext.writeAndFlush(response);
        // .addListener(ChannelFutureListener.CLOSE);

        // 当有写操作时，不需要手动释放msg的引用
        // 当只有读操作时，才需要手动释放msg的引用
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause)
            throws Exception {
        // cause.printStackTrace();
        ctx.close();
    }
}
