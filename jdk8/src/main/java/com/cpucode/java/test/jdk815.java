
package com.cpucode.java.test;

import java.util.function.Predicate;

public class jdk815 {
    public static void main(String[] args) {
        method(s -> s.length() < 5);
    }

    private static void method(Predicate<String> predicate) {
        boolean veryLone = predicate.negate().test("cpucode");
        System.out.println("字符串符合不 " + veryLone);
    }
}