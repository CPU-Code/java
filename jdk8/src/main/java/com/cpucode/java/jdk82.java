package com.cpucode.java;

import java.io.IOException;

public class jdk82 {
    public static void main(String[] args) throws IOException {
        String msgA = "hello";
        String msgB = "world";
        String msgC = "java";

        log(1, msgA + msgB + msgC);
    }

    private static void log(int level, String msg) {
        if(level == 1) {
            System.out.println(msg);
        }
    }
}