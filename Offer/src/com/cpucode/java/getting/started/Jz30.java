package com.cpucode.java.getting.started;

/**
 * 题目描述
 * 输入一个整型数组，数组里有正数也有负数。数组中的一个或连续多个整数组成一个子数组。求所有子数组的和的最大值。要求时间复杂度为 O(n).
 * 示例1
 * 输入
 * [1,-2,3,10,-4,7,2,-5]
 * 返回值
 * 18
 * 说明
 * 输入的数组为{1,-2,3,10,—4,7,2,一5}，和最大的子数组为{3,10,一4,7,2}，因此输出为该子数组的和 18。
 *
 * @author : cpucode
 * @Date : 2021/1/21
 * @Time : 12:08
 * @Github : https://github.com/CPU-Code
 * @CSDN : https://blog.csdn.net/qq_44226094
 */
public class Jz30 {
    public class Solution {
        public int FindGreatestSumOfSubArray(int[] array) {

            int num = array[0];

            for(int i = 1; i < array.length; i++){
                //累加 跳过小于负值
                array[i] += array[i - 1] > 0 ? array[i -1] : 0;

                //比较累加值 和最大值
                num = Math.max(array[i], num);
            }

            return num;
        }
    }
}
