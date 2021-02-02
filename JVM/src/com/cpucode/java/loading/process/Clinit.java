package com.cpucode.java.loading.process;

/**
 * 哪些场景下，java编译器就不会生成<clinit>()方法
 *
 * @author : cpucode
 * @date : 2021/2/2
 * @time : 18:37
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class Clinit {
    /**
     * 场景1：对应非静态的字段，不管是否进行了显式赋值，都不会生成<clinit>()方法
     * */
    public int num = 1;

    /**
     * 场景2：静态的字段，没有显式的赋值，不会生成<clinit>()方法
     * */
    public static int num1;

    /**
     * 场景3：比如对于声明为static final的基本数据类型的字段，不管是否进行了显式赋值，都不会生成<clinit>()方法
     * */
    public static final int num2 = 1;
}
