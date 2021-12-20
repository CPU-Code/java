package com.cpucode.generics.methodTest;

/**
 * 使用泛型方法打印不同类型的数组元素
 * E - Element (在集合中使用，因为集合中存放的是元素)
 *
 * @author : cpucode
 * @date : 2021/12/20 14:38
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class GenericMethodTest {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
        Character[] charArray = {'A', 'B', 'C', 'D'};

        // 传递一个整型数组
        System.out.println( "整型数组元素为:" );
        printArray(intArray);

        // 传递一个双精度型数组
        System.out.println( "\n双精度型数组元素为:" );
        printArray(doubleArray);

        // 传递一个字符型数组
        System.out.println( "\n字符型数组元素为:" );
        printArray(charArray);
    }

    public static <E> void printArray(E[] inputArray) {
        for (E e : inputArray) {
            System.out.printf("%s  ", e);
        }
        System.out.println();
    }
}
