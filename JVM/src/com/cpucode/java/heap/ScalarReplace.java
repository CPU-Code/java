/**
 * User: cpucode
 * Date: 2021/1/6
 * Time: 16:50
 * Github: https://github.com/CPU-Code
 * CSDN: https://blog.csdn.net/qq_44226094
 */

package com.cpucode.java.heap;
/*
 * 标量替换测试
   -Xmx100m -Xms100m -XX:+PrintGC -XX:-EliminateAllocations
*/
public class ScalarReplace {
    public static class User{
        public int id;
        public String name;
    }

    public static void alloc(){
        //未发生逃逸
        User u = new User();

        u.id = 4;
        u.name = "cpucode";
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        int end = 10000000;

        for (int i = 0; i < end; i++) {
            alloc();
        }

        long end = System.currentTimeMillis();

        System.out.println("花费的时间为： " + (end - start) + " ms");
    }
}

/*
关闭了标量替换
[GC (Allocation Failure)  25600K->904K(98304K), 0.0012884 secs]
[GC (Allocation Failure)  26504K->904K(98304K), 0.0009374 secs]
[GC (Allocation Failure)  26504K->824K(98304K), 0.0006633 secs]
[GC (Allocation Failure)  26424K->840K(98304K), 0.0008609 secs]
[GC (Allocation Failure)  26440K->752K(98304K), 0.0007329 secs]
[GC (Allocation Failure)  26352K->888K(101376K), 0.0012455 secs]
[GC (Allocation Failure)  32632K->736K(100864K), 0.0008876 secs]
[GC (Allocation Failure)  32480K->736K(100864K), 0.0006983 secs]
花费的时间为： 55 ms

开启了标量替换
花费的时间为： 4 ms

* */