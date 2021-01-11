package com.cpucode.java.direct.memory;

import java.nio.ByteBuffer;
import java.util.ArrayList;

/**
 * 本地内存的OOM:  OutOfMemoryError: Direct buffer memory
 * @author: cpucode
 * @Date: 2021/1/8
 * @Time: 17:24
 * @Github: https://github.com/CPU-Code
 * @CSDN: https://blog.csdn.net/qq_44226094
 */
public class DirectMemoryOom {
    /**
     * 20MB
     * */
    private static final int BUFFER = 1024 * 1024 * 20;

    public static void main(String[] args) {
        ArrayList<ByteBuffer> list = new ArrayList<>();

        int count = 0;

        try{
            while (true){
                ByteBuffer byteBuffer = ByteBuffer.allocateDirect(BUFFER);

                list.add(byteBuffer);
                count++;

            }
        } finally {
            System.out.println(count);
        }
    }
}

/*
174
Exception in thread "main" java.lang.OutOfMemoryError: Direct buffer memory

* */