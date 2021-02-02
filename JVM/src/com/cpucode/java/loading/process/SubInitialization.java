package com.cpucode.java.loading.process;

/**
 * @author : cpucode
 * @date : 2021/2/2
 * @time : 14:23
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class SubInitialization extends InitializationTest{
    static {
        //number属性必须提前已经加载：一定会先加载父类
        number = 4;

        System.out.println("son static");
    }

    public static void main(String[] args) {
        System.out.println(number);
    }
}

/**
 * father static
 * son static
 * 4
 * */