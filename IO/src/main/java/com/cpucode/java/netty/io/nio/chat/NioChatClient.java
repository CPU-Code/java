package com.cpucode.java.netty.io.nio.chat;

import com.sun.xml.internal.ws.api.client.SelectOptimalEncodingFeature;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/**
 * @author : cpucode
 * @date : 2021/8/12 10:19
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class NioChatClient {
    private final InetSocketAddress serverAdrress =
            new InetSocketAddress("localhost", 8080);
    private Selector selector = null;
    private SocketChannel client = null;

    private String nickName = "";
    private Charset charset = Charset.forName("UTF-8");
    private static String USER_EXIST = "系统提示：该昵称已经存在，请换一个昵称";
    private static String USER_CONTENT_SPILIT = "#@#";

    public NioChatClient() throws IOException{
        selector = Selector.open();
        //连接远程主机的IP和端口
        client = SocketChannel.open(serverAdrress);
        client.configureBlocking(false);
        client.register(selector, SelectionKey.OP_READ);
    }

    public static void main(String[] args) throws IOException {
        new NioChatClient().session();
    }

    public void session(){
        //开辟一个新线程从服务器端读数据
        new Reader().start();
        //开辟一个新线程往服务器端写数据
        new Writer().start();
    }

    private class Writer extends Thread{
        @Override
        public void run() {
            try{
                //在主线程中 从键盘读取数据输入到服务器端
                Scanner scan = new Scanner(System.in);
                while (scan.hasNextLine()){
                    String line = scan.nextLine();
                    if ("".equals(line)){
                        //不允许发空消息
                        continue;
                    }

                    if ("".equals(nickName)){
                        nickName = line;
                        line = nickName + USER_CONTENT_SPILIT;
                    }else {
                        line = nickName + USER_CONTENT_SPILIT + line;
                    }

                    //client既能写也能读，这边是写
                    client.write(charset.encode(line));
                }
                scan.close();
            }catch(Exception e){

            }
        }
    }

    private class Reader extends Thread {
        @Override
        public void run() {
            try{
                while(true) {
                    int readyChannels = selector.select();
                    if (readyChannels == 0){
                        continue;
                    }

                    //可以通过这个方法，知道可用通道的集合
                    Set<SelectionKey> selectedKeys = selector.selectedKeys();
                    Iterator<SelectionKey> keyIterator = selectedKeys.iterator();

                    while (keyIterator.hasNext()){
                        SelectionKey key = (SelectionKey) keyIterator.next();
                        keyIterator.remove();
                        process(key);
                    }
                }
            }catch(Exception e){

            }
        }

        private void process(SelectionKey key) throws IOException {
            if (key.isReadable()){
                //使用 NIOServerDemoBak 读取 Channel 中的数据，这个和全局变量client是一样的，
                // 因为只注册了一个SocketChannel , client既能写也能读，这边是读
                SocketChannel sc = (SocketChannel)key.channel();

                ByteBuffer buff = ByteBuffer.allocate(1024);
                String content = "";

                while (sc.read(buff) > 0){
                    buff.flip();
                    content += charset.decode(buff);
                }

                //若系统发送通知名字已经存在，则需要换个昵称
                if (USER_EXIST.equals(content)){
                    nickName = "";
                }

                System.out.println(content);
                key.interestOps(SelectionKey.OP_READ);
            }
        }
    }


}
