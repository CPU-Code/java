package com.cpucode.java.loading.process;

import java.util.Random;

/**
 * 说明：使用static + final修饰的字段的显式赋值的操作，到底是在哪个阶段进行的赋值？
 *  情况1：在链接阶段的准备环节赋值
 *  情况2：在初始化阶段<clinit>()中赋值
 *
 * 结论：
 * 在链接阶段的准备环节赋值的情况：
 *  1. 对于基本数据类型的字段来说，如果使用static final修饰，则显式赋值(直接赋值常量，而非调用方法）通常是在链接阶段的准备环节进行
 *  2. 对于String来说，如果使用字面量的方式赋值，使用static final修饰的话，则显式赋值通常是在链接阶段的准备环节进行
 *
 * 在初始化阶段<clinit>()中赋值的情况：
 * 排除上述的在准备环节赋值的情况之外的情况。
 *
 * 最终结论：
 *  使用static + final修饰，且显示赋值中不涉及到方法或构造器调用的基本数据类型或String类型的显式赋值，是在链接阶段的准备环节进行。
 * @author : cpucode
 * @date : 2021/2/2
 * @time : 19:07
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class Stage {
    /**
     * 在初始化阶段<clinit>()中赋值
     * */
    public static int a = 1;

    /**
     * 在链接阶段的准备环节赋值
     * */
    public static final int INT_CONSTANT = 10;

    /**
     * 在初始化阶段<clinit>()中赋值
     * */
    public static final Integer INTEGER_CONSTANT1 = Integer.valueOf(100);

    /**
     * 在初始化阶段<clinit>()中赋值
     * */
    public static Integer INTEGER_CONSTANT2 = Integer.valueOf(22);

    /**
     * 在链接阶段的准备环节赋值
     * */
    public static final String S0 = "CpuCode";

    /**
     * 在初始化阶段<clinit>()中赋值
     * */
    public static final String S1 = new String("hahha");

    /**
     * 在初始化阶段<clinit>()中赋值
     * */
    public static String s2 = "CCC";

    /**
     * 在初始化阶段<clinit>()中赋值
     * */
    public static final int NUM1 = new Random().nextInt(10);

    /**
     *  0 iconst_1
     *  1 putstatic #2 <com/cpucode/java/loading/process/Stage.a>
     *
     *  4 bipush 100
     *  6 invokestatic #3 <java/lang/Integer.valueOf>
     *  9 putstatic #4 <com/cpucode/java/loading/process/Stage.INTEGER_CONSTANT1>
     *
     * 12 bipush 22
     * 14 invokestatic #3 <java/lang/Integer.valueOf>
     * 17 putstatic #5 <com/cpucode/java/loading/process/Stage.INTEGER_CONSTANT2>
     *
     * 20 new #6 <java/lang/String>
     * 23 dup
     * 24 ldc #7 <hahha>
     * 26 invokespecial #8 <java/lang/String.<init>>
     * 29 putstatic #9 <com/cpucode/java/loading/process/Stage.S1>
     *
     * 32 ldc #10 <CCC>
     * 34 putstatic #11 <com/cpucode/java/loading/process/Stage.s2>
     *
     * 37 new #12 <java/util/Random>
     * 40 dup
     * 41 invokespecial #13 <java/util/Random.<init>>
     * 44 bipush 10
     * 46 invokevirtual #14 <java/util/Random.nextInt>
     * 49 putstatic #15 <com/cpucode/java/loading/process/Stage.NUM1>
     *
     * 52 return
     * */
}
