
package com.cpucode.java;

import java.util.ArrayList;
import java.util.List;

/**
 * public是访问修饰符，表示该class是公开的
 */
public class jdk820 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("cpucode");
        list.add("cpu");

        for (String name : list) {
            System.out.println(name);
        }
    }

}