
package com.cpucode.java.test;

import java.util.function.Function;

public class jdk817 {
    public static void main(String[] args) {
        method(s -> Integer.parseInt(s));
    }

    private static void method(Function<String, Integer> function) {
        int num = function.apply("10");

        System.out.println(num + 22);
    }
}
