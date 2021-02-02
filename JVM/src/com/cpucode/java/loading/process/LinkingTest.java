package com.cpucode.java.loading.process;

/**
 * 过程二：链接阶段
 *
 * 基本数据类型：非final修饰的变量，在准备环节进行默认初始化赋值。
 *              final修饰以后，在准备环节直接进行显示赋值。
 *
 *  拓展：如果使用字面量的方式定义一个字符串的常量的话，也是在准备环节直接进行显示赋值。
 * @author : cpucode
 * @date : 2021/2/2
 * @time : 13:53
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class LinkingTest {
    private static long id;

    /**
     *  ConstantValue 为 1
     * */
    private static final int NUM = 1;
    /**
     * ConstantValue 为 CONST
     * */
    public static final String CONSTSTR = "CONST";

    public Object getObj(){
        return null;
    }

    public void print1(){
        System.out.println("CpuCode");
    }
}
