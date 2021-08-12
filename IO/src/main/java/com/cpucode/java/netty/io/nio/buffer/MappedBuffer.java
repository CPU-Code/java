package com.cpucode.java.netty.io.nio.buffer;

import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/**
 * IO映射缓冲区
 *
 * @author : cpucode
 * @date : 2021/8/12 9:49
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class MappedBuffer {
    static private final int start = 0;
    static private final int size = 26;

    public static void main(String[] args) throws Exception{
        RandomAccessFile rw =
                new RandomAccessFile("D:\\Date\\github\\java\\io\\src\\main\\java\\com\\cpucode\\java\\netty\\io\\nio\\cpuCode.txt", "rw");

        FileChannel fc = rw.getChannel();

        //把缓冲区跟文件系统进行一个映射关联
        //只要操作缓冲区里面的内容，文件内容也会跟着改变
        MappedByteBuffer map = fc.map(FileChannel.MapMode.READ_WRITE, start, size);

        map.put(0, (byte)97);
        map.put(25, (byte)122);

        rw.close();
    }
}
