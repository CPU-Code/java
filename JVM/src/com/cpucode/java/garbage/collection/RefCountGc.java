/**
 * User: cpucode
 * Date: 2021/1/9
 * Time: 19:41
 * Github: https://github.com/CPU-Code
 * CSDN: https://blog.csdn.net/qq_44226094
 */

package com.cpucode.java.garbage.collection;

/**
 * -XX:+PrintGCDetails
 * 证明：java使用的不是引用计数算法
 */
public class RefCountGc {
    //这个成员属性唯一的作用就是占用一点内存
    private final byte[] bigSize = new byte[5 * 1024 * 1024];
    Object reference = null;

    public static void main(String[] args) {
        //test1();
        test2();
    }

    private static void test2(){
        RefCountGc obj1 = new RefCountGc();
        RefCountGc obj2 = new RefCountGc();

        obj1.reference = obj2;
        obj2.reference = obj1;

        obj1 = null;
        obj2 = null;

        System.gc();

        /*
        [GC (System.gc()) [PSYoungGen: 14049K->856K(73728K)] 14049K->864K(241664K), 0.0007954 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
        [Full GC (System.gc()) [PSYoungGen: 856K->0K(73728K)] [ParOldGen: 8K->586K(167936K)] 864K->586K(241664K), [Metaspace: 3256K->3256K(1056768K)], 0.0038472 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
        Heap
         PSYoungGen      total 73728K, used 1905K [0x000000076e100000, 0x0000000773300000, 0x00000007c0000000)
          eden space 63488K, 3% used [0x000000076e100000,0x000000076e2dc410,0x0000000771f00000)
          from space 10240K, 0% used [0x0000000771f00000,0x0000000771f00000,0x0000000772900000)
          to   space 10240K, 0% used [0x0000000772900000,0x0000000772900000,0x0000000773300000)
         ParOldGen       total 167936K, used 586K [0x00000006ca200000, 0x00000006d4600000, 0x000000076e100000)
          object space 167936K, 0% used [0x00000006ca200000,0x00000006ca2929f0,0x00000006d4600000)
         Metaspace       used 3271K, capacity 4496K, committed 4864K, reserved 1056768K
          class space    used 349K, capacity 388K, committed 512K, reserved 1048576K
        * */
    }

    private static void test1(){
        RefCountGc obj1 = new RefCountGc();
        RefCountGc obj2 = new RefCountGc();

        obj1.reference = obj2;
        obj2.reference = obj1;

        obj1 = null;
        obj2 = null;

        /*
            Heap
             PSYoungGen      total 73728K, used 15319K [0x000000076e100000, 0x0000000773300000, 0x00000007c0000000)
              eden space 63488K, 24% used [0x000000076e100000,0x000000076eff5e78,0x0000000771f00000)
              from space 10240K, 0% used [0x0000000772900000,0x0000000772900000,0x0000000773300000)
              to   space 10240K, 0% used [0x0000000771f00000,0x0000000771f00000,0x0000000772900000)
             ParOldGen       total 167936K, used 0K [0x00000006ca200000, 0x00000006d4600000, 0x000000076e100000)
              object space 167936K, 0% used [0x00000006ca200000,0x00000006ca200000,0x00000006d4600000)
             Metaspace       used 3296K, capacity 4496K, committed 4864K, reserved 1056768K
              class space    used 353K, capacity 388K, committed 512K, reserved 1048576K
        * */
    }
}
