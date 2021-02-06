package com.cpucode.java.command.tools.jstack;

import java.util.Map;
import java.util.Set;

/**
 * @author : cpucode
 * @date : 2021/2/6
 * @time : 14:44
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class AllStackTrace {
    public static void main(String[] args) {
        Map<Thread, StackTraceElement[]> all = Thread.getAllStackTraces();
        Set<Map.Entry<Thread, StackTraceElement[]>> entries = all.entrySet();

        for (Map.Entry<Thread, StackTraceElement[]> en : entries){
            Thread t = en.getKey();
            StackTraceElement[] v = en.getValue();

            System.out.println("Thread name is :" + t.getName() );

            for (StackTraceElement s : v){
                System.out.println("\t" + s.toString());
            }
        }
    }
}
