package com.cpucode.java.netty.io.nio.channel;

import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author : cpucode
 * @date : 2021/8/12 10:03
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class FileInputDemo {
    public static void main(String[] args) throws Exception{
        FileInputStream fin =
                new FileInputStream("D:\\Date\\github\\java\\io\\src\\main\\java\\com\\cpucode\\java\\netty\\io\\nio\\cpuCode.txt");
        // 获取通道
        FileChannel channel = fin.getChannel();

        // 创建缓冲区
        ByteBuffer buffer = ByteBuffer.allocate(1024);

        // 读取数据到缓冲区
        channel.read(buffer);

        buffer.flip();

        while (buffer.remaining() > 0){
            byte b = buffer.get();

            System.out.print((char) b + "  ");
        }

        fin.close();
    }
}
