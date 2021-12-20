package com.cpucode.java.jdk8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author : cpucode
 * @date : 2021/12/20 15:27
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class Jdk8Test {
    public static void main(String[] args) {
        List<String> names1 = new ArrayList<String>();
        names1.add("cpu");
        names1.add("code");
        names1.add("cpuCode");

        List<String> names2 = new ArrayList<String>();
        names2.add("test");
        names2.add("hai");
        names2.add("meiMei");

        Jdk8Test tester = new Jdk8Test();

        System.out.println("使用 Java 7 语法: ");
        tester.sortUsingJava7(names1);
        System.out.println(names1);


        System.out.println("使用 Java 8 语法: ");
        tester.sortUsingJava8(names2);
        System.out.println(names2);
    }

    /**
     * 使用 java 7 排序
     * @param names
     */
    private void sortUsingJava7(List<String> names) {
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
    }

    /**
     * 使用 java 8 排序
     * @param names
     */
    private void sortUsingJava8(List<String> names) {
        Collections.sort(names, (s1, s2) -> s1.compareTo(s2));
    }
}
