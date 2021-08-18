package com.cpucode.chat.handler;

import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.codec.http.FullHttpRequest;

import java.io.File;
import java.net.URL;

/**
 * 对HTTP的支持
 *  处理服务端分发请求的逻辑
 *
 * @author : cpucode
 * @date : 2021/8/17 14:10
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class HttpServerHandler extends SimpleChannelInboundHandler<FullHttpRequest> {
    /**
     * 获取class路径
     */
    private URL baseURL = HttpServerHandler.class.getResource("");

    private final String webroot = "webroot";


    @Override
    protected void messageReceived(ChannelHandlerContext channelHandlerContext,
                                   FullHttpRequest fullHttpRequest) throws Exception {

    }

    public File getResource(String fileName) throws Exception {
        String basePath = baseURL.toURI().toString();
        int start = basePath.indexOf("classes/");

        basePath = String.format("%s/classes/",
                basePath.substring(0, start).replaceAll("/+", "/"));
        String path =
                String.format("%s%s/%s", basePath,
                        webroot, fileName);

        path = !path.contains("file:") ? path : path.substring(5);
        path = path.replaceAll("//", "/");

        return new File(path);
    }


    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        Channel channel = ctx.channel();
        System.out.println("Client异常:" + channel.remoteAddress());
        cause.printStackTrace();
        ctx.close();
    }
}
