package com.cpucode.netty.simple;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.channel.ChannelPipeline;
import io.netty.util.CharsetUtil;

/**
 * 1. 我们自定义一个Handler 需要继续netty 规定好的某个HandlerAdapter(规范)
 * 2. 这时我们自定义一个Handler , 才能称为一个handler
 *
 * @author : cpucode
 * @date : 2021/8/17 17:06
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class NettyServerHandler extends ChannelInboundHandlerAdapter {
    /**
     * 读取数据实际(这里我们可以读取客户端发送的消息)
     *  1. ChannelHandlerContext ctx:上下文对象, 含有 管道pipeline , 通道channel, 地址
     *  2. Object msg: 就是客户端发送的数据 默认Object
     * @param ctx
     * @param msg
     * @throws Exception
     */
    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        System.out.println("服务器读取线程 " + Thread.currentThread().getName() +
                " channle =" + ctx.channel());
        System.out.println("server ctx =" + ctx);
        System.out.println("看看channel 和 pipeline的关系");

        Channel channel = ctx.channel();
        //本质是一个双向链接, 出站入站
        ChannelPipeline pipeline = ctx.pipeline();

        //将 msg 转成一个 ByteBuf
        //ByteBuf 是 Netty 提供的，不是 NIO 的 ByteBuffer.
        ByteBuf buf = (ByteBuf)msg;

        System.out.println("客户端发送消息是:" + buf.toString(CharsetUtil.UTF_8));
        System.out.println("客户端地址:" + channel.remoteAddress());
    }

    /**
     * 数据读取完毕
     * @param ctx
     * @throws Exception
     */
    @Override
    public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {
        //writeAndFlush 是 write + flush
        //将数据写入到缓存，并刷新
        //一般讲，我们对这个发送的数据进行编码
        ctx.writeAndFlush(Unpooled.copiedBuffer("hello, 客户端 读完毕了", CharsetUtil.UTF_8));
    }

    /**
     * 处理异常, 一般是需要关闭通道
     * @param ctx
     * @param cause
     * @throws Exception
     */
    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        ctx.close();
    }
}
