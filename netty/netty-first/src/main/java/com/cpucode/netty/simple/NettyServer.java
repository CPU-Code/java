package com.cpucode.netty.simple;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;

/**
 * @author : cpucode
 * @date : 2021/8/17 17:07
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class NettyServer {
    public static void main(String[] args) {
        /**
         * 创建BossGroup 和 WorkerGroup
         *  说明
         *    1. 创建两个线程组 bossGroup 和 workerGroup
         *    2. bossGroup 只是处理连接请求 , 真正的和客户端业务处理，会交给 workerGroup完成
         *    3. 两个都是无限循环
         *    4. bossGroup 和 workerGroup 含有的子线程(NioEventLoop)的个数
         *       默认实际 cpu核数 * 2
         */

        EventLoopGroup bossGroup = new NioEventLoopGroup(1);
        EventLoopGroup workerGroup = new NioEventLoopGroup();

        try {
            //创建服务器端的启动对象，配置参数
            ServerBootstrap bootstrap = new ServerBootstrap();

            //使用链式编程来进行设置
            // 设置两个线程组
            bootstrap.group(bossGroup, workerGroup)
                    //使用NioSocketChannel 作为服务器的通道实现
                    .channel(NioServerSocketChannel.class)
                    // 设置线程队列得到连接个数
                    .option(ChannelOption.SO_BACKLOG, 128)
                    //设置保持活动连接状态
                    .childOption(ChannelOption.SO_KEEPALIVE, true)
                    // 该 handler对应 bossGroup , childHandler 对应 workerGroup
                    //.handler(null)
                    .childHandler(new ChannelInitializer<SocketChannel>() {
                        /**
                         * //创建一个通道初始化对象(匿名对象) 给pipeline 设置处理器
                         * @param socketChannel
                         * @throws Exception
                         */
                        @Override
                        protected void initChannel(SocketChannel socketChannel) throws Exception {
                            //可以使用一个集合管理 SocketChannel， 再推送消息时，
                            //可以将业务加入到各个channel 对应的
                            // NIOEventLoop 的 taskQueue 或者 scheduleTaskQueue
                            System.out.println("客户socketchannel hashcode=" + socketChannel.hashCode());
                            socketChannel.pipeline().addLast(new NettyServerHandler());
                        }
                    });
            // 给我们的workerGroup 的 EventLoop 对应的管道设置处理器
            System.out.println(".....服务器 is ready...");

            //绑定一个端口并且同步, 生成了一个 ChannelFuture 对象
            //启动服务器(并绑定端口)
            ChannelFuture cf = bootstrap.bind(6668).sync();

            //给cf 注册监听器，监控我们关心的事件
            cf.addListener(new ChannelFutureListener() {
                @Override
                public void operationComplete(ChannelFuture future) throws Exception {
                    if (cf.isSuccess()) {
                        System.out.println("监听端口 6668 成功");
                    } else {
                        System.out.println("监听端口 6668 失败");
                    }
                }
            });

            //对关闭通道进行监听
            cf.channel().closeFuture().sync();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            bossGroup.shutdownGracefully();
            workerGroup.shutdownGracefully();
        }
    }
}
