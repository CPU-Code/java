package com.cpucode.java.netty.io.nio.chat;

import com.sun.org.apache.bcel.internal.generic.Select;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.*;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 网络多客户端聊天室
 * 功能1： 客户端通过Java NIO连接到服务端，支持多客户端的连接
 * 功能2：客户端初次连接时，服务端提示输入昵称，如果昵称已经有人使用，提示重新输入，
 *      如果昵称唯一，则登录成功，之后发送消息都需要按照规定格式带着昵称发送消息
 * 功能3：客户端登录后，发送已经设置好的欢迎信息和在线人数给客户端，并且通知其他客户端该客户端上线
 * 功能4：服务器收到已登录客户端输入内容，转发至其他登录客户端。
 *
 * @author : cpucode
 * @date : 2021/8/12 10:19
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class NioChatServer {
    private int port = 8080;
    private Charset charset = Charset.forName("UTF-8");
    /**
     * 用来记录在线人数，以及昵称
     */
    private static HashSet<String> users = new HashSet<String>();

    private static String USER_EXIST = "系统提示：该昵称已经存在，请换一个昵称";
    /**
     * 相当于自定义协议格式，与客户端协商好
     */
    private static String USER_CONTENT_SPILIT = "#@#";

    private Selector selector = null;

    public NioChatServer(int port) throws IOException {
        this.port = port;
        ServerSocketChannel server = ServerSocketChannel.open();

        server.bind(new InetSocketAddress(this.port));
        server.configureBlocking(false);

        selector = Selector.open();
        server.register(selector, SelectionKey.OP_ACCEPT);

        System.out.println("服务已启动，监听端口是：" + this.port);
    }

    public static void main(String[] args) throws IOException {
        new NioChatServer(8080).listen();
    }


    /**
     * 开始监听
     */
    public void listen() throws IOException{
        while(true) {
            int select = selector.select();
            if (select == 0){
                continue;
            }

            //可以通过这个方法，知道可用通道的集合
            Set<SelectionKey> keys = selector.selectedKeys();
            Iterator<SelectionKey> iterator = keys.iterator();
            while(iterator.hasNext()) {
                SelectionKey key = (SelectionKey) iterator.next();
                iterator.remove();

                process(key);
            }
        }
    }

    public void process(SelectionKey key) throws IOException {
        if(key.isAcceptable()){
            ServerSocketChannel server = (ServerSocketChannel) key.channel();
            SocketChannel client = server.accept();
            //非阻塞模式
            client.configureBlocking(false);

            //注册选择器，并设置为读取模式，收到一个连接请求，然后起一个 SocketChannel ，
            // 并注册到 selector 上，之后这个连接的数据，就由这个 SocketChannel 处理
            client.register(selector, SelectionKey.OP_READ);

            //将此对应的 channel 设置为准备接受其他客户端请求
            key.interestOps(SelectionKey.OP_ACCEPT);

            client.write(charset.encode("请输入你的昵称"));
        }

        //处理来自客户端的数据读取请求
        if (key.isReadable()) {
            //返回该SelectionKey对应的 Channel，其中有数据需要读取
            SocketChannel client = (SocketChannel)key.channel();

            ByteBuffer buff = ByteBuffer.allocate(1024);
            StringBuilder content = new StringBuilder();
            try{
                while (client.read(buff) > 0){
                    buff.flip();
                    content.append(charset.decode(buff));
                }

                //将此对应的channel设置为准备下一次接受数据
                key.interestOps(SelectionKey.OP_READ);
            }catch (IOException io){
                key.cancel();
                if(key.channel() != null) {
                    key.channel().close();
                }
            }
            if(content.length() > 0) {
                String[] arrayContent = content.toString().split(USER_CONTENT_SPILIT);

                //注册用户
                if(arrayContent != null && arrayContent.length == 1) {
                    String nickName = arrayContent[0];
                    if (users.contains(nickName)){
                        client.write(charset.encode(USER_EXIST));
                    }else {
                        users.add(nickName);
                        int onlineCount = onlineCount();
                        String message = "欢迎" + nickName +
                                "进入聊天室! 当前在线人数:" + onlineCount;

                        broadCast(null, message);
                    }
                }
                //注册完了，发送消息
                else if (arrayContent != null && arrayContent.length > 1){
                    String nickName = arrayContent[0];
                    String message = content.substring(nickName.length() + USER_CONTENT_SPILIT.length());

                    message = nickName + "说 " + message;
                    if (users.contains(nickName)){
                        //不回发给发送此内容的客户端
                        broadCast(client, message);
                    }
                }
            }
        }

    }

    public int onlineCount() {
        int res = 0;

        for(SelectionKey key : selector.keys()){
            Channel target = key.channel();

            if (target instanceof SocketChannel){
                res++;
            }
        }

        return res;
    }

    public void broadCast(SocketChannel client, String content) throws IOException {
        //广播数据到所有的SocketChannel中
        for (SelectionKey key : selector.keys()){
            Channel targetChannel = key.channel();

            //如果client不为空，不回发给发送此内容的客户端
            if (targetChannel instanceof SocketChannel && targetChannel != client){
                SocketChannel target = (SocketChannel)targetChannel;
                target.write(charset.encode(content));
            }
        }
    }

}
