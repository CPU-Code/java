package com.cpucode.java.WrapperParse;

/**
 * Integer 装箱/拆箱
 * @author : cpucode
 * @date : 2021/5/9
 * @time : 9:43
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class IntegerEqual {
    public static void main(String[] args) {
        Integer i1 = 100;
        Integer i2 = 100;

        Integer i3 = 200;
        Integer i4 = 200;

        System.out.println(i1 == i2);
        System.out.println(i3 == i4);
    }
}
