package com.cpucode.math.max.common.divisor;

/**
 * 最大公约数
 *  描述
 * 求出两个数的最大公约数，如果有一个自然数a能被自然数b整除，则称a为b的倍数，b为a的约数。
 * 几个自然数公有的约数，叫做这几个自然数的公约数。公约数中最大的一个公约数，称为这几个自然数的最大公约数。
 *
 * 示例1
 * 输入： 3,6
 * 返回值： 3
 *
 * 示例2
 * 输入：  8,12
 * 返回值： 4
 *
 * 备注：
 * a和b的范围是[1-10 ^9]
 *
 * @author : cpucode
 * @date : 2021/6/3
 * @time : 14:44
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class MaxDivisorTest {
    public static void main(String[] args) {
        MaxDivisorTest maxDivisorTest = new MaxDivisorTest();
        int gcd = maxDivisorTest.gcd(3, 6);

        System.out.println(gcd);
    }

    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 求出a、b的最大公约数。
     * @param a int
     * @param b int
     * @return int
     */
    public int gcd (int a, int b) {
        int res = 0;

        while (b != 0){
            res = a % b;
            a = b;
            b = res;
        }

        return a;
    }
}
