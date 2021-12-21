package com.cpucode.mathNum.equalsTest;

/**
 * 判断number对象是否与参数相等
 *
 * @author : cpucode
 * @date : 2021/12/21 8:53
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class EqualsTest {
    public static void main(String[] args) {
        Integer x = 5;
        Integer y = 10;
        Integer z = 5;
        Short a = 5;
        Long b = 5L;

        System.out.println(x.equals(y));
        System.out.println(x.equals(z));
        System.out.println(x.equals(a));
        System.out.println(x.equals(b));
    }
}
