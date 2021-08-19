package com.cpucode.netty.handler.client;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;

/**
 * @author : cpucode
 * @date : 2021/8/18 9:49
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class MyClient {
    public static void main(String[] args) {
        EventLoopGroup group = new NioEventLoopGroup();
        try {
            Bootstrap bootStrap = new Bootstrap();

            bootStrap.group(group)
                    .channel(NioSocketChannel.class)
                    //自定义一个初始化类
                    .handler(new MyClientInitializer());
            ChannelFuture channelFuture = bootStrap.connect("localhost", 8001).sync();

            channelFuture.channel().closeFuture().sync();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            group.shutdownGracefully();
        }
    }
}
