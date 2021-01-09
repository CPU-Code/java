/**
 * User: cpucode
 * Date: 2021/1/9
 * Time: 15:38
 * Github: https://github.com/CPU-Code
 * CSDN: https://blog.csdn.net/qq_44226094
 */

package com.cpucode.java.StringTable;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

/**
 * 如何保证变量s指向的是字符串常量池中的数据呢？
 * 有两种方式：
 * 方式一： String s = "shkstart";//字面量定义的方式
 * 方式二： 调用intern()
 *         String s = new String("shkstart").intern();
 *         String s = new StringBuilder("shkstart").toString().intern();
 */
public class StringIntern {
    public static void main(String[] args) {
        test1();
        test2();
        test3();
        test4();
        test5();
        test6();
    }

    private static void test1(){
        System.out.println("test1 开始");

        //在堆创建一个对象
        String s = new String("1");

        //调用此方法之前，字符串常量池中已经存在了"1"
        //毫无用处
        s.intern();

        String s2 = "1";

        //jdk6：false   jdk7/8：false
        System.out.println(s == s2);

        //s3变量记录的地址为：new String("11")
        String s3 = new String("1") + new String("1");

        //执行完上一行代码以后，字符串常量池中，不存在"11"

        //在字符串常量池中生成"11"
        // jdk6: 创建了一个新的对象"11",也就有新的地址
        // jdk7/8: 此时常量中并没有创建"11",而是创建一个指向堆空间中new String("11")的地址
        s3.intern();

        //s4变量记录的地址：使用的是上一行代码代码执行时，在常量池中生成的"11"的地址
        //引用的s3创建的地址
        String s4 = "11";

        //jdk6：false  jdk7/8：true
        System.out.println(s3 == s4);

        System.out.println("test1 结束");
        System.out.println();
    }

    private static void test2(){
        System.out.println("test2 开始");

        String s1 = new String("1") + new String("1");
        //执行完上一行代码以后，字符串常量池中，不存在"11"

        //在字符串常量池中生成对象"11"
        String s2 = "11";
        //把常量池引用给s3
        String s3 = s2.intern();

        System.out.println(s1 == s2);
        System.out.println(s2 == s3);

        System.out.println("test2 结束");
        System.out.println();
    }

    private static void test3(){
        System.out.println("test3 开始");

        String s2 = new String("cp") + new String("u");
        //在上一行代码执行完以后，字符串常量池中并没有"ab"

        //jdk6中：在串池中创建一个字符串"ab"
        //jdk8中：串池中没有创建字符串"ab",而是创建一个引用，指向new String("ab")，将此引用返回
        String s3 = s2.intern();

        System.out.println(s2 == "cpu");
        System.out.println(s3 == "cpu");

        System.out.println("test3 结束");
        System.out.println();
    }

    private static void test4(){
        System.out.println("test4 开始");

        String s1 = "cpu";
        String s2 = new String("cp") + new String("u");

        String s3 = s2.intern();

        System.out.println(s2 == "cpu");
        System.out.println(s3 == "cpu");

        System.out.println("test4 结束");
        System.out.println();
    }

    private static void test5(){
        System.out.println("test5 开始");

        //执行完以后，会在字符串常量池中会生成"cpu"
        String s1 = new String("cpu");

        //毫无用处
        s1.intern();

        String s2 = "cpu";

        System.out.println(s1 == s2);

        System.out.println("test5 结束");
        System.out.println();
    }

    private static void test6(){
        System.out.println("test6 开始");

        //执行完以后，不会在字符串常量池中会生成"cpucode"
        String s1 = new String("cpu") + new String("Code");

        s1.intern();
        String s2 = "cpuCode";

        System.out.println(s1 == s2);

        System.out.println("test6 结束");
        System.out.println();
    }
}
