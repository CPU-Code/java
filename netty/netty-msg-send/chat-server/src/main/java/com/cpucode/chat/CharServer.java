package com.cpucode.chat;

import com.cpucode.chat.handler.HeartBeatHandler;
import com.cpucode.chat.handler.HttpServerHandler;
import com.cpucode.chat.handler.TerminalServerHandler;
import com.cpucode.chat.handler.WebSocketServerHandler;
import com.cpucode.netty.imp.ImpDecoder;
import com.cpucode.netty.imp.ImpEncoder;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.codec.LengthFieldBasedFrameDecoder;
import io.netty.handler.codec.LengthFieldPrepender;
import io.netty.handler.codec.http.HttpObjectAggregator;
import io.netty.handler.codec.http.HttpServerCodec;
import io.netty.handler.codec.http.websocketx.WebSocketServerProtocolHandler;
import io.netty.handler.stream.ChunkedWriteHandler;
import io.netty.handler.timeout.IdleStateHandler;

import java.util.concurrent.TimeUnit;

/**
 * @author : cpucode
 * @date : 2021/8/17 13:57
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class CharServer {
    public static void main(String[] args) {
        new CharServer().start(8080);
    }

    public void start(int port) {
        EventLoopGroup bossGroup = new NioEventLoopGroup();
        EventLoopGroup workerGroup = new NioEventLoopGroup();

        ServerBootstrap server = new ServerBootstrap();
        try {
            server.group(bossGroup, workerGroup)
                    .channel(NioServerSocketChannel.class)
                    .option(ChannelOption.SO_BACKLOG, 1024)
                    .childHandler(new ChannelInitializer<SocketChannel>() {
                        @Override
                        protected void initChannel(SocketChannel ch) throws Exception {
                            ChannelPipeline pipeline = ch.pipeline();

                            /*解析自定义通讯协议*/
                            pipeline.addLast(new LengthFieldBasedFrameDecoder(61440,
                                    0, 2,
                                    0, 2));
                            pipeline.addLast(new ImpDecoder());
                            pipeline.addLast(new LengthFieldPrepender(2));
                            pipeline.addLast(new ImpEncoder());

                            /*心跳检测*/
                            pipeline.addLast(new IdleStateHandler(2, 2,
                                    2, TimeUnit.SECONDS));
                            pipeline.addLast(new HeartBeatHandler());

                            /*控制台处理*/
                            pipeline.addLast(new TerminalServerHandler());

                            /*解析Http请求*/
                            pipeline.addLast(new HttpServerCodec());
                            /*主要是将同一个Http请求或响应的多个消息对象变成一个fullHttpRequest完整的消息对象*/
                            pipeline.addLast(new HttpObjectAggregator(64 * 1024));
                            /*主要用于处理大数据流，比如1GB的文件，如果追额传输肯定会沾满JVM内存*/
                            pipeline.addLast(new ChunkedWriteHandler());

                            pipeline.addLast(new HttpServerHandler());

                            /*解析WebSocket请求*/
                            pipeline.addLast(new WebSocketServerProtocolHandler("/im"));
                            pipeline.addLast(new WebSocketServerHandler());
                        }
                    });



            ChannelFuture future = server.bind(port).sync();
            System.out.println("服务端已启动，监听端口:" + port);
            future.channel().closeFuture().sync();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            workerGroup.shutdownGracefully();
            bossGroup.shutdownGracefully();
        }
    }

    /**
     * 1、ChannelOption.SO_BACKLOG
     *   ChannelOption.SO_BACKLOG对应的是
     *          tcp/ip协议listen函数中的backlog参数，
     *   函数listen(int socketfd,int backlog)用来
     *      初始化服务端可连接队列，服务端处理客户端连接请求是顺序处理的，
     *      所以同一时间只能处理一个客户端连接，多个客户端来的时候，
     *      服务端将不能处理的客户端连接请求放在队列中等待处理，backlog参数指定了队列的大小
     *
     * 2、ChannelOption.SO_REUSEADDR
     *    ChanneOption.SO_REUSEADDR对应于套接字选项中的SO_REUSEADDR，这个参数表示允许重复使用本地地址和端口，
     *      比如，某个服务器进程占用了TCP的80端口进行监听，此时再次监听该端口就会返回错误，
     *      使用该参数就可以解决问题，该参数允许共用该端口，这个在服务器程序中比较常使用，
     *
     *      比如某个进程非正常退出，该程序占用的端口可能要被占用一段时间才能允许其他进程使用，
     *      而且程序死掉以后，内核一需要一定的时间才能够释放此端口，不设置SO_REUSEADDR就无法正常使用该端口。
     *
     * 3、ChannelOption.SO_KEEPALIVE
     *    Channeloption.SO_KEEPALIVE参数对应于套接字选项中的SO_KEEPALIVE，
     *    该参数用于设置TCP连接，当设置该选项以后，连接会测试链接的状态，
     *    这个选项用于可能长时间没有数据交流的连接。
     *    当设置该选项以后，如果在两小时内没有数据的通信时，TCP会自动发送一个活动探测数据报文。
     *
     * 4、ChannelOption.SO_SNDBUF 和 ChannelOption.SO_RCVBUF
     *   ChannelOption.SO_SNDBUF参数对应于 套接字选项中的SO_SNDBUF，
     *   ChannelOption.SO_RCVBUF参数对应于 套接字选项中的SO_RCVBUF
     *   这两个参数用于 操作接收缓冲区 和 发送缓冲区的大小 ，
     *   接收缓冲区用于 保存网络协议站内收到的数据，直到应用程序读取成功，
     *   发送缓冲区用于保存发送数据，直到发送成功。
     *
     * 5、ChannelOption.SO_LINGER
     *   ChannelOption.SO_LINGER参数对应于 套接字选项中的SO_LINGER,
     *   Linux内核默认的处理方式是当用户调用close（）方法的时候，函数返回，
     *   在可能的情况下，尽量发送数据，不一定保证会发生剩余的数据，造成了数据的不确定性，
     *   使用SO_LINGER可以阻塞close()的调用时间，直到数据完全发送
     *
     * 6、ChannelOption.TCP_NODELAY
     *   ChannelOption.TCP_NODELAY参数对应于 套接字选项中的TCP_NODELAY,
     *   该参数的使用与Nagle算法有关, Nagle算法是将小的数据包组装为更大的帧 然后进行发送，
     *   而不是输入一次发送一次, 因此在数据包不足的时候会等待其他数据的到了，组装成大的数据包进行发送，
     *   虽然该方式有效提高网络的有效负载，但是却造成了延时，
     *   而该参数的作用就是禁止使用Nagle算法，使用于小数据即时传输，于TCP_NODELAY相对应的是TCP_CORK，
     *   该选项是需要等到发送的数据量最大的时候，一次性发送数据，适用于文件传输。
     *
     * 7、IP_TOS
     *   IP参数，设置IP头部的Type-of-Service字段，用于描述 IP包的优先级和 QoS选项。
     *
     * 8、ALLOW_HALF_CLOSURE
     *   Netty参数，一个连接的远端关闭时本地端是否关闭，默认值为 False。
     *   值为False时，连接自动关闭；
     *   为True时，触发ChannelInboundHandler的userEventTriggered()方法，事件为ChannelInputShutdownEvent。
     *
     */
}
