package com.cpucode.java.test;

public class jdk83 {

    public static void main(String[] args) {
        String msgA = "hello";
        String msgB = "world";
        String msgC = "java";

        log(1, () -> msgA + msgB + msgC);
    }

    private static void log(int level, MessageBuilder builder) {
        if(level == 1) {
            System.out.println(builder.buildMessage());
        }
    }

    //函数式接口
    @FunctionalInterface
    interface MessageBuilder {
        String buildMessage();
    }
}