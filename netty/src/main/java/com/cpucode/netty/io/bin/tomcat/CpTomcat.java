package com.cpucode.netty.io.bin.tomcat;

import com.cpucode.netty.io.bin.tomcat.http.CpRequest;
import com.cpucode.netty.io.bin.tomcat.http.CpResponse;
import com.cpucode.netty.io.bin.tomcat.http.CpServlet;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.codec.http.HttpRequest;
import io.netty.handler.codec.http.HttpRequestDecoder;
import io.netty.handler.codec.http.HttpResponseEncoder;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * Netty就是一个同时支持多协议的网络通信框架
 *
 * @author : cpucode
 * @date : 2021/8/12 13:46
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class CpTomcat {
    private int port = 8080;

    private Map<String, CpServlet> servletMapping = new HashMap<String, CpServlet>();

    private Properties webxml = new Properties();

    public static void main(String[] args) {
        new CpTomcat().start();
    }

    public void start(){
        init();

        //Netty封装了NIO，Reactor模型，Boss，worker
        // Boss 线程
        EventLoopGroup bossGroup = new NioEventLoopGroup();
        // Worker 线程
        EventLoopGroup workerGroup = new NioEventLoopGroup();

        try {
            // Netty服务
            //ServetBootstrap   ServerSocketChannel
            ServerBootstrap server = new ServerBootstrap();

            // 链路式编程
            server.group(bossGroup , workerGroup)
                    // 主线程处理类,看到这样的写法，底层就是用反射
                    .channel(NioServerSocketChannel.class)
                    // 子线程处理类 , Handler
                    .childHandler(new ChannelInitializer<SocketChannel>() {
                        /**
                         * 客户端初始化处理
                         * @param client
                         * @throws Exception
                         */
                        @Override
                        protected void initChannel(SocketChannel client) throws Exception {
                            // 无锁化串行编程
                            //Netty对HTTP协议的封装，顺序有要求
                            // HttpResponseEncoder 编码器
                            client.pipeline().addLast(new HttpResponseEncoder());

                            // HttpRequestDecoder 解码器
                            client.pipeline().addLast(new HttpRequestDecoder());

                            // 业务逻辑处理
                            client.pipeline().addLast(new CpTomcatHandler());
                        }
                    })
                    // 针对主线程的配置 分配线程最大数量 128
                    .option(ChannelOption.SO_BACKLOG, 128)
                    // 针对子线程的配置 保持长连接
                    .childOption(ChannelOption.SO_KEEPALIVE, true);

            // 启动服务器
            ChannelFuture f = server.bind(port).sync();
            System.out.println("Cp Tomcat 已启动，监听的端口是：" + port);

            f.channel().closeFuture().sync();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            // 关闭线程池
            bossGroup.shutdownGracefully();
            workerGroup.shutdownGracefully();
        }
    }

    private void init(){
        //加载web.xml文件,同时初始化 ServletMapping对象
        try{
            String WEB_INF = this.getClass().getResource("/").getPath();
            FileInputStream fis = new FileInputStream(WEB_INF + "web.properties");

            webxml.load(fis);

            for (Object k : webxml.keySet()) {

                String key = k.toString();
                if(key.endsWith(".url")){
                    String url = webxml.getProperty(key);

                    String servletName = key.replaceAll("\\.url$", "");
                    String className = webxml.getProperty(servletName + ".className");
                    CpServlet obj = (CpServlet)Class.forName(className).newInstance();

                    servletMapping.put(url, obj);
                }
            }

        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public class CpTomcatHandler extends ChannelInboundHandlerAdapter {
        @Override
        public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
            if (msg instanceof HttpRequest){
                HttpRequest req = (HttpRequest) msg;

                // 转交给我们自己的request实现
                CpRequest request = new CpRequest(ctx, req);

                // 转交给我们自己的response实现
                CpResponse response = new CpResponse(ctx, req);

                // 实际业务处理
                String url = request.getUrl();

                if(servletMapping.containsKey(url)){
                    servletMapping.get(url).service(request, response);
                }else {
                    response.write("404 - Not Found");
                }
            }
        }

        @Override
        public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause)
                throws Exception {
        }
    }
}
