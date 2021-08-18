package com.cpucode.netty.by.te.buf;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

/**
 * @author : cpucode
 * @date : 2021/8/18 9:06
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class NettyByteBuf01 {
    public static void main(String[] args) {
        /**
         * 创建一个ByteBuf
         *  说明
         *    1. 创建 对象，该对象包含一个数组arr , 是一个byte[10]
         *    2. 在netty 的buffer中，不需要使用flip 进行反转
         *       底层维护了 readerindex 和 writerIndex
         *    3. 通过 readerindex 和  writerIndex 和  capacity， 将buffer分成三个区域
         *       0---readerindex 已经读取的区域
         *       readerindex---writerIndex ， 可读的区域
         *       writerIndex -- capacity, 可写的区域
         */
        ByteBuf buffer = Unpooled.buffer(10);

        for (int i = 0; i < 10; i++) {
            buffer.writeByte(i);
        }

        System.out.println("capacity = " + buffer.capacity());

        //输出
        for(int i = 0; i < buffer.capacity(); i++) {
            // 使用getByte时，不会改变readIndex位置
            System.out.print(buffer.getByte(i) + " ");
        }
        System.out.println();

        for (int i = 0; i < buffer.capacity(); i++) {
            System.out.print(buffer.readByte() + " ");
        }

        System.out.println("执行完毕");
    }
}
