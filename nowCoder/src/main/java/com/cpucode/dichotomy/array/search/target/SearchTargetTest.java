package com.cpucode.dichotomy.array.search.target;

/**
 * 在旋转过的有序数组中寻找目标值
 *
 *  描述
 * 给定一个整数数组nums，按升序排序，数组中的元素各不相同。
 * nums数组在传递给search函数之前，会在预先未知的某个下标 t（0 <= t <= nums.length-1）上进行旋转，
 * 让数组变为[nums[t], nums[t+1], ..., nums[nums.length-1], nums[0], nums[1], ..., nums[t-1]]。
 * 比如，数组[0,2,4,6,8,10]在下标2处旋转之后变为[6,8,10,0,2,4]
 * 现在给定一个旋转后的数组nums和一个整数target，请你查找这个数组是不是存在这个target，
 * 如果存在，那么返回它的下标，如果不存在，返回-1
 *
 * 示例1
 * 输入：[6,8,10,0,2,4],10
 * 返回值：2
 *
 * 示例2
 * 输入：[6,8,10,0,2,4],3
 * 返回值：-1
 *
 * 示例3
 * 输入：[2],1
 * 返回值：-1
 * 备注：  1 <= nums.length <= 4000
 *
 * @author : cpucode
 * @date : 2021/6/9
 * @time : 11:03
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class SearchTargetTest {
    public static void main(String[] args) {
        int[] nums = {6, 8, 10, 0, 2, 4};
        SearchTargetTest searchTargetTest = new SearchTargetTest();
        int search = searchTargetTest.search(nums, 10);

        System.out.println(search);
    }

    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     * @param nums int整型一维数组
     * @param target int整型
     * @return int整型
     */
    public int search (int[] nums, int target) {
        int left = 0;
        int right = nums.length -1;
        int min = 0;

        while (left <= right){
            min = (left + right) >> 1;

            if (nums[min] == target){
                return min;
            }

            if (nums[left] < nums[min]){
                //左边有序

                if (nums[left] <= target && nums[min] > target){
                    // 目标是在这个范围里
                    right = min -1;
                }else {
                    left = min + 1;
                }

            }else {
                //右边有序

                if (nums[min] < target && nums[right] >= target){
                    // 目标是在这个范围里
                    left = min + 1;
                }else {
                    right = min - 1;
                }
            }
        }

        return -1;
    }
}
