/**
 * User: cpucode
 * Date: 2021/1/10
 * Time: 12:09
 * Github: https://github.com/CPU-Code
 * CSDN: https://blog.csdn.net/qq_44226094
 */

package com.cpucode.java.GarbageCollection;

//-XX:+PrintGCDetails

public class LocalVarGC {
    public static void main(String[] args) {
        //test1();
        test2();
        //test3();
        //test4();
        //test5();
    }

    private static void test1(){
        byte[] buffer = new byte[10 * 1024 * 1024];     //10MB = 10240kb

        System.gc();

        /*
        [GC (System.gc()) [PSYoungGen: 14049K->792K(73728K)]
        [Full GC (System.gc()) [PSYoungGen: 792K->0K(73728K)] [ParOldGen: 10248K->10828K(167936K)
        * */

    }

    private static void test2(){
        byte[] buffer = new byte[10 * 1024 * 1024];
        buffer = null;

        System.gc();

        /*
        [GC (System.gc()) [PSYoungGen: 14049K->776K(73728K)]
        [Full GC (System.gc()) [PSYoungGen: 776K->0K(73728K)] [ParOldGen: 8K->588K(167936K)]
        * */
    }

    private static void test3(){
        {
            byte[] buffer = new byte[10 * 1024 * 1024];
        }

        System.gc();

        /*
        [GC (System.gc()) [PSYoungGen: 14049K->928K(73728K)]
        [Full GC (System.gc()) [PSYoungGen: 928K->0K(73728K)] [ParOldGen: 10248K->10828K(167936K)
        * */
    }

    private static void test4(){
        {
            byte[] buffer = new byte[10 * 1024 * 1024];
        }
        int value = 10;

        System.gc();

        /*
        [GC (System.gc()) [PSYoungGen: 14049K->864K(73728K)]
        [Full GC (System.gc()) [PSYoungGen: 864K->0K(73728K)] [ParOldGen: 8K->589K(167936K)
        * */
    }

    private static void test5(){
        test1();

        System.gc();

        /*
        * [GC (System.gc()) [PSYoungGen: 14049K->912K(73728K)]
            [Full GC (System.gc()) [PSYoungGen: 912K->0K(73728K)] [ParOldGen: 10248K->10828K(167936K)
            [GC (System.gc()) [PSYoungGen: 1269K->32K(73728K)]
            [Full GC (System.gc()) [PSYoungGen: 32K->0K(73728K)] [ParOldGen: 10828K->588K(167936K)
        * */
    }

}
