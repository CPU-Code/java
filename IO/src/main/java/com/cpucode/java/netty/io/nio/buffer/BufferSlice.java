package com.cpucode.java.netty.io.nio.buffer;

import java.nio.ByteBuffer;

/**
 * 缓冲区分片
 *
 * @author : cpucode
 * @date : 2021/8/12 9:04
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class BufferSlice {
    public static void main(String[] args) {
        ByteBuffer buffer = ByteBuffer.allocate(10);

        // 缓冲区中的数据0-9
        for (int i = 0; i < buffer.capacity(); i++) {
            buffer.put((byte) i);
        }

        // 创建子缓冲区
        buffer.position(3);
        buffer.limit(7);

        ByteBuffer slice = buffer.slice();

        // 改变子缓冲区的内容
        for (int i = 0; i < slice.capacity(); ++i) {
            byte b = slice.get(i);
            b *= 10;
            slice.put(i, b);
        }

        buffer.position(0);
        buffer.limit(buffer.capacity());

        while (buffer.remaining() > 0){
            System.out.print(buffer.get() + "   ");
        }

    }
}
