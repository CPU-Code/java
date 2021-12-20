package com.cpucode.java.test;

public class jdk84 {
    public static void main(String[] args) {
        String msgA = "hello";
        String msgB = "world";
        String msgC = "java";

        log(2, () -> {
            System.out.println("Lambda执行");
            return msgA + msgB + msgC;
        });
    }

    private static void log(int level, MessageBuilder builder) {
        if(level == 1) {
            System.out.println(builder.buildMessage());
        }
    }

    @FunctionalInterface
    interface MessageBuilder {
        String buildMessage();
    }
}