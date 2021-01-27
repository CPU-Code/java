package com.cpucode.java.instruction.analysis;

/**
 * 补充：方法调用指令的补充说明
 * @author : cpucode
 * @Date : 2021/1/27
 * @Time : 15:11
 * @Github : https://github.com/CPU-Code
 * @CSDN : https://blog.csdn.net/qq_44226094
 */
public class InterfaceMethodTest {
    public static void main(String[] args){
        AA aa = new BB();

        aa.method2();
        AA.method1();

        /**
         *  0 new #2 <com/cpucode/java/instruction/analysis/BB>
         *  3 dup
         *  4 invokespecial #3 <com/cpucode/java/instruction/analysis/BB.<init>>    调用构造方法
         *  7 astore_1
         *
         *  8 aload_1
         *  9 invokeinterface #4 <com/cpucode/java/instruction/analysis/AA.method2> count 1     调用接口方法
         *
         * 14 invokestatic #5 <com/cpucode/java/instruction/analysis/AA.method1>            调用静态方法
         * 17 return
         * */
    }
}

interface AA{
    public static void method1(){

    }

    public default void method2(){

    }
}

class BB implements AA{

}
