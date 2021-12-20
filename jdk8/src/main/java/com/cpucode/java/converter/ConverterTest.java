package com.cpucode.java.converter;

/**
 * @author : cpucode
 * @date : 2021/12/20 16:19
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class ConverterTest {
    public static void main(String[] args) {
        final int num = 1;
        Converter<Integer, String> s = (param) -> System.out.println(String.valueOf(param + num));

        s.convert(2);
    }

    public interface Converter<T1, T2> {
        void convert(int i);
    }
}
