/**
 * User: cpucode
 * Date: 2021/1/10
 * Time: 11:52
 * Github: https://github.com/CPU-Code
 * CSDN: https://blog.csdn.net/qq_44226094
 */

package com.cpucode.java.GarbageCollection;

public class SystemGCTest {
    public static void main(String[] args) {
        test1();
        //test2();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();

        System.out.println("调用了重写finalize");
    }
    private static void test1(){
        new SystemGCTest();

        //提醒jvm的垃圾回收器执行gc,但是不确定是否马上执行gc
        //与Runtime.getRuntime().gc();的作用一样。
        System.gc();
    }

    private static void test2(){
        new SystemGCTest();

        System.gc();

        //强制调用使用引用的对象的finalize()方法
        System.runFinalization();
    }
}
