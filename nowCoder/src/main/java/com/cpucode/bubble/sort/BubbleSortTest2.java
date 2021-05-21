package com.cpucode.bubble.sort;

/**
 * @author : cpucode
 * @date : 2021/5/21
 * @time : 14:47
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class BubbleSortTest2 {
    public static void main(String[] args) {
        int[] arr = {5,2,3,1,4};

        mySort(arr);

        for (int i: arr){
            System.out.print(i);
        }
    }

    private static void mySort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]){
                    swap(arr, i, j);
                }
            }
        }
    }

    private static void swap(int[] arr, int i, int j){
        arr[i] ^= arr[j];
        arr[j] ^= arr[i];
        arr[i] ^= arr[j];
    }
}
