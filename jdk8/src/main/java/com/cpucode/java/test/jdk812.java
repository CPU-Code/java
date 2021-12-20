package com.cpucode.java.test;

import java.util.function.Predicate;

public class jdk812 {
    public static void main(String[] args) {
        method(s -> s.length() > 5);
    }

    private static void method(Predicate<String> predicate) {
        boolean veryLong = predicate.test("cpucode");
        System.out.println("字符串很长 " + veryLong);
    }
}