package com.cpucode.java.netty.io.nio.buffer;

import java.nio.ByteBuffer;

/**
 * 手动分配缓冲区
 *
 * @author : cpucode
 * @date : 2021/8/12 9:11
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class BufferWrap {
    public static void main(String[] args) {
        // 分配指定大小的缓冲区
        ByteBuffer allocate = ByteBuffer.allocate(10);
        output("allocate : ", allocate);

        byte array[] = new byte[8];
        ByteBuffer buffer = ByteBuffer.wrap(array);
        output("buffer : ", buffer);
    }

    /**
     * 把这个缓冲里面实时状态给答应出来
     * @param step
     * @param buffer
     */
    public static void output(String step, ByteBuffer buffer) {
        System.out.println(step + " : ");

        //当前操作数据所在的位置，也可以叫做游标
        System.out.print("position: " + buffer.position() + ", ");

        //锁定值，flip，数据操作范围索引只能在position - limit 之间
        System.out.print("limit: " + buffer.limit() + ", ");

        //容量，数组大小
        System.out.println("capacity: " + buffer.capacity());

        System.out.println();
    }
}
