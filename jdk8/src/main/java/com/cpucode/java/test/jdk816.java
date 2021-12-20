package com.cpucode.java.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class jdk816 {
    public static void main(String[] args) {
        String[] array = {"cpuCode,男", "cpu,女", "流弊,男"};
        List<String> list = filter(array,
                s -> "男".equals(s.split(",")[1]),
                s -> s.split(",")[0].length() == 2);

        System.out.println(list);
    }

    private static List<String> filter(String[] array, Predicate<String> one, Predicate<String> two) {
        List<String> list = new ArrayList<>();

        for (String info : array) {
            if(one.and(two).test(info)){
                list.add(info);
            }
        }

        return list;
    }
}
