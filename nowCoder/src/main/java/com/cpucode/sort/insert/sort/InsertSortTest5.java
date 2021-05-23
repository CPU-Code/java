package com.cpucode.sort.insert.sort;

/**
 * @author : cpucode
 * @date : 2021/5/23
 * @time : 16:28
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class InsertSortTest5 {
    public static void main(String[] args) {
        int[] arr = {5,2,3,1,4};
        int[] ints = MySort(arr);

        for (int i: ints) {
            System.out.print(i);
        }
    }

    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     * 将给定数组排序
     * @param arr int整型一维数组 待排序的数组
     * @return int整型一维数组
     */
    public static int[] MySort (int[] arr){
        if (arr.length < 2){
            return arr;
        }

        insertSort(arr, arr.length - 1);

        return arr;
    }

    private static void insertSort(int[] arr, int n){
        if (n < 1){
            return;
        }

        insertSort(arr, n - 1);

        int index = n;
        int temp = arr[index];

        while (index > 0 && arr[index - 1] > temp){
            arr[index] = arr[index - 1];

            index--;
        }

        arr[index] = temp;
    }
}
