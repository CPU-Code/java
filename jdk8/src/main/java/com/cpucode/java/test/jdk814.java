package com.cpucode.java.test;

import java.util.function.Predicate;

public class jdk814 {
    public static void main(String[] args) {
        method(s -> s.contains("c"), s -> s.contains("p"));
    }

    private static void method(Predicate<String> one, Predicate<String> two) {
        boolean isValid = one.or(two).test("cpucode");
        System.out.println("字符串符合不 " + isValid);
    }
}