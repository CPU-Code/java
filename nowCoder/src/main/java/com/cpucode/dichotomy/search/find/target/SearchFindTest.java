package com.cpucode.dichotomy.search.find.target;

/**
 * 二分查找-II
 *
 *  描述
 * 请实现有重复数字的升序数组的二分查找
 * 给定一个 元素有序的（升序）整型数组 nums 和一个目标值 target  ，
 * 写一个函数搜索 nums 中的第一个出现的target，如果目标值存在返回下标，否则返回 -1
 *
 * 示例1
 * 输入：[1,2,4,4,5],4
 *
 * 返回值：2
 *
 * 说明：
 * 从左到右，查找到第1个为4的，下标为2，返回2
 *
 * 示例2
 * 输入： [1,2,4,4,5],3
 * 返回值： -1
 *
 * 示例3
 * 输入： [1,1,1,1,1],1
 * 返回值： 0
 *
 * @author : cpucode
 * @date : 2021/6/13
 * @time : 13:11
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class SearchFindTest {
    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 4, 5};
        SearchFindTest searchFindTest = new SearchFindTest();
        int search = searchFindTest.search(nums, 4);

        System.out.println(search);
    }

    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 如果目标值存在返回下标，否则返回 -1
     * @param nums int整型一维数组
     * @param target int整型
     * @return int整型
     */
    public int search (int[] nums, int target) {
        if (nums == null && nums.length == 0){
            return -1;
        }

        int left = 0;
        int right = nums.length - 1;
        int min = 0;

        while (left < right){
            min = (left + right) >> 1;

            if (nums[min] < target){
                left = min + 1;
            }else{
                right = min;
            }
        }

        return nums[left] == target ? left : -1;
    }
}
