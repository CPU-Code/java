package com.cpucode.java.instruction.analysis;

import com.sun.org.apache.xpath.internal.operations.Or;

import java.io.File;

/**
 * 指令4：对象、数组的创建与访问指令
 * @author : cpucode
 * @Date : 2021/1/26
 * @Time : 11:18
 * @Github : https://github.com/CPU-Code
 * @CSDN : https://blog.csdn.net/qq_44226094
 */
public class NewTest {
    /**
     * 创建指令
     * */
    public void newInstance(){
        Object obj = new Object();

        File file = new File("cpuCode.av");

        /**
         *  0     1    2
         * this  obj  file
         *
         *  0 new #2 <java/lang/Object>     把 地址加载到栈
         *  3 dup                           复制一份加载到栈
         *  4 invokespecial #1 <java/lang/Object.<init>>    把 栈 中地址取出寻找地址
         *  7 astore_1              把栈中地址保存到局部变量 obj
         *  8 new #3 <java/io/File>         把 地址加载到栈
         * 11 dup                           复制一份加载到栈
         * 12 ldc #4 <cpuCode.av>           把 引用 加载到栈
         * 14 invokespecial #5 <java/io/File.<init>>    把 栈 中俩个地址取出寻找地址
         * 17 astore_2                      把地址存储到 局部变量 file
         * */
    }

    public void newArray(){
        int[] intArray = new int[10];
        Object[] objects = new Object[10];
        int[][] mintArray = new int[10][10];

        String[][] strArray = new String[10][];

        /**
         *  0       1       2           3         4
         * this  intArray  objects  mintArray  strArray
         *
         *  0 bipush 10         把 10 加载到栈中
         *  2 newarray 10 (int)
         *  4 astore_1          把 地址 存储到 intArray
         *  5 bipush 10         把 10 加载到栈
         *  7 anewarray #2 <java/lang/Object>
         * 10 astore_2
         * 11 bipush 10         把 10 加载到栈
         * 13 bipush 10         把 10 加载到栈
         * 15 multianewarray #6 <[[I> dim 2
         * 19 astore_3
         * 20 bipush 10         把 10 加载到栈
         * 22 anewarray #7 <[Ljava/lang/String;>
         * 25 astore 4
         * */
    }

    /**
     * 字段访问指令
     * */
    public void sayHello(){
        System.out.println("cpuCode");
        /**
         * 0 getstatic #8 <java/lang/System.out>
         * 3 ldc #9 <cpuCode>
         * 5 invokevirtual #10 <java/io/PrintStream.println>
         * */
    }

    public void setOrderId(){
        Order order = new Order();
        order.id = 1010;
        System.out.println(order.id);

        Order.name = "cpu";
        System.out.println(Order.name);

        /**
         *  0       1
         * this   order
         *
         *  0 new #11 <com/cpucode/java/instruction/analysis/Order>
         *  3 dup
         *  4 invokespecial #12 <com/cpucode/java/instruction/analysis/Order.<init>>
         *  7 astore_1
         *  8 aload_1
         *  9 sipush 1010
         * 12 putfield #13 <com/cpucode/java/instruction/analysis/Order.id>
         * 15 getstatic #8 <java/lang/System.out>
         * 18 aload_1
         * 19 getfield #13 <com/cpucode/java/instruction/analysis/Order.id>
         * 22 invokevirtual #14 <java/io/PrintStream.println>
         * 25 ldc #15 <cpu>
         * 27 putstatic #16 <com/cpucode/java/instruction/analysis/Order.name>
         * 30 getstatic #8 <java/lang/System.out>
         * 33 getstatic #16 <com/cpucode/java/instruction/analysis/Order.name>
         * 36 invokevirtual #10 <java/io/PrintStream.println>
         * */
    }

    /**
     * 数组操作指令
     * */
    public void setArray(){
        int[] intArray = new int[10];
        intArray[3] = 20;
        System.out.println(intArray[1]);

        boolean[] arr = new boolean[10];
        arr[1] = true;

        /**
         *  0       1        2
         * this   intArray  arr
         *
         *  0 bipush 10
         *  2 newarray 10 (int)
         *  4 astore_1
         *  5 aload_1
         *  6 iconst_3
         *  7 bipush 20
         *  9 iastore
         * 10 getstatic #8 <java/lang/System.out>
         * 13 aload_1
         * 14 iconst_1
         * 15 iaload
         * 16 invokevirtual #14 <java/io/PrintStream.println>
         * 19 bipush 10
         * 21 newarray 4 (boolean)
         * 23 astore_2
         * 24 aload_2
         * 25 iconst_1
         * 26 iconst_1
         * 27 bastore
         * */
    }

    public void arrLength(){
        double[] arr = new double[10];
        System.out.println(arr.length);

        /**
         *  0     1 2
         * this   arr
         *
         *  0 bipush 10
         *  2 newarray 7 (double)
         *  4 astore_1
         *  5 getstatic #8 <java/lang/System.out>
         *  8 aload_1
         *  9 arraylength       数组长度
         * 10 invokevirtual #14 <java/io/PrintStream.println>
         * */
    }

    /**
     *类型检查指令
     * */
    public String checkCast(Object obj){
        if(obj instanceof String){
            return (String) obj;
        }else {
            return null;
        }

        /**
         *  0     1
         * this  obj
         *
         *  0 aload_1           obj加载到栈
         *  1 instanceof #17 <java/lang/String>
         *  4 ifeq 12 (+8)      比较
         *  7 aload_1           obj加载到栈
         *  8 checkcast #17 <java/lang/String>
         * 11 areturn
         * 12 aconst_null   为空
         * 13 areturn
         * */
    }
}

class Order{
    int id;
    static String name;
}