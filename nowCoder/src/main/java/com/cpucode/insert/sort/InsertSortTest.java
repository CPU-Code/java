package com.cpucode.insert.sort;

/**
 * 插入排序的原理是默认前面的元素都是已经排序好的，然后从后面逐个读取插入到前面排序好的合适的位置，
 * 就相当于打扑克的时候每获取一张牌的时候就插入到合适的位置一样。
 * 插入排序可以分为两种，一种是直接插入还一种是二分法插入，
 * 直接插入的原理比较简单，就是往前逐个查找直到找到合适的位置然后插入，
 * 二分法插入是先折半查找，找到合适的位置然后再插入。
 *
 * @author : cpucode
 * @date : 2021/5/22
 * @time : 11:01
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class InsertSortTest {
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
        int temp;
        int j;

        for (int i = 1; i < arr.length; i++) {
            temp = arr[i];

            for (j = i; j > 0; j--) {
                if (arr[j - 1] > temp){
                    //往后移
                    arr[j] = arr[j - 1];
                }else{
                    //前面的值 小于 就返回 并交换
                    break;
                }
            }

            arr[j] = temp;
        }

        return arr;
    }
}
