package com.cpucode.sort.select.sort;

/**
 * @author : cpucode
 * @date : 2021/5/22
 * @time : 10:28
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class SelectSortTest2 {
    public static void main(String[] args) {
        int arr[] = {5,2,3,1,4};
        selectSort(arr , 0);

        for(int i : arr){
            System.out.print(i);
        }
    }

    private static void selectSort(int[] arr, int index){
        if (arr.length <= index){
            return;
        }

        int min = index;

        for (int i = index + 1; i < arr.length; i++) {
            if (arr[min] > arr[i]){
                min = i;
            }
        }

        if (min != index){
            swap(arr, min, index);
        }

        selectSort(arr, ++index);
    }

    private static void swap(int[] arr, int i, int j){
        if (i != j){
            arr[i] = arr[i] + arr[j];
            arr[j] = arr[i] - arr[j];
            arr[i] = arr[i] - arr[j];
        }
    }
}
