package com.cpucode.insert.sort;

/**
 * @author : cpucode
 * @date : 2021/5/23
 * @time : 13:35
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class InsertSortTest2 {
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
            int temp = arr[i];
            int j =  i - 1;

            for (; j >= 0; j--) {
                if (arr[j] > temp){
                    //后移
                    arr[j + 1] = arr[j];
                }else {
                    break;
                }
            }

            arr[j + 1] = temp;
        }

        return arr;
    }

}
