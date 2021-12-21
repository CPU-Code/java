package com.cpucode.mathNum.valueTest;

/**
 * 转换为各类型
 *
 * @author : cpucode
 * @date : 2021/12/21 8:48
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class ValueTest {
    public static void main(String[] args) {
        Integer x = 5;

        // 返回 byte 原生数据类型
        System.out.println(x.byteValue());
        // 返回 double 原生数据类型
        System.out.println(x.doubleValue());

        // 返回 long 原生数据类型
        System.out.println(x.longValue());
    }
}
