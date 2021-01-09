/**
 * User: cpucode
 * Date: 2021/1/8
 * Time: 23:20
 * Github: https://github.com/CPU-Code
 * CSDN: https://blog.csdn.net/qq_44226094
 */

package com.cpucode.java.executionEngine;

/**
 * 测试解释器模式和JIT编译模式
 *  -Xint  : 5501       解释器模式
 *  -Xcomp : 556      JIT编译模式
 *  -Xmixed : 519     混合模式
 */
public class IntCompTest {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        testPrimeNumber(1000000);

        long end = System.currentTimeMillis();

        System.out.println("花费的时间为：" + (end - start));
    }

    public static void testPrimeNumber(int count){
        for (int i = 0; i < count; i++){
            //计算100以内的质数
            label:
            for (int j = 2; j <= 100; j++) {
                for (int k = 2; k < Math.sqrt(j); k++) {
                    if (j % k == 0){
                        continue label;
                    }
                }
            }
        }
    }
}
