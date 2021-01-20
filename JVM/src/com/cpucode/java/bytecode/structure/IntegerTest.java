package com.cpucode.java.bytecode.structure;

/**
 * @author : cpucode
 * @Date : 2021/1/20
 * @Time : 22:37
 * @Github : https://github.com/CPU-Code
 * @CSDN : https://blog.csdn.net/qq_44226094
 */
public class IntegerTest {
    public static void main(String[] args) {
        Integer x = 5;
        int y = 5;
        System.out.println(x == y);

        Integer num = 129;
        int num1 = 129;
        System.out.println(num == num1);

        Integer num2 = 10;
        Integer num3 = 10;
        System.out.println(num2 == num3);

        Integer num4 = 128;
        Integer num5 = 128;

        System.out.println(num4 == num5);
    }
}
