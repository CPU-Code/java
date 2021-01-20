package com.cpucode.java.bytecode.structure;

/**
 * int类型的自动拆装箱
 * @author : cpucode
 * @Date : 2021/1/20
 * @Time : 22:37
 * @Github : https://github.com/CPU-Code
 * @CSDN : https://blog.csdn.net/qq_44226094
 */
public class IntegerTest {
    public static void main(String[] args) {
        Integer x = 5;
        int y = 5;
        System.out.println(x == y);

        Integer num = 129;
        int num1 = 129;
        System.out.println(num == num1);

        Integer num2 = 10;
        Integer num3 = 10;
        System.out.println(num2 == num3);

        Integer num4 = 128;
        Integer num5 = 128;

        System.out.println(num4 == num5);
    }
}

/**
 *   0 iconst_5
 *   1 invokestatic #2 <java/lang/Integer.valueOf>
 *   4 astore_1
 *   5 iconst_5
 *   6 istore_2
 *   7 getstatic #3 <java/lang/System.out>
 *  10 aload_1
 *  11 invokevirtual #4 <java/lang/Integer.intValue>
 *  14 iload_2
 *  15 if_icmpne 22 (+7)
 *  18 iconst_1
 *  19 goto 23 (+4)
 *  22 iconst_0
 *  23 invokevirtual #5 <java/io/PrintStream.println>
 *  26 sipush 129       //第二段开始
 *  29 invokestatic #2 <java/lang/Integer.valueOf>
 *  32 astore_3
 *  33 sipush 129
 *  36 istore 4
 *  38 getstatic #3 <java/lang/System.out>
 *  41 aload_3
 *  42 invokevirtual #4 <java/lang/Integer.intValue>
 *  45 iload 4
 *  47 if_icmpne 54 (+7)
 *  50 iconst_1
 *  51 goto 55 (+4)
 *  54 iconst_0
 *  55 invokevirtual #5 <java/io/PrintStream.println>
 *  58 bipush 10    //第三段开始
 *  60 invokestatic #2 <java/lang/Integer.valueOf>
 *  63 astore 5
 *  65 bipush 10
 *  67 invokestatic #2 <java/lang/Integer.valueOf>
 *  70 astore 6
 *  72 getstatic #3 <java/lang/System.out>
 *  75 aload 5
 *  77 aload 6
 *  79 if_acmpne 86 (+7)
 *  82 iconst_1
 *  83 goto 87 (+4)
 *  86 iconst_0
 *  87 invokevirtual #5 <java/io/PrintStream.println>
 *  90 sipush 128       //第四段开始
 *  93 invokestatic #2 <java/lang/Integer.valueOf>
 *  96 astore 7
 *  98 sipush 128
 * 101 invokestatic #2 <java/lang/Integer.valueOf>
 * 104 astore 8
 * 106 getstatic #3 <java/lang/System.out>
 * 109 aload 7
 * 111 aload 8
 * 113 if_acmpne 120 (+7)
 * 116 iconst_1
 * 117 goto 121 (+4)
 * 120 iconst_0
 * 121 invokevirtual #5 <java/io/PrintStream.println>
 * 124 return
* */