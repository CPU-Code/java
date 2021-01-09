/**
 * User: cpucode
 * Date: 2021/1/9
 * Time: 15:08
 * Github: https://github.com/CPU-Code
 * CSDN: https://blog.csdn.net/qq_44226094
 */

package com.cpucode.java.StringTable;

/**
 * new String("ab")会创建几个对象？看字节码，就知道是两个。
 *     一个对象是：new关键字在堆空间创建的
 *     另一个对象是：字符串常量池中的对象"ab"。 字节码指令：ldc
 *
 * new String("a") + new String("b")呢？
 *  对象1：new StringBuilder()
 *  对象2： new String("a")
 *  对象3： 常量池中的"a"
 *  对象4： new String("b")
 *  对象5： 常量池中的"b"
 *
 *  深入剖析： StringBuilder的toString():
 *      对象6 ：new String("ab")
 *       强调一下，toString()的调用，在字符串常量池中，没有生成"ab"
 */
public class StringNewTest {
    public static void main(String[] args) {
        String str = new String("ab");

        String str1 = new String("a") + new String("b");
    }
}

/*
 0 new #2 <java/lang/String>    //1
 3 dup
 4 ldc #3 <ab>                  //2
 6 invokespecial #4 <java/lang/String.<init>>
 9 astore_1
10 new #5 <java/lang/StringBuilder>     //1
13 dup
14 invokespecial #6 <java/lang/StringBuilder.<init>>
17 new #2 <java/lang/String>        //2
20 dup
21 ldc #7 <a>                   //3
23 invokespecial #4 <java/lang/String.<init>>
26 invokevirtual #8 <java/lang/StringBuilder.append>
29 new #2 <java/lang/String>        //4
32 dup
33 ldc #9 <b>                   //5
35 invokespecial #4 <java/lang/String.<init>>
38 invokevirtual #8 <java/lang/StringBuilder.append>
41 invokevirtual #10 <java/lang/StringBuilder.toString>     //6
44 astore_2
45 return

* */