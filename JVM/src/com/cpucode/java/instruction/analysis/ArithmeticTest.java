package com.cpucode.java.instruction.analysis;

import org.junit.jupiter.api.Test;

/**
 * 指令2：算术指令
 * @author : cpucode
 * @Date : 2021/1/25
 * @Time : 18:54
 * @Github : https://github.com/CPU-Code
 * @CSDN : https://blog.csdn.net/qq_44226094
 */
public class ArithmeticTest {
    @Test
    public void method1(){
        int i = 10;
        double j = i / 0.0;
        System.out.println(j);

        double d1 = 0.0;
        double d2 = d1 / 0.0;
        System.out.println(d2);
        /**
         * Infinity
         * NaN
         * */

    }

    public void method2(){
        float i = 10;
        float j = -i;
        i = -j;
        /**
         *  0    1  2
         * this  i  j
         * ldc #4 <10.0>    把10.0加载到栈
         * fstore_1         把10.0存储到局部变量 i 中
         * fload_1          把 i 加载到栈中
         * fneg             把 栈中 i 取反
         * fstore_2         把 i 存储到局部变量j 中
         * fload_2          把 j 加载到栈中
         * fneg             把 栈中j 取反
         * fstore_1         把 j 存储到局部变量 i 中
         * */
    }

    public void method3(){
        int i = 100;

        i = i + 10;

        i += 10;
        /**
         *  0    1
         * this  i
         *  0 bipush 100    把 100 加载到栈
         *  2 istore_1      把 100 存储到局部变量 i
         *  3 iload_1       把 i 加载到栈中
         *  4 bipush 10     把 10 加载到栈
         *  6 iadd          进行 加法
         *  7 istore_1      把 结果 存储到 i
         *  8 iinc 1 by 10  局部变量 i 加 10
         * */
    }

    public int method4(){
        int a = 80;
        int b = 7;
        int c = 10;

        return (a + b) * c;

        /**
         * 0     1  2  3
         * this  a  b  c
         *  0 bipush 80     把 80 加载到 栈
         *  2 istore_1      把 80存储到局部变量 a
         *  3 bipush 7      把 7 加载到 栈
         *  5 istore_2      把 7 存储在局部变量 b
         *  6 bipush 10     把 10 加载到 栈
         *  8 istore_3      把 10 存储在局部变量 c
         *  9 iload_1       把 a 加载到栈
         * 10 iload_2       把 b 加载到 栈
         * 11 iadd          加法
         * 12 iload_3       把 c 加载到 栈
         * 13 imul          乘法
         * 14 ireturn       返回
         * */
    }

    public int method5(int i , int j){
        return ((i + j - 1) & ~(j - 1));
        /**
         *  0     1  2
         *  this  i  j
         *  0 iload_1   把 i 加载到 栈
         *  1 iload_2   把 j 加载到 栈
         *  2 iadd      加法 结果继续压栈
         *  3 iconst_1  把 1 加载到 栈
         *  4 isub      减法 结果继续压栈
         *  5 iload_2   把 j 加载到 栈
         *  6 iconst_1  把 1 加载到 栈
         *  7 isub      减法 结果继续压栈
         *  8 iconst_m1 把 -1 加载到 栈
         *  9 ixor      位异或      1111 ^ 1010 = 0101
         * 10 iand      位与
         * 11 ireturn   返回
         * */
    }

    public void method6(){
        int i = 10;
        i++;

        ++i;
        /**
         *  0   1
         * this i
         * 0 bipush 10      把 10 加载到栈
         * 2 istore_1       把 10 存储到 局部变量 i
         * 3 iinc 1 by 1    局部变量 i 加 1
         * 6 iinc 1 by 1    局部变量 i 加 1
         * */

    }

    public void method7(){
        int i = 10;
        int a = i++;
        int j = 20;
        int b = ++j;
        /**
         *  0    1   2  3  4
         * this  i   a  j  b
         *  0 bipush 10     把 10 加载到 栈
         *  2 istore_1      把 10 存储到 i
         *  3 iload_1       把 i 加载到 栈
         *  4 iinc 1 by 1   局部变量 i 加 1
         *  7 istore_2      把栈中 i 存储到 a
         *  8 bipush 20     把 20 加载到 栈
         * 10 istore_3      把 20 存储到 j
         * 11 iinc 3 by 1   j 加 1
         * 14 iload_3       把 j 加载到 栈
         * 15 istore 4      把栈中 j 存储到 b
         * */
    }

    @Test
    public void method8(){
        int i = 10;
        i = i++;

        System.out.println(i);
        /**
         *  0    1
         * this  i
         *
         *  0 bipush 10     把 10 加载到 栈
         *  2 istore_1      把 10 存储到 局部变量 i
         *  3 iload_1       把 i 加载到 栈
         *  4 iinc 1 by 1   局部变量 i 加 1
         *  7 istore_1      把 栈中 i 存储到 局部变量
         *  8 getstatic #2 <java/lang/System.out>
         * 11 iload_1       把 i 加载到 栈
         * 12 invokevirtual #5 <java/io/PrintStream.println>
         * 15 return
         * */
    }
}
