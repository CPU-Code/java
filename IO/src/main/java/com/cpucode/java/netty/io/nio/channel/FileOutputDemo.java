package com.cpucode.java.netty.io.nio.channel;

import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author : cpucode
 * @date : 2021/8/12 10:08
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class FileOutputDemo {
    static private final byte message[] = { 83, 111, 109, 101, 32, 98, 121, 116, 101, 115, 46 };

    public static void main(String[] args) throws Exception{
        FileOutputStream fout =
                new FileOutputStream("D:\\Date\\github\\java\\io\\src\\main\\java\\com\\cpucode\\java\\netty\\io\\nio\\cpuCode.txt");

        FileChannel fc = fout.getChannel();

        ByteBuffer buffer = ByteBuffer.allocate( 1024 );

        for (int i = 0; i < message.length; ++i) {
            buffer.put(message[i]);
        }

        buffer.flip();
        fc.write(buffer);

        fout.close();
    }
}
