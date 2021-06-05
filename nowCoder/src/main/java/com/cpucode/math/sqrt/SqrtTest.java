package com.cpucode.math.sqrt;

/**
 * 求平方根
 *  解法1：根据平方数的性质——连续n个奇数相加的结果一定是平方数。
 *     如：9=1+3+5；16=1+3+5+7；
 * 所以，不断的进行奇数相加，并判断x大小即可
 *
 * @author : cpucode
 * @date : 2021/6/5
 * @time : 21:57
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class SqrtTest {
    public static void main(String[] args) {
        SqrtTest sqrtTest = new SqrtTest();
        int sqrt = sqrtTest.sqrt(2);

        System.out.println(sqrt);
    }

    /**
     *
     * @param x int整型
     * @return int整型
     */
    public int sqrt (int x) {
        int res = -1;
        int i = 1;

        while (x >= 0){
            x -= i;
            res++;
            i += 2;
        }

        return res;
    }
}
