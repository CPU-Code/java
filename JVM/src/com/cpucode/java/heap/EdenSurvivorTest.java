/**
 * User: cpucode
 * Date: 2021/1/5
 * Time: 16:42
 * Github: https://github.com/CPU-Code
 * CSDN: https://blog.csdn.net/qq_44226094
 */

package com.cpucode.java.heap;


/*
 -Xms600m -Xmx600m

 -XX:NewRatio ： 设置新生代与老年代的比例。默认值是2.
 -XX:SurvivorRatio ：设置新生代中Eden区与Survivor区的比例。默认值是8
 -XX:-UseAdaptiveSizePolicy ：关闭自适应的内存分配策略  （暂时用不到）
 -Xmn:设置新生代的空间的大小。 （一般不设置）

 查看 visualVM

 共 : 600M

 Bden apace : 150M      ------200M---------------------- 1:2
 Survivor 0 : 25M         |  6:1:1 (默认:8:1:1)     |
 Survivor 1 : 25M       ---                        |
                                                   |
 Old Gen : 400M        -----------------------------

* */
public class EdenSurvivorTest {
    public static void main(String[] args) {
        System.out.println("我是cpucode");

        try{
            Thread.sleep(100000000);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
    }
}
