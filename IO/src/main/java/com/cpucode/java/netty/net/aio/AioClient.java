package com.cpucode.java.netty.net.aio;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousSocketChannel;
import java.nio.channels.CompletionHandler;

/**
 * AIO客户端
 *
 * @author : cpucode
 * @date : 2021/8/11
 * @time : 8:51
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class AioClient {
    private final AsynchronousSocketChannel client;

    public static void main(String[] args) throws Exception {
        new AioClient().connect("localhost",8080);
    }

    public AioClient() throws Exception{
        client = AsynchronousSocketChannel.open();
    }

    public void connect(String host, int port)throws Exception{
        client.connect(new InetSocketAddress(host, port), null,
                new CompletionHandler<Void, Void>() {
                    @Override
                    public void completed(Void result, Void attachment){
                        try {
                            client.write(ByteBuffer.wrap("这是一条测试数据".getBytes())).get();

                            System.out.println("已发送至服务器");
                        } catch (Exception ex) {
                            ex.printStackTrace();
                        }
                    }

                    @Override
                    public void failed(Throwable exc, Void attachment) {
                        exc.printStackTrace();
                    }
        });


        final ByteBuffer bb = ByteBuffer.allocate(1024);
        client.read(bb, null,
                new CompletionHandler<Integer, Object>(){
                    @Override
                    public void completed(Integer result, Object attachment) {
                        System.out.println("IO操作完成 : " + result);

                        System.out.println("获取反馈结果 : " + new String(bb.array()));
                    }

                    @Override
                    public void failed(Throwable exc, Object attachment) {
                        exc.printStackTrace();
                    }
        });

        try {
            Thread.sleep(Integer.MAX_VALUE);
        } catch (InterruptedException ex) {
            System.out.println(ex);
        }
    }
}
