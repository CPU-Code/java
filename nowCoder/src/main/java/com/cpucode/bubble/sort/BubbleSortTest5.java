package com.cpucode.bubble.sort;

/**
 * @author : cpucode
 * @date : 2021/5/21
 * @time : 23:40
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class BubbleSortTest5 {
    public static void main(String[] args) {
        int[] arr = {5,2,3,1,4};

        mySort(arr);

        for (int i : arr){
            System.out.print(i);
        }
    }

    private static void mySort(int[] arr){
        // 初始化最后交换位置为最后一个元素
        int length = arr.length - 1;
        int count = length;

        for (int i = 0; i < arr.length - 1; i++) {
            length = count;

            for (int j = 0; j < length; j++) {
                if (arr[j] > arr[j + 1]){
                    swap(arr, j, j + 1);
                    // 记录无序位置的结束,有序从j+1位置开始
                    count = j;
                }
            }

            // 没有次序交换,排序完成
            if (length == count){
                break;
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
