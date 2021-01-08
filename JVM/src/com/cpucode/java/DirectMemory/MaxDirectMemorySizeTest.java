/**
 * User: cpucode
 * Date: 2021/1/8
 * Time: 17:29
 * Github: https://github.com/CPU-Code
 * CSDN: https://blog.csdn.net/qq_44226094
 */

package com.cpucode.java.DirectMemory;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

/*
-Xmx20m -XX:MaxDirectMemorySize=10m

Exception in thread "main" java.lang.OutOfMemoryError

* */
public class MaxDirectMemorySizeTest {
    private static final long _1MB = 1024 * 1024;

    public static void main(String[] args) throws IllegalAccessException {
        Field unsafeField = Unsafe.class.getDeclaredFields()[0];

        unsafeField.setAccessible(true);

        Unsafe unsafe = (Unsafe)unsafeField.get(null);

        while (true){
            unsafe.allocateMemory(_1MB);
        }
    }
}
