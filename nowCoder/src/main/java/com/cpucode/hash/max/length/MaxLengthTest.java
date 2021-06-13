package com.cpucode.hash.max.length;

import java.util.HashSet;

/**
 * 最长无重复子数组
 *
 *  描述
 * 给定一个数组arr，返回arr的最长无重复元素子数组的长度，无重复指的是所有数字都不相同。
 * 子数组是连续的，比如[1,3,5,7,9]的子数组有[1,3]，[3,5,7]等等，但是[1,3,7]不是子数组
 *
 * 示例1
 * 输入： [2,3,4,5]
 * 返回值： 4
 * 说明：  [2,3,4,5]是最长子数组
 *
 * 示例2
 * 输入： [2,2,3,4,3]
 * 返回值： 3
 * 说明： [2,3,4]是最长子数组
 *
 * 示例3
 * 输入： [9]
 * 返回值： 1
 *
 * 示例4
 * 输入：[1,2,3,1,2,3,2,2]
 * 返回值： 3
 * 说明： 最长子数组为[1,2,3]
 *
 * 示例5
 * 输入： [2,2,3,4,8,99,3]
 * 返回值： 5
 *
 * 说明： 最长子数组为[2,3,4,8,99]
 * 备注： 1 ≤ n ≤ 10^5
 *
 * @author : cpucode
 * @date : 2021/6/13
 * @time : 15:42
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class MaxLengthTest {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5};

        MaxLengthTest maxLengthTest = new MaxLengthTest();
        int i = maxLengthTest.maxLength(arr);

        System.out.println(i);
    }

    /**
     * @param arr int整型一维数组 the array
     * @return int整型
     */
    public int maxLength (int[] arr) {
        int left = 0;
        int right = 0;
        int max = 0;
        HashSet<Integer> set = new HashSet<>();

        while (right < arr.length){
            if (set.contains(arr[right])){
                set.remove(arr[left]);
                left++;
            }else{
                set.add(arr[right]);
                right++;

                max = Math.max(max, set.size());
            }
        }

        return max;
    }
}
