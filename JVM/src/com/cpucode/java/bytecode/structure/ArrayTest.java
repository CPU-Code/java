package com.cpucode.java.bytecode.structure;

/**
 * 通过jclasslib查看 方法中main中的 LocalVariableTable
 *
 * @author : cpucode
 * @Date : 2021/1/22
 * @Time : 19:56
 * @Github : https://github.com/CPU-Code
 * @CSDN : https://blog.csdn.net/qq_44226094
 */
public class ArrayTest {
    public static void main(String[] args) {
        Object[] arr = new Object[10];
        System.out.println(arr);
        //[Ljava.lang.Object;@75b84c92


        String[] arr1 = new String[10];
        System.out.println(arr1);
        //[Ljava.lang.String;@6bc7c054

        long [][] arr2 = new long[10][];
        System.out.println(arr2);
        //[[J@232204a1
    }
}
