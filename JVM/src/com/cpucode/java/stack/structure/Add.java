package com.cpucode.java.stack.structure;

/**
 * @author : cpucode
 * @Date : 2021/1/21
 * @Time : 19:02
 * @Github : https://github.com/CPU-Code
 * @CSDN : https://blog.csdn.net/qq_44226094
 */
public class Add {
    public static void main(String[] args) {
        int i = 2;
        int j = 3;

        int k = i + j;

        System.out.println("cpucode");
    }
}

/**
 *  0 iconst_2
 *  1 istore_1
 *  2 iconst_3
 *  3 istore_2
 *  4 iload_1
 *  5 iload_2
 *  6 iadd
 *  7 istore_3
 *  8 getstatic #2 <java/lang/System.out>
 * 11 ldc #3 <cpucode>
 * 13 invokevirtual #4 <java/io/PrintStream.println>
 * 16 return
 * */