package com.cpucode.java.instruction.analysis;

import org.junit.jupiter.api.Test;

/**
 * 指令3：类型转换指令
 * @author : cpucode
 * @Date : 2021/1/25
 * @Time : 20:42
 * @Github : https://github.com/CPU-Code
 * @CSDN : https://blog.csdn.net/qq_44226094
 */
public class ClassCastTest {
    /**
     * 宽化类型转换
     * 针对于宽化类型转换的基本测试
     */
    public void upCast1(){
        int i = 10;
        long l = i;
        float f = i;
        double d = i;

        float f1 = l;
        double d1 = l;

        double d2 = f1;

        /**
         *   0    1   2 3  4  5 6  7   8 9  10 11
         *  this  i    l   f   d   f1   d1   d2
         *
         *  0 bipush 10     把 10 加载到栈
         *  2 istore_1      把 10 存储到局部变量 i
         *  3 iload_1       把 i 加载到栈
         *  4 i2l           把 int 转换为 long
         *  5 lstore_2      把 栈中 i 存储到 l
         *  6 iload_1       把 i 加载到 栈
         *  7 i2f           把栈中 int i 转换为 float
         *  8 fstore 4      把 栈中 i 存储到 f
         * 10 iload_1
         * 11 i2d
         * 12 dstore 5
         * 14 lload_2
         * 15 l2f
         * 16 fstore 7
         * 18 lload_2
         * 19 l2d
         * 20 dstore 8
         * 22 fload 7
         * 24 f2d
         * 25 dstore 10
         * */
    }

    /**
     * 举例：精度损失的问题
     * */
    @Test
    public void upCast2(){
        int i = 11111111;
        float f = i;
        System.out.println(f);

        long l = 150231111L;
        double d = l;
        System.out.println(d);

        long l1 = 1152856485;
        double d1 = l;
        System.out.println(d1);

        /**
         * 1.1111111E7
         * 1.50231111E8
         * 1.50231111E8
         * */
    }

    /**
     * 针对于byte、short等转换为容量大的类型时，将此类型看做int类型处理
     * */
    public void upCast3(byte b){
        int i = b;
        long l = b;
        double d = b;
        /**
         *   0    1   2  3 4  5 6
         *  this  b   i   l    d
         *
         * 0 iload_1
         * 1 istore_2
         * 2 iload_1
         * 3 i2l
         * 4 lstore_3
         * 5 iload_1
         * 6 i2d
         * 7 dstore 5
         * */
    }

    public void upCast4(short s){
        int i = s;
        long l = s;
        float f = s;

        /**
         *  0    1  2  3  4
         * this  s  i  l  f
         *
         * 0 iload_1
         * 1 istore_2
         * 2 iload_1
         * 3 i2l
         * 4 lstore_3
         * 5 iload_1
         * 6 i2f
         * 7 fstore 5
         * */
    }

    /**
     * 窄化类型转换
     * 基本的使用
     * */
    public void downCast1(){
        int i = 10;
        byte b = (byte)i;
        short s = (short)i;
        char c = (char)i;

        long l = 10L;
        int i1 = (int)l;


        /**
         *  0    1   2   3   4   5 6  7
         * this  i   b   s   c   l   i1
         *
         *  0 bipush 10
         *  2 istore_1
         *  3 iload_1
         *  4 i2b
         *  5 istore_2
         *  6 iload_1
         *  7 i2s
         *  8 istore_3
         *  9 iload_1
         * 10 i2c
         * 11 istore 4
         * 13 ldc2_w #10 <10>
         * 16 lstore 5
         * 18 lload 5
         * 20 l2i
         * 21 istore 7
         * 23 lload 5
         * 25 l2i
         * 26 i2b
         * 27 istore 8
         * */
    }

    public void downCast2(){
        float f = 10;
        long l = (long)f;
        int i = (int)f;
        byte b = (byte)f;

        double d = 10;
        byte b1 = (byte)d;

        /**
         *   0    1   2 3  4   5   6 7  8
         *  this  f   l    i   b   d    b1
         *
         *  0 ldc #12 <10.0>
         *  2 fstore_1
         *  3 fload_1
         *  4 f2l
         *  5 lstore_2
         *  6 fload_1
         *  7 f2i
         *  8 istore 4
         * 10 fload_1
         * 11 f2i
         * 12 i2b
         * 13 istore 5
         * 15 ldc2_w #13 <10.0>
         * 18 dstore 6
         * 20 dload 6
         * 22 d2i
         * 23 i2b
         * 24 istore 8
         * */
    }

    public void downCast3(){
        short s = 10;
        byte b = (byte)s;

        /**
         *  0    1   2
         * this  s   b
         *
         * 0 bipush 10
         * 2 istore_1
         * 3 iload_1
         * 4 i2b
         * 5 istore_2
         * 6 return
         * */
    }

    /**
     * 窄化类型转换的精度损失
     * */
    @Test
    public void downCast4(){
        int i = 128;
        byte b = (byte)i;

        System.out.println(b);
        /**
         * -128
         * */
    }

    /**
     * 测试NaN,无穷大的情况
     * */
    @Test
    public void downCast5(){
        double d1 = Double.NaN;
        int i = (int)d1;

        System.out.println("d1 = " + d1);
        System.out.println("i = " + i);

        double d2 = Double.POSITIVE_INFINITY;
        long l = (long)d2;
        int j = (int)d2;

        System.out.println("l = " + l);
        System.out.println("Long.MAX_VALUE = " + Long.MAX_VALUE);
        System.out.println("j = " + j);
        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);

        float f = (float) d2;
        System.out.println("f = " + f);

        float f1 = (float) d1;
        System.out.println("f1 = " + f1);
        /**
         * d1 = NaN
         * i = 0
         * l = 9223372036854775807
         * Long.MAX_VALUE = 9223372036854775807
         * j = 2147483647
         * Integer.MAX_VALUE = 2147483647
         * f = Infinity
         * f1 = NaN
         * */
    }
}
