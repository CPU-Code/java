package com.cpucode.arrays.sort;

import java.util.Arrays;

/**
 * @author : cpucode
 * @date : 2021/5/19
 * @time : 23:26
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class ArraysSortTest {
    public static void main(String[] args) {
        int[] arr = {5,2,3,1,4};
        int[] arr1 = MySort(arr);

        for (int i : arr1){
            System.out.print(i);
        }
    }

    public static int[] MySort (int[] arr) {
        Arrays.sort(arr);

        return arr;
    }
}
