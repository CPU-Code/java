package com.cpucode.java;

import java.util.function.Consumer;

public class jdk810 {
    public static void main(String[] args) {
        consumeString(
                s -> System.out.println(s.toUpperCase()),
                s -> System.out.println(s.toLowerCase()));
    }

    private static void consumeString(Consumer<String> one, Consumer<String> two) {
        one.andThen(two).accept("cpucode");
    }
}