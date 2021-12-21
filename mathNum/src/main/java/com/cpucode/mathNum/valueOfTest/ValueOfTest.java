package com.cpucode.mathNum.valueOfTest;

/**
 * 返回一个 Number 对象指定的内置数据类型
 *
 * @author : cpucode
 * @date : 2021/12/21 8:58
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class ValueOfTest {
    public static void main(String[] args) {
        Integer x = Integer.valueOf(10);
        Double c = Double.valueOf(5);
        Float a = Float.valueOf("20");

        Integer b = Integer.valueOf("100", 16);

        System.out.println(x);
        System.out.println(c);
        System.out.println(a);
        System.out.println(b);
    }
}
