package com.cpucode.sort.selection;

import java.util.Arrays;

/**
 * 选择排序
 * 选择排序算法的实现思路有点类似插入排序，也分已排序区间和未排序区间。
 * 但是选择排序每次会从未排序区间中找到最小的元素，将其放到已排序区间的末尾。
 *
 * 算法分析
 *  空间复杂度 O(1)，时间复杂度 O(n²)。
 *
 *  那选择排序是稳定的排序算法吗？
 *
 *  答案是否定的，选择排序是一种不稳定的排序算法。
 *  选择排序每次都要找剩余未排序元素中的最小值，并和前面的元素交换位置，这样破坏了稳定性。
 *
 * 比如 5，8，5，2，9 这样一组数据，使用选择排序算法来排序的话，
 * 第一次找到最小元素 2，与第一个 5 交换位置，那第一个 5 和中间的 5 顺序就变了，
 * 所以就不稳定了。正是因此，相对于冒泡排序和插入排序，选择排序就稍微逊色了。
 *
 * @author : cpucode
 * @date : 2021/5/13
 * @time : 21:22
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class SelectionSortTest {
    public static void main(String[] args) {
        int[] nums = {1, 2, 7, 9, 5, 8};
        selectionSort(nums);

        System.out.println(Arrays.toString(nums));
    }

    private static void selectionSort(int[] nums) {
        for (int i = 0, n = nums.length; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i; j < n; j++) {
                if (nums[j] < nums[minIndex]){
                    minIndex = j;
                }
            }

            swap(nums, minIndex, i);
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}
