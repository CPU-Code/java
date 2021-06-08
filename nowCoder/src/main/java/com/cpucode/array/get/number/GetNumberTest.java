package com.cpucode.array.get.number;

import java.util.Arrays;

/**
 * 数字在升序数组中出现的次数
 *
 * 描述
 * 统计一个数字在升序数组中出现的次数。
 *
 * 示例1
 * 输入： [1,2,3,3,3,3,4,5],3
 * 返回值： 4
 *
 * @author : cpucode
 * @date : 2021/6/8
 * @time : 16:58
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class GetNumberTest {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 3, 3, 3, 4, 5};

        GetNumberTest getNumberTest = new GetNumberTest();
        int res = getNumberTest.GetNumberOfK(array, 3);

        System.out.println(res);
    }

    public int GetNumberOfK(int [] array , int k) {
        int index = Arrays.binarySearch(array, k);

        int res = 1;

        for (int i = index + 1; i < array.length; i++) {
            if (array[i] == k){
                res++;
            }
        }

        for (int i = index - 1; i >= 0; i--) {
            if (array[i] == k){
                res++;
            }
        }

        return res;
    }
}
