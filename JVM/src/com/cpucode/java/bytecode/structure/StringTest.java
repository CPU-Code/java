package com.cpucode.java.bytecode.structure;

/**
 * @author : cpucode
 * @Date : 2021/1/21
 * @Time : 21:27
 * @Github : https://github.com/CPU-Code
 * @CSDN : https://blog.csdn.net/qq_44226094
 */
public class StringTest {
    public static void main(String[] args) {
        String str = new String("cpu") + new String("Code");
        String str1 = "cpuCode";

        System.out.println(str == str1);

        String str2 = new String("cpuCode");

        System.out.println(str == str2);
    }
}

/**
 *  0 new #2 <java/lang/StringBuilder>
 *  3 dup
 *  4 invokespecial #3 <java/lang/StringBuilder.<init>>
 *  7 new #4 <java/lang/String>
 * 10 dup
 * 11 ldc #5 <cpu>
 * 13 invokespecial #6 <java/lang/String.<init>>
 * 16 invokevirtual #7 <java/lang/StringBuilder.append>
 * 19 new #4 <java/lang/String>
 * 22 dup
 * 23 ldc #8 <Code>
 * 25 invokespecial #6 <java/lang/String.<init>>
 * 28 invokevirtual #7 <java/lang/StringBuilder.append>
 * 31 invokevirtual #9 <java/lang/StringBuilder.toString>   //源码 : new
 * 34 astore_1
 * 35 ldc #10 <cpuCode>
 * 37 astore_2
 * 38 getstatic #11 <java/lang/System.out>
 * 41 aload_1
 * 42 aload_2
 * 43 if_acmpne 50 (+7)
 * 46 iconst_1
 * 47 goto 51 (+4)
 * 50 iconst_0
 * 51 invokevirtual #12 <java/io/PrintStream.println>
 * 54 new #4 <java/lang/String>
 * 57 dup
 * 58 ldc #10 <cpuCode>
 * 60 invokespecial #6 <java/lang/String.<init>>
 * 63 astore_3
 * 64 getstatic #11 <java/lang/System.out>
 * 67 aload_1
 * 68 aload_3
 * 69 if_acmpne 76 (+7)
 * 72 iconst_1
 * 73 goto 77 (+4)
 * 76 iconst_0
 * 77 invokevirtual #12 <java/io/PrintStream.println>
 * 80 return
 * */