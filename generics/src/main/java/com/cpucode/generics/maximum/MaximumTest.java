package com.cpucode.generics.maximum;

/**
 * 泛型方法返回三个可比较对象的最大值
 * T - Type（Java 类）
 *
 * @author : cpucode
 * @date : 2021/12/20 14:44
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class MaximumTest {
    public static void main(String[] args) {
        Integer x = 3;
        Integer y = 4;
        Integer z = 5;

        System.out.printf( "%d, %d 和 %d 中最大的数为 %d\n\n",
                x, y, z, maximum(x, y, z));

        Double doubleX = 6.6;
        Double doubleY = 8.8;
        Double doubleZ = 9.9;

        System.out.printf( "%.1f, %.1f 和 %.1f 中最大的数为 %.1f\n\n",
                doubleX, doubleY, doubleZ, maximum(doubleX, doubleY, doubleZ));

        String stringX = "cpu";
        String stringY = "code";
        String stringZ = "cpuCode";

        System.out.printf( "%s, %s 和 %s 中最大的数为 %s\n","pear",
                stringX, stringY , stringZ, maximum(stringX, stringY, stringZ));
    }

    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        // 假设x是初始最大值
        T max = x;

        if (y.compareTo(max) > 0) {
            //y 更大
            max = y;
        }
        if (z.compareTo(max) > 0) {
            // 现在 z 更大
            max = z;
        }

        // 返回最大对象
        return max;
    }
}
