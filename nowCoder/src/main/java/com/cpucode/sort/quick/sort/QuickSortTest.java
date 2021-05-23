package com.cpucode.sort.quick.sort;

/**
 * 快速排序(Quick Sort)：是对冒泡排序的一种改进方法，
 * 在冒泡排序中，进行元素的比较和交换是在相邻元素之间进行的，
 * 元素每次交换只能移动一个位置，所以比较次数和移动次数较多，效率相对较低。
 *
 * 而在快速排序中，元素的比较和交换是从两端向中间进行的，较大的元素一轮就能够交换到后面的位置，
 * 而较小的元素一轮就能交换到前面的位置，元素每次移动的距离较远，
 * 所以比较次数和移动次数较少，y速度较快，故称为“快速排序”。
 *
 * 快速排序的基本思想是：
 * 在待排序的元素任取一个元素作为基准
 * (通常选第一个元素，但最的选择方法是从待排序元素中随机选取一个作为基准)，称为基准元素；
 * 将待排序的元素进行分区，比基准元素大的元素放在它的右边，比其小的放在它的左边；
 * 对左右两个分区重复以上步骤直到所有元素都是有序的
 *
 * @author : cpucode
 * @date : 2021/5/20
 * @time : 21:34
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class QuickSortTest {
    public static void main(String[] args) {
        int[] arr = {5,2,3,1,4};
        int[] ints = MySort(arr);

        for (int i : ints) {
            System.out.print(i);
        }
    }

    public static int[] MySort(int[] arr){
        quickSort(arr, 0, arr.length - 1);

        return arr;
    }

    private static void quickSort(int[] arr, int start, int end){
        //递归条件
        if(start < end){
            int key = arr[start];
            int j = start;

            for (int i = start + 1; i <= end; i++) {
                if (key > arr[i]){
                    //把小放在左, 大放在右
                    swap(arr, i, ++j);
                }
            }

            //把 基准放在 中间
            arr[start] = arr[j];
            arr[j] = key;

            //递归排序前列
            quickSort(arr, start, j - 1);
            //递归排序后列
            quickSort(arr, j + 1, end);
        }
    }

    private static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
