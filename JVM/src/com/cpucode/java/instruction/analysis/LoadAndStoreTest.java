package com.cpucode.java.instruction.analysis;

import java.util.Date;

/**
 * 指令1：加载与存储指令
 * @author : cpucode
 * @Date : 2021/1/25
 * @Time : 15:40
 * @Github : https://github.com/CPU-Code
 * @CSDN : https://blog.csdn.net/qq_44226094
 */
public class LoadAndStoreTest {
    /**
     * 1.局部变量压栈指令
     * */
    public void load(int num, Object obj, long count, boolean flag, short[] arr){
        System.out.println(num);
        System.out.println(obj);
        System.out.println(count);
        System.out.println(flag);
        System.out.println(arr);
        /**
         *  0     1    2    3 4    5     6
         * this  num  obj  count  flag  arr
         *
         * iload_1 把 num 加载到栈中
         * aload_2 把 obj 加载到栈中
         * lload_3 把 count 加载到栈中
         * iload 5 把 flag 加载到栈中
         * aload 6 把 arr 加载到栈中
         * */
    }

    /**
     * 2.常量入栈指令
     * */
    public void pushConstLdc(){
        int i = -1;
        int a = 5;
        int b = 6;
        int c = 127;
        int d = 128;
        int e = 32767;
        int f = 32778;
        /**
         *  0    1  2  3  4  5  6  7
         * this  i  a  b  c  d  e  f
         *
         * iconst_m1 把 -1 加载到栈中
         * istore_1 把 i 存储在局部变量中
         *
         * iconst_5 把 5 加载到栈中
         * istore_2 把 a 存储在局部变量中
         *
         * bipush 6 把 6 加载到栈中
         * istore_3 把 b 存储在局部变量中
         *
         * bipush 127 把 127 加载到栈中
         * istore 4   把 c 存储在局部变量中
         *
         * sipush 128 把 128 加载到栈中
         * istore 5   把 d 存储在局部变量中
         *
         * sipush 32767 把 32767 加载到栈中
         * istore 6     把 e 存储在局部变量中
         *
         * ldc #7 <32778> 把 32778 加载到栈中
         * istore 7       把 f 存储在局部变量中
         * */
    }

    public void constLdc(){
        long a1 = 1;
        long a2 = 2;
        long b1 = 2;
        float b2 = 3;
        double c1 = 1;
        double c2 = 2;
        Date d = null;
        /**
         *   0    1 2    3 4    5 6   7   8 9  10 11  12
         *  this   a1     a2     b1   b2   c1   c2    d
         *
         * lconst_1  把 1 加载到栈中
         * lstore_1  把 1 存储在局部变量 a1 中
         *
         * ldc2_w #8 <2>  把 2 加载到栈中
         * lstore_3       把 2 存储在局部变量 a2 中
         *
         * ldc2_w #8 <2> 把 2 加载到栈中
         * lstore 5      把 2 存储在局部变量 b1 中
         *
         * ldc #10 <3.0> 把 3 加载到栈中
         * fstore 7      把 b2 存储在局部变量中
         *
         * dconst_1     把 1 加载到栈中
         * dstore 8     把 c1 存储在局部变量中
         *
         * ldc2_w #11 <2.0> 把 2 加载到栈中
         * dstore 10        把 c2 存储在局部变量中
         *
         * aconst_null     把 空 加载到栈中
         * astore 12       把 d 存储在局部变量中
         * */
    }

    /**
     * 3.出栈装入局部变量表指令
     * */
    public void store(int k, double d){
        int m = k + 2;
        long l = 12;
        String str = "cpuCode";
        float f = 10.0f;
        d = 10;
        /**
         *  0    1  2 3   4   5 6   7   8
         * this  k   d    m    l   str  f
         *
         * iload_1      把 k 加载到栈中
         * iconst_2     把 2 加载到栈中
         * iadd         做加法运算
         * istore 4     把结果存储在局部变量 m 中
         * ldc2_w #13 <12> 把 12 加载到栈中
         * lstore 5        把 12 存储在局部变量 l 中
         * ldc #15 <cpuCode> 把 cpuCode 索引加载到栈中
         * astore 7          把 索引 存储在局部变量 str 中
         * ldc #16 <10.0>    把 10.0 加载到栈中
         * fstore 8          把 10.0 存储在局部变量 f 中
         * ldc2_w #17 <10.0> 把 10.0 加载到栈中
         * dstore_2          把 10.0 存储在局部变量 d 中
         * */
    }

    public void foo(long l, float f){
        {
            int i = 0;
        }

        {
            String s = "cpuCode, 哈哈哈";
        }

        /**
         *  0    1 2    3     4
         * this   l     f    i/s
         *
         * iconst_0  把 0 加载到栈中
         * istore 4  把 0 存储在局部变量 i 中
         * ldc #19 <cpuCode, 哈哈哈>   把 cpuCode, 哈哈哈 索引加载到栈中
         * astore 4     把 cpuCode, 哈哈哈 索引存储在局部变量 s 中
         * */
    }
}
