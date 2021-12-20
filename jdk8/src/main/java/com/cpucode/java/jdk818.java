
package com.cpucode.java;

import java.util.function.Function;

public class jdk818 {
    public static void main(String[] args) {
        method(str -> Integer.parseInt(str) + 10, i -> i *= 10);
    }

    private static void method(Function<String, Integer> one, Function<Integer, Integer> two) {
        int num = one.andThen(two).apply("10");

        System.out.println(num + 20);
    }
}
