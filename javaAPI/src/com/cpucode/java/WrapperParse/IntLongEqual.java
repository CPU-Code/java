package com.cpucode.java.WrapperParse;

/**
 * @author : cpucode
 * @date : 2021/5/9
 * @time : 9:52
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class IntLongEqual {
    public static void main(String[] args) {
        Integer a = 1;
        Integer b = 2;

        Integer c = 3;
        Integer d = 3;

        Integer e = 321;
        Integer f = 321;

        Long g = 3L;
        Long h = 2L;

        System.out.println(c == d);
        System.out.println(e == f);

        System.out.println(c == (a + b));
        System.out.println(c.equals(a + b));

        System.out.println(g == (a + b));
        System.out.println(g.equals(a + b));

        System.out.println(g == (a + h));
        System.out.println(g.equals(a + h));
    }
}
