package com.cpucode.java.netty.io.nio.chat;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.nio.charset.Charset;

/**
 * @author : cpucode
 * @date : 2021/8/12 10:19
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class NioChatClient {
    private final InetSocketAddress serverAdrress = new InetSocketAddress("localhost", 8080);
    private Selector selector = null;
    private SocketChannel client = null;

    private String nickName = "";
    private Charset charset = Charset.forName("UTF-8");
    private static String USER_EXIST = "系统提示：该昵称已经存在，请换一个昵称";
    private static String USER_CONTENT_SPILIT = "#@#";

    public static void main(String[] args) throws IOException {
        new NioChatClient().session();
    }

    public void session(){
        //开辟一个新线程从服务器端读数据
        new Reader().start();
        //开辟一个新线程往服务器端写数据
        new Writer().start();
    }
}
