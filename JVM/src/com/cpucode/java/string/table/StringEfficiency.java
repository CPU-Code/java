/**
 * User: cpucode
 * Date: 2021/1/9
 * Time: 17:10
 * Github: https://github.com/CPU-Code
 * CSDN: https://blog.csdn.net/qq_44226094
 */

package com.cpucode.java.string.table;
/**
 * 使用intern()测试执行效率：空间使用上
 *
 * 结论：对于程序中大量存在存在的字符串，尤其其中存在很多重复字符串时，使用intern()可以节省内存空间。
 */
public class StringEfficiency {
    static final int MAX_COUNT = 1000 * 1000;
    static final String[] ARR = new String[MAX_COUNT];

    public static void main(String[] args) {
        intern();

        //noIntern();
    }

    private static void intern(){
        Integer[] data = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

        long start = System.currentTimeMillis();

        for (int i = 0; i < MAX_COUNT; i++) {
            ARR[i] = String.valueOf(data[i % data.length]).intern();
        }

        long end = System.currentTimeMillis();

        System.out.println("花费的时间为：" + (end - start));

        try {
            Thread.sleep(100000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        System.gc();
    }

    private static void noIntern(){
        Integer[] data = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

        long start = System.currentTimeMillis();

        for (int i = 0; i < MAX_COUNT; i++) {
            ARR[i] = String.valueOf(data[i % data.length]);
        }

        long end = System.currentTimeMillis();

        System.out.println("花费的时间为：" + (end - start));

        try {
            Thread.sleep(100000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        System.gc();
    }
}
