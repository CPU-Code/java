package com.cpucode.netty.handler.server;

import com.cpucode.netty.handler.client.MyLongToByteEncoder;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;

/**
 * @author : cpucode
 * @date : 2021/8/18 9:40
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class MyServerInitializer extends ChannelInitializer<SocketChannel> {
    @Override
    protected void initChannel(SocketChannel socketChannel) throws Exception {
        ChannelPipeline pipeline = socketChannel.pipeline();

        //入站的handler进行解码 MyByteToLongDecoder
        pipeline.addLast(new MyByteToLongDecoder());
        //出站的handler进行编码
        pipeline.addLast(new MyLongToByteEncoder());

        //自定义的handler 处理业务逻辑
        pipeline.addLast(new MyServerHandler());

        System.out.println("initChannel 执行完毕");
    }
}
