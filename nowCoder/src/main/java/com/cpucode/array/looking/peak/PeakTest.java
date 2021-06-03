package com.cpucode.array.looking.peak;

/**
 * 寻找峰值
 *
 * 描述
 * 山峰元素是指其值大于或等于左右相邻值的元素。给定一个输入数组nums，
 * 任意两个相邻元素值不相等，数组可能包含多个山峰。找到索引最大的那个山峰元素并返回其索引。
 *
 * 假设 nums[-1] = nums[n] = -∞。
 *
 * 示例1
 *   输入：
 *    [2,4,1,2,7,8,4]
 *  返回值：
 *    5
 * @author : cpucode
 * @date : 2021/6/3
 * @time : 14:36
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class PeakTest {
    public static void main(String[] args) {
        int[] a = {2, 4, 1, 2, 7, 8, 4};

        PeakTest peakTest = new PeakTest();
        int solve = peakTest.solve(a);

        System.out.println(solve);
    }

    /**
     * 寻找最后的山峰
     * @param a int整型一维数组
     * @return int整型
     */
    public int solve (int[] a) {
        int length = a.length - 1;

        for (int i = length; i >= 0; i--) {
            if( (i == length && a[i] > a[i - 1]) || (i == 0 && a[i] > a[i + 1]) ){
                return i;
            }else if( (a[i] > a[i - 1]) && (a[i] > a[i + 1] )){
                return i;
            }
        }

        return -1;
    }
}
