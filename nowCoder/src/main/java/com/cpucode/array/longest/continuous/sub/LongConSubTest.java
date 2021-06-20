package com.cpucode.array.longest.continuous.sub;

import java.util.HashSet;

/**
 * 数组中的最长连续子序列
 *
 * 描述
 * 给定无序数组arr，返回其中最长的连续序列的长度(要求值连续，位置可以不连续,例如 3,4,5,6为连续的自然数）
 * 示例1
 * 输入： [100,4,200,1,3,2]
 * 返回值：4
 *
 * 示例2
 * 输入： [1,1,1]
 * 返回值：1
 * 备注：
 * 1 ≤ n ≤ 10^5
 * 1 <= arr_i <= 10^8
 *
 * @author : cpucode
 * @date : 2021/6/20
 * @time : 21:39
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class LongConSubTest {
    public static void main(String[] args) {
        int[] arr = {100, 4, 200, 1, 3, 2};
        LongConSubTest longConSubTest = new LongConSubTest();
        int mls = longConSubTest.MLS(arr);

        System.out.println(mls);
    }

    /**
     * max increasing subsequence
     * @param arr int整型一维数组 the array
     * @return int整型
     */
    public int MLS (int[] arr) {
        // write code here
        HashSet<Integer> set = new HashSet<>();
        int sum = 0;

        for (int i : arr) {
            set.add(i);
        }

        for (int i : arr) {
            if (set.contains(i - 1)){
                continue;
            }
            int temp = i;

            while (set.contains(temp + 1)){
                temp++;
            }

            sum = Math.max(sum, temp - i + 1);
        }

        return sum;
    }
}
