package com.cpucode.java.instruction.analysis;

import java.util.Date;

/**
 * 指令5：方法调用与返回指令
 * @author : cpucode
 * @Date : 2021/1/27
 * @Time : 13:50
 * @Github : https://github.com/CPU-Code
 * @CSDN : https://blog.csdn.net/qq_44226094
 */
public class MethodInvokeReturnTest {
    /**
     * 方法调用指令:invokespecial:静态分派
     * */
    public void invoke1(){
        //情况1：类实例构造器方法：<init>()
        Date date = new Date();
        Thread t1 = new Thread();

        /**
         * 情况2：父类的方法
         */
        super.toString();

        /**
         * 情况3：私有方法
         * */
        methodPrivate();
        /**
         *  0 new #2 <java/util/Date>
         *  3 dup
         *  4 invokespecial #3 <java/util/Date.<init>>      调用构造方法
         *  7 astore_1
         *  8 new #4 <java/lang/Thread>
         * 11 dup
         * 12 invokespecial #5 <java/lang/Thread.<init>>
         * 15 astore_2
         * 16 aload_0
         * 17 invokespecial #6 <java/lang/Object.toString>      调用父类方法
         * 20 pop
         * 21 aload_0
         * 22 invokespecial #7 <com/cpucode/java/instruction/analysis/MethodInvokeReturnTest.methodPrivate> 调用私有方法
         * */
    }

    /**
     * 私有方法
     * */
    private void methodPrivate(){

    }

    /**
     * 方法调用指令:invokestatic:静态分派
     * */
    public void invoke2(){
        methodStatic();

        /**
         * 0 invokestatic #8 <com/cpucode/java/instruction/analysis/MethodInvokeReturnTest.methodStatic>    调用静态方法
         * */
    }

    /**
     * 静态方法
     * */
    public static void methodStatic(){

    }

    /**
     * 方法调用指令:invokeinterface
     * */
    public void invoke3(){
        Thread t1 = new Thread();
        ((Runnable)t1).run();

        Comparable<Integer> com = null;
        com.compareTo(123);

        /**
         *  0 new #4 <java/lang/Thread>
         *  3 dup
         *  4 invokespecial #5 <java/lang/Thread.<init>>    调用构造方法
         *  7 astore_1
         *  8 aload_1
         *  9 invokeinterface #9 <java/lang/Runnable.run> count 1   调用接口方法
         * 14 aconst_null
         * 15 astore_2
         * 16 aload_2
         * 17 bipush 123
         * 19 invokestatic #10 <java/lang/Integer.valueOf>      调用静态方法
         * 22 invokeinterface #11 <java/lang/Comparable.compareTo> count 2      调用接口方法
         * 27 pop
         * */
    }

    /**
     * 方法调用指令:invokeVirtual:动态分派
     * */
    public void invoke4(){
        System.out.println("cpu");

        Thread t1 = null;
        t1.run();

        /**
         *  0 getstatic #12 <java/lang/System.out>
         *  3 ldc #13 <cpu>
         *  5 invokevirtual #14 <java/io/PrintStream.println>   调用实例方法
         *  8 aconst_null
         *  9 astore_1
         * 10 aload_1
         * 11 invokevirtual #15 <java/lang/Thread.run>      调用实例方法
         * 14 return
         * */
    }

    /**
     * 方法的返回指令
     * */
    public int returnInt(){
        int i = 500;

        return i;

        /**
         * 0 sipush 500
         * 3 istore_1
         * 4 iload_1
         * 5 ireturn    返回int
         * */
    }

    public String returnString(){
        return "cpuCode";

        /**
         * 0 ldc #16 <cpuCode>
         * 2 areturn        返回引用
         * */
    }

    public int[] returnArr(){
        return null;

        /**
         * 0 aconst_null
         * 1 areturn        返回引用
         * */
    }

    public float returnFloat(){
        int i = 10;

        return i;

        /**
         * 0 bipush 10
         * 2 istore_1
         * 3 iload_1
         * 4 i2f
         * 5 freturn    返回float
         * */
    }

    public byte returnByte(){
        return 0;

        /**
         * 0 iconst_0
         * 1 ireturn    返回int
         * */
    }

    public void methodReturn(){
        int i = returnByte();

        /**
         * 0 aload_0
         * 1 invokevirtual #17 <com/cpucode/java/instruction/analysis/MethodInvokeReturnTest.returnByte>    调用实例方法
         * 4 istore_1
         * 5 return     返回空
         * */
    }
}
