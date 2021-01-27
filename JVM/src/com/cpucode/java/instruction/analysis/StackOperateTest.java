package com.cpucode.java.instruction.analysis;

/**
 * 指令6：操作数栈管理指令
 * @author : cpucode
 * @Date : 2021/1/27
 * @Time : 15:23
 * @Github : https://github.com/CPU-Code
 * @CSDN : https://blog.csdn.net/qq_44226094
 */
public class StackOperateTest {
    public void print(){
        Object obj = new Object();

        String info = obj.toString();

        obj.toString();

        /**
         *  0     1     2
         * this  obj  info
         *
         *  0 new #3 <java/lang/Object>
         *  3 dup           复制
         *  4 invokespecial #1 <java/lang/Object.<init>>    调用父类方法
         *  7 astore_1
         *
         *  8 aload_1
         *  9 invokevirtual #4 <java/lang/Object.toString>  调用实例方法
         * 12 astore_2
         *
         * 13 aload_1
         * 14 invokevirtual #4 <java/lang/Object.toString>
         * 17 pop       出栈
         * 18 return
         * */
    }

    public void foo(){
        bar();
    }

    public long bar(){
        return 0;
    }

    public long nextIndex(){
        return index++;

        /**
         *  0 aload_0       将 this 压栈
         *  1 dup       复制
         *  2 getfield #2 <com/cpucode/java/instruction/analysis/StackOperateTest.index>    根据 栈中this地址 将 index 压栈
         *  5 dup2_x1       复制俩个槽 压栈到第二个下面
         *  6 lconst_1      压栈 俩个槽 1
         *  7 ladd      long加法
         *  8 putfield #2 <com/cpucode/java/instruction/analysis/StackOperateTest.index>  将 栈中结果 复制到this的index
         * 11 lreturn   long 返回
         * */
    }

    private long index = 10;
}
