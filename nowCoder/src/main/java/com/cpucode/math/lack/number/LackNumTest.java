package com.cpucode.math.lack.number;

/**
 * 缺失数字
 *
 *  描述
 * 从0,1,2,...,n这n+1个数中选择n个数，找出这n个数中缺失的那个数，要求O(n)尽可能小。
 *
 * 示例1
 * 输入： [0,1,2,3,4,5,7]
 * 返回值： 6
 *
 * 示例2
 * 输入： [0,2,3]
 * 返回值： 1
 *
 * @author : cpucode
 * @date : 2021/6/9
 * @time : 23:07
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class LackNumTest {
    public static void main(String[] args) {
        int[] a = {0, 1, 2, 3, 4, 5, 7};

        LackNumTest lackNumTest = new LackNumTest();
        int solve = lackNumTest.solve(a);

        System.out.println(solve);
    }

    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 找缺失数字
     * @param a int整型一维数组 给定的数字串
     * @return int整型
     */
    public int solve (int[] a) {

        int length = a.length;

        // 等差数列 (a0 + an) * n /2
        int sum = ((0 + length) * (length + 1)) >> 1;

        for (int i : a) {
            sum -= i;
        }

        return sum;
    }
}
