package com.cpucode.sort.insert.sort;

/**
 * @author : cpucode
 * @date : 2021/5/23
 * @time : 14:14
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class InsertSortTest4 {
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
        for (int i = 1; i < arr.length; i++) {
            int low = 0;
            int hight = i;
            int temp = arr[i];

            while (low <= hight){
                int mid = (hight + low) >> 1;

                if (arr[mid] > temp){
                    hight = mid - 1;
                }else {
                    low = mid + 1;
                }
            }
            int j = i;

            while (j > low){
                arr[j] = arr[j - 1];
                j--;
            }

            if (j != i){
                arr[j] = temp;
            }
        }

        return arr;
    }
}
