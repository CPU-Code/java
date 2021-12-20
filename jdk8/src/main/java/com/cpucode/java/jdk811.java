package com.cpucode.java;

import java.util.function.Consumer;

public class jdk811 {
    public static void main(String[] args) {
        String[] array = {"cpucode, 男", "cpu, 女"};
        printInfo(s -> System.out.print("姓名 : " + s.split(",")[0]),
                s -> System.out.println(" 性别 :" + s.split(",")[1]),
                array);
    }

    private static void printInfo(Consumer<String> one, Consumer<String> two, String[] array) {
        for(String info : array) {
            one.andThen(two).accept(info);
        }
    }
}