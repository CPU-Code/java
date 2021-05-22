package com.cpucode.select.sort;

/**
 * 选择排序是默认前面都是已经排序好的，然后从后面选择最小的放在前面排序好的的后面，
 * 首先第一轮循环的时候默认的排序好的为空，然后从后面选择最小的放到数组的第一个位置，
 * 第二轮循环的时候默认第一个元素是已经排序好的，然后从剩下的找出最小的放到数组的第二个位置，
 * 第三轮循环的时候默认前两个都是已经排序好的，然后再从剩下的选择一个最小的放到数组的第三个位置，以此类推。
 *
 * @author : cpucode
 * @date : 2021/5/22
 * @time : 10:19
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class SelectSortTest {
    public static void main(String[] args) {
        int arr[] = {5,2,3,1,4};
        selectSort(arr);

        for(int i : arr){
            System.out.print(i);
        }
    }

    private static void selectSort(int[] arr){
        int index = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            index = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[index] > arr[j]){
                    index = j;
                }
            }

            if (index != i){
                swap(arr, index, i);
            }
        }
    }

    private static void swap(int[] arr, int i, int j){
        if (i != j){
            arr[i] ^= arr[j];
            arr[j] ^= arr[i];
            arr[i] ^= arr[j];
        }
    }
}
