package com.cpucode.sort.bubble.sort;

/**
 * @author : cpucode
 * @date : 2021/5/21
 * @time : 23:52
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class BubbleSortTest6 {
    public static void main(String[] args) {
        int[] arr = {5,2,3,1,4};

        mySort(arr);

        for (int i : arr){
            System.out.print(i);
        }
    }

    private static void mySort(int[] arr){
        bubbleSort(arr, arr.length - 1);
    }

    private static void bubbleSort(int[] arr, int n){
        if (n <= 1){
            return;
        }

        if (arr == null && arr.length == 0){
            return;
        }

        // 逐渐减少n, 每次都是把最大的放在最后面, 直到n为1
        for (int i = 0; i < n; i++) {
            if (arr[i] > arr[i + 1]){
                swap(arr, i, i + 1);
            }
        }

        bubbleSort(arr, n - 1);
    }

    private static void swap(int[] arr, int i, int j){
        if (i != j){
            arr[j] ^= arr[i];
            arr[i] ^= arr[j];
            arr[j] ^= arr[i];
        }
    }
}
