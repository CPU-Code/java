package com.cpucode.java.test;

import java.util.function.Supplier;

public class jdk87 {
    public static void main(String[] args) {
        String msgA = "cpucode";
        String msgB = "hello";

        System.out.println(getString(() -> msgA + msgB));
    }

    private static String getString(Supplier<String> function) {
        return function.get();
    }
}