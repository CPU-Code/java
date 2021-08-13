package com.cpucode.netty.rpc.registry;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.codec.LengthFieldBasedFrameDecoder;
import io.netty.handler.codec.LengthFieldPrepender;
import io.netty.handler.codec.serialization.ClassResolver;
import io.netty.handler.codec.serialization.ClassResolvers;
import io.netty.handler.codec.serialization.ObjectDecoder;
import io.netty.handler.codec.serialization.ObjectEncoder;

/**
 * @author : cpucode
 * @date : 2021/8/13 8:55
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class RpcRegistry {
    private int port;

    public RpcRegistry(int port){
        this.port = port;
    }

    public static void main(String[] args) {
        new RpcRegistry(8080).start();
    }

    public void start(){
        EventLoopGroup bossGroup = new NioEventLoopGroup();
        EventLoopGroup workerGroup = new NioEventLoopGroup();

        try {
            ServerBootstrap b = new ServerBootstrap();

            b.group(bossGroup , workerGroup)
                    .channel(NioServerSocketChannel.class)
                    .childHandler(new ChannelInitializer<SocketChannel>() {
                        @Override
                        protected void initChannel(SocketChannel socketChannel) throws Exception {
                            ChannelPipeline pipeline = socketChannel.pipeline();
                            /**
                                 * 自定义协议解码器
                             *  入参有5个，分别解释如下
                             *    maxFrameLength：
                             *      框架的最大长度。如果帧的长度大于此值，则将抛出TooLongFrameException
                             *    lengthFieldOffset：
                             *      长度字段的偏移量：即对应的长度字段在整个消息数据中得位置
                             *    lengthFieldLength：
                             *      长度字段的长度。如：长度字段是int型表示，那么这个值就是4（long型就是8）
                             *    lengthAdjustment：
                             *      要添加到长度字段值的补偿值
                             *    initialBytesToStrip：
                             *      从解码帧中去除的第一个字节数
                             */
                            pipeline.addLast(new LengthFieldBasedFrameDecoder(Integer.MAX_VALUE,
                                    0, 4,
                                    0, 4));
                            //自定义协议编码器
                            pipeline.addLast(new LengthFieldPrepender(4));
                            //对象参数类型编码器
                            pipeline.addLast("encoder", new ObjectEncoder());

                            //对象参数类型解码器
                            pipeline.addLast("decoder", new ObjectDecoder(Integer.MAX_VALUE,
                                    ClassResolvers.cacheDisabled(null)));

                            pipeline.addLast(new RegistryHandler());

                        }
                    })
                    .option(ChannelOption.SO_BACKLOG, 128)
                    .childOption(ChannelOption.SO_KEEPALIVE, true);

            ChannelFuture future = b.bind(port).sync();
            System.out.println("Cp RPC Registry start listen at " + port );

            future.channel().closeFuture().sync();
        }catch (Exception e) {
            bossGroup.shutdownGracefully();
            workerGroup.shutdownGracefully();
        }
    }
}
