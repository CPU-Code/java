package com.cpucode.java.test;

import java.util.function.Consumer;

public class jdk89 {
    public static void main(String[] args) {
        consumeString(s -> System.out.println(s));
    }

    private static void consumeString(Consumer<String> function) {
        function.accept("cpucode");
    }
}