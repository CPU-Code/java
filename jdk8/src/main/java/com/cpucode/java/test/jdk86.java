package com.cpucode.java.test;

import java.util.Arrays;
import java.util.Comparator;

public class jdk86 {
    public static void main(String[] args) {

        String[] array = {"cpu", "cpucode"};
        System.out.println(Arrays.toString(array));

        Arrays.sort(array, newComparator());
        System.out.println(Arrays.toString(array));
    }

    private static Comparator<String> newComparator() {
        return (a, b) -> b.length() - a.length();
    }
}
