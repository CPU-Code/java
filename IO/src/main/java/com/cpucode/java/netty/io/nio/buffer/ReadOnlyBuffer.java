package com.cpucode.java.netty.io.nio.buffer;

import java.nio.ByteBuffer;

/**
 * 只读缓冲区
 *
 * @author : cpucode
 * @date : 2021/8/12 9:57
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class ReadOnlyBuffer {
    public static void main(String[] args) {
        ByteBuffer buffer = ByteBuffer.allocate( 10 );

        // 缓冲区中的数据0-9
        for (int i = 0; i < buffer.capacity(); i++) {
            buffer.put( (byte)i );
        }

        // 创建只读缓冲区
        ByteBuffer readonly = buffer.asReadOnlyBuffer();

        // 改变原缓冲区的内容
        for (int i = 0; i < readonly.capacity(); i++) {
            byte b = readonly.get(i);
            b *= 10;

            readonly.put(i, b);
        }

        readonly.position(0);
        readonly.limit(buffer.capacity());

        // 只读缓冲区的内容也随之改变
        while (readonly.remaining()>0) {
            System.out.print( readonly.get() + "  ");
        }
    }
}
