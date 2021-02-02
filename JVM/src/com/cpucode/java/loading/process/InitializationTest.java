package com.cpucode.java.loading.process;

/**
 * 过程三：初始化阶段
 *
 * @author : cpucode
 * @date : 2021/2/2
 * @time : 14:22
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class InitializationTest {
    public static int id = 1;
    public static int number;

    static {
        number = 2;

        System.out.println("father static ");
    }
}
