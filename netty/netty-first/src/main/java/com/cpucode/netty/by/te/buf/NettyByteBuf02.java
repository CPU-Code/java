package com.cpucode.netty.by.te.buf;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

import java.nio.charset.Charset;

/**
 * @author : cpucode
 * @date : 2021/8/18 9:12
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class NettyByteBuf02 {
    public static void main(String[] args) {
        //创建ByteBuf
        ByteBuf byteBuf = Unpooled.copiedBuffer("123456789", Charset.forName("UTF-8"));

        //使用相关的方法
        if(byteBuf.hasArray()) {
            byte[] content = byteBuf.array();

            //将 content 转成字符串
            System.out.println(new String(content, Charset.forName("utf-8")));
            System.out.println("byteBuf = " + byteBuf);

            System.out.println("arrayOffset = " + byteBuf.arrayOffset());
            System.out.println("readerIndex = " + byteBuf.readerIndex());
            System.out.println("writerIndex = " + byteBuf.writerIndex());
            System.out.println("capacity = " + byteBuf.capacity());

            System.out.println("readByte = " + byteBuf.readByte());
            System.out.println("getByte = " + byteBuf.getByte(0));

            //可读的字节数  12
            int len = byteBuf.readableBytes();
            System.out.println("len = " + len);

            //使用for取出各个字节
            for(int i = 0; i < len; i++) {
                System.out.print((char) byteBuf.getByte(i) + " ");
            }
            System.out.println();

            //按照某个范围读取
            System.out.println(byteBuf.getCharSequence(0, 4, Charset.forName("utf-8")) + " ");
            System.out.println(byteBuf.getCharSequence(4, 6, Charset.forName("utf-8")) + " ");
        }
    }
}
