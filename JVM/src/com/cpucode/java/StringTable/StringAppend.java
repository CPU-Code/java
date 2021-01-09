/**
 * User: cpucode
 * Date: 2021/1/9
 * Time: 14:24
 * Github: https://github.com/CPU-Code
 * CSDN: https://blog.csdn.net/qq_44226094
 */

package com.cpucode.java.StringTable;

/*
体会执行效率：通过StringBuilder的append()的方式添加字符串的 效率要远高于 使用String的字符串拼接方式！
详情：① StringBuilder的append()的方式：自始至终中只创建过一个StringBuilder的对象
      使用String的字符串拼接方式：创建过多个StringBuilder和String的对象
     ② 使用String的字符串拼接方式：内存中由于创建了较多的StringBuilder和String的对象，内存占用更大；
            如果进行GC，需要花费额外的时间。

 改进的空间：在实际开发中，如果基本确定要前前后后添加的字符串长度不高于某个限定值highLevel的情况下,建议使用构造器实例化：
           StringBuilder s = new StringBuilder(highLevel);//new char[highLevel]
 */
public class StringAppend {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        method1(50000);
        long end = System.currentTimeMillis();

        System.out.println("花费的时间为：" + (end - start));

        start = System.currentTimeMillis();
        method2(50000);
        end = System.currentTimeMillis();

        System.out.println("花费的时间为：" + (end - start));
    }

    private static void method1(int highLevel){
        String src = "";

        for (int i = 0; i < highLevel; i++) {
            //每次循环都会创建一个StringBuilder、String
            src = src + "cpu";
        }
    }

    private static void method2(int highLevel){
        //只需要创建一个StringBuilder
        StringBuilder src = new StringBuilder();

        for (int i = 0; i < highLevel; i++) {
            src.append("cpu");
        }
    }
}
