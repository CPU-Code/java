package com.cpucode.java;

import java.util.ArrayList;
import java.util.List;

public class jdk822 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("cpucode");
        list.add("hello cpu");

        list.stream()
                .filter(s -> s.startsWith("cpu"))
                .filter(s -> s.length() == 7)
                .forEach(System.out::println);
    }
}
