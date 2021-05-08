package com.cpucode.java.iterator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * 迭代器来遍历 HashMap
 * @author : cpucode
 * @date : 2021/5/8
 * @time : 21:08
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class IteratorMap {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap();

        map.put(1, "Java");
        map.put(2, "C++");
        map.put(3, "python");

        Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer, String> next = iterator.next();

            System.out.println(next.getKey() + " " + next.getValue());
        }

    }
}
