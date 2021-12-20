
package com.cpucode.java.test;

import java.util.ArrayList;
import java.util.List;

public class jdk821 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("cpucode");
        list.add("hello cpu");

        List<String> cpuList = new ArrayList<>();
        for (String name : list) {
            if(name.startsWith("cpu")) {
                cpuList.add(name);
            }
        }

        List<String> shortList = new ArrayList<>();
        for (String name : cpuList) {
            if (name.length() == 7) {
                shortList.add(name);
            }
        }

        for (String name : shortList) {
            System.out.println(name);
        }
    }
}