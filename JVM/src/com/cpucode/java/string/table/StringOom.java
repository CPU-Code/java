/**
 * User: cpucode
 * Date: 2021/1/9
 * Time: 11:48
 * Github: https://github.com/CPU-Code
 * CSDN: https://blog.csdn.net/qq_44226094
 */

package com.cpucode.java.string.table;

import java.util.HashSet;
import java.util.Set;
/*
 * jdk6中：
 * -XX:PermSize=6m -XX:MaxPermSize=6m -Xms6m -Xmx6m
 *
 * jdk8中：
 * -XX:MetaspaceSize=9m -XX:MaxMetaspaceSize=9m -Xms9m -Xmx9m
* */
public class StringOom {
    public static void main(String[] args) {
        //使用Set保持着常量池引用，避免full gc回收常量池行为
        Set<String> set = new HashSet<String>();

        //让 PermSize 或 heap 产生OOM了
        long i = 0;

        while (true){
            set.add(String.valueOf(i++).intern());
        }
    }
}
/*
Exception in thread "main" java.lang.OutOfMemoryError: GC overhead limit exceeded
* */
