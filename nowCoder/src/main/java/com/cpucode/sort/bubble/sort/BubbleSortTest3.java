package com.cpucode.sort.bubble.sort;

/**
 * @author : cpucode
 * @date : 2021/5/21
 * @time : 15:01
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class BubbleSortTest3 {
    public static void main(String[] args) {
        int[] arr = {5,2,3,1,4};

        mySort(arr);

        for (int i : arr){
            System.out.print(i);
        }
    }

    private static void mySort(int[] arr){
        int length = arr.length - 1;

        while (length > 0 ){
            for (int i = 0; i < length; i++) {
                if (arr[i] > arr[i + 1]){
                    swap(arr, i, i + 1);
                }
            }

            length--;
        }
    }

    private static void swap(int[] arr, int i, int j){
        arr[i] ^= arr[j];
        arr[j] ^= arr[i];
        arr[i] ^= arr[j];
    }
}
