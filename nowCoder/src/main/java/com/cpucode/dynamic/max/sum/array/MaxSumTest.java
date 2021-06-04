package com.cpucode.dynamic.max.sum.array;

/**
 * @author : cpucode
 * @date : 2021/6/4
 * @time : 18:30
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class MaxSumTest {
    public static void main(String[] args) {
        int[] arr = {1, -2, 3, 5, -2, 6, -1};
        MaxSumTest maxSumTest = new MaxSumTest();
        int i = maxSumTest.maxsumofSubarray(arr);

        System.out.println(i);
    }

    /**
     * max sum of the subarray
     * @param arr int整型一维数组 the array
     * @return int整型
     */
    public int maxsumofSubarray (int[] arr) {
        int max = arr[0];
        int temp = arr[0];

        for (int i = 1; i < arr.length; i++) {
            temp = Math.max(temp , 0) + arr[i];

            max = Math.max(temp, max);
        }

        return max;
    }
}
