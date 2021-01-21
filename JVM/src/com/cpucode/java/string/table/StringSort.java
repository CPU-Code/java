/**
 * User: cpucode
 * Date: 2021/1/9
 * Time: 13:27
 * Github: https://github.com/CPU-Code
 * CSDN: https://blog.csdn.net/qq_44226094
 */

package com.cpucode.java.string.table;

public class StringSort {
    public static void main(String[] args) {
        test1();
        test2();
        test3();
        test4();
        test5();
    }

    private static void test1(){
        System.out.println("test1 开启");

        //编译期优化：等同于"cpu"
        String s1 = "c" + "p" + "u";
        //"cpu"一定是放在字符串常量池中，将此地址赋给s2
        String s2 = "cpu";
        /*
         * 最终.java编译成.class,再执行.class
         * String s1 = "cpu";
         * String s2 = "cpu"
         */
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        System.out.println("test1 结束");
        System.out.println();
    }

    private static void test2(){
        System.out.println("test2 开启");
        String s1 = "cpuCode";
        String s2 = "HaHaHaHa";

        String s3 = "cpuCodeHaHaHaHa";
        //编译期优化
        String s4 = "cpuCode" + "HaHaHaHa";

        //如果拼接符号的前后出现了变量，则相当于在堆空间中new String()，具体的内容为拼接的结果：cpuCodeHaHaHaHa
        String s5 = s1 + "HaHaHaHa";
        String s6 = "cpuCode" + s2;
        String s7 = s1 + s2;

        System.out.println(s3 == s4);
        System.out.println(s3 == s5);
        System.out.println(s3 == s6);
        System.out.println(s3 == s7);

        System.out.println(s5 == s6);
        System.out.println(s5 == s7);
        System.out.println(s6 == s7);

        //intern():判断字符串常量池中是否存在cpuCodeHaHaHaHa 值，如果存在，则返回常量池中cpuCodeHaHaHaHa 的地址；
        //如果字符串常量池中不存在cpuCodeHaHaHaHa ，则在常量池中加载一份cpuCodeHaHaHaHa ，并返回次对象的地址
        String s8 = s5.intern();
        System.out.println(s3 == s8);

        System.out.println("test2 结束");
        System.out.println();
    }

    /**
     *     1. 字符串拼接操作不一定使用的是StringBuilder!
     *        如果拼接符号左右两边都是字符串常量或常量引用，则仍然使用编译期优化，即非StringBuilder的方式。
     *     2. 针对于final修饰类、方法、基本数据类型、引用数据类型的量的结构时，能使用上final的时候建议使用上。
     * 如下的s1 + s2 + s3 的执行细节：(变量s是我临时定义的）
     *    1 StringBuilder s = new StringBuilder();
     *    2 s.append("c")
     *    3 s.append("p")
     *        s.append("u");
     *    s.toString()  --> 约等于 new String("cpu")
     *
     *  补充：在jdk5.0之后使用的是StringBuilder,在jdk5.0之前使用的是StringBuffer
     */
    private static void test3(){
        System.out.println("test3 开启");

        String s1 = "c";
        String s2 = "p";
        String s3 = "u";
        String s4 = "cpu";

        String s5 = s1 + s2 + s3;
        System.out.println(s4 == s5);

        System.out.println("test3 结束");
        System.out.println();
    }

    /**
     *     1. 字符串拼接操作不一定使用的是StringBuilder!
     *        如果拼接符号左右两边都是字符串常量或常量引用，则仍然使用编译期优化，即非StringBuilder的方式。
     *     2. 针对于final修饰类、方法、基本数据类型、引用数据类型的量的结构时，能使用上final的时候建议使用上。
     */
    private static void test4(){
        System.out.println("test4 开启");

        final String s1 = "cpu";
        final String s2 = "Code";

        String s3 = "cpuCode";
        String s4 = s1 + s2;

        System.out.println(s3 == s4);

        System.out.println("test4 结束");
        System.out.println();
    }

    private static void test5(){
        System.out.println("test5 开启");

        String s1 = "cpuCode";
        String s2 = "cpu";
        String s3 = s2 + "Code";
        System.out.println(s1 == s3);

        //s4:常量
        final String s4 = "cpu";
        String s5 = s4 + "Code";

        System.out.println(s1 == s5);

        System.out.println("test5 结束");
        System.out.println();
    }
}
