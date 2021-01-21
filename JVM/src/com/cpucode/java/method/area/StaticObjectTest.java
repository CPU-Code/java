/**
 * User: cpucode
 * Date: 2021/1/8
 * Time: 13:15
 * Github: https://github.com/CPU-Code
 * CSDN: https://blog.csdn.net/qq_44226094
 */

package com.cpucode.java.method.area;

// staticObj、instanceObj、localObj存放在哪里？
//只要是对象实例必然会在 Java 堆中分配

public class StaticObjectTest {
    static class Test{
        static ObjectHolder staticObj = new ObjectHolder();

        ObjectHolder instanceObj = new ObjectHolder();

        void foo(){
            ObjectHolder localObj = new ObjectHolder();

            System.out.println("done");
        }
    }

    private static class ObjectHolder{

    }

    public static void main(String[] args) {
        Test test = new StaticObjectTest.Test();

        test.foo();
    }
}

/*
Heap
 PSYoungGen      total 73728K, used 5079K [0x000000076e100000, 0x0000000773300000, 0x00000007c0000000)
  eden space 63488K, 8% used [0x000000076e100000,0x000000076e5f5e58,0x0000000771f00000)
  from space 10240K, 0% used [0x0000000772900000,0x0000000772900000,0x0000000773300000)
  to   space 10240K, 0% used [0x0000000771f00000,0x0000000771f00000,0x0000000772900000)
 ParOldGen       total 167936K, used 0K [0x00000006ca200000, 0x00000006d4600000, 0x000000076e100000)
  object space 167936K, 0% used [0x00000006ca200000,0x00000006ca200000,0x00000006d4600000)
 Metaspace       used 3269K, capacity 4500K, committed 4864K, reserved 1056768K
  class space    used 349K, capacity 388K, committed 512K, reserved 1048576K

* */