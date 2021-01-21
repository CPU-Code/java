/**
 * User: cpucode
 * Date: 2021/1/7
 * Time: 17:23
 * Github: https://github.com/CPU-Code
 * CSDN: https://blog.csdn.net/qq_44226094
 */

package com.cpucode.java.method.area;

/*
D:\Date\github\java\out\production\JVM\com\cpucode\java\methodArea>javap -v -p Order.class > Order.txt


* */

public class MethodAreaFinal {
    public static void main(String[] args) {
        Order order = null;

        Order.hello();

        System.out.println(Order.count);
        System.out.println(Order.NUMBER);
    }
}

class Order{
    public static int count = 1;
    public static final int NUMBER = 3;

    public static void hello(){
        System.out.println("我是CpuCode!!!");
    }
}

