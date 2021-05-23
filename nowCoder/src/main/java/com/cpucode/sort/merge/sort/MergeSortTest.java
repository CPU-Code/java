package com.cpucode.sort.merge.sort;

/**
 * 归并排序（MERGE-SORT）是利用归并的思想实现的排序方法，
 * 该算法采用经典的分治（divide-and-conquer）策略（分治法将问题分(divide)成一些小的问题然后递归求解，
 * 而治(conquer)的阶段则将分的阶段得到的各答案"修补"在一起，即分而治之)。
 *
 * 归并排序是稳定排序，它也是一种十分高效的排序，能利用完全二叉树特性的排序一般性能都不会太差。
 * java中Arrays.sort()采用了一种名为TimSort的排序算法，就是归并排序的优化版本。
 * 从上文的图中可看出，每次合并操作的平均时间复杂度为O(n)，而完全二叉树的深度为|log2n|。
 * 总的平均时间复杂度为O(nlogn)。而且，归并排序的最好，最坏，平均时间复杂度均为O(nlogn)。
 *
 * @author : cpucode
 * @date : 2021/5/20
 * @time : 21:52
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class MergeSortTest {
    public static void main(String[] args) {
        int[] arr = {5,2,3,1,4};

        int[] ints = MySort(arr);

        for (int i: ints) {
            System.out.print(i);
        }
    }

    public static int[] MySort(int[] arr){
        mergeSort(arr, 0, arr.length - 1);

        return arr;
    }

    private static void mergeSort(int[] arr, int l, int r){
        if (l >= r){
            //递归结束条件
            return;
        }
        //求中间位置
        int mid = l + ((r - l) >> 1);

        //左递归
        mergeSort(arr, l , mid);
        //右递归
        mergeSort(arr, mid + 1, r);

        merge(arr, l, mid, r);
    }

    private static void merge(int[] arr, int l, int mid, int r){
        int p1 = l;
        int p2 = mid + 1;
        int i = 0;
        //临时表
        int[] temp = new int[r - l + 1];

        while (p1 <= mid && p2 <= r){
            // 把小的排序给临时表
            temp[i++] = (arr[p1] > arr[p2]) ? arr[p2++] : arr[p1++];
        }

        //判断 p1 是否为完
        while (p1 <= mid){
            temp[i++] = arr[p1++];
        }

        //判断 p2 是否为完
        while (p2 <= r){
            temp[i++] = arr[p2++];
        }

        //排序好的临时表 赋值
        for(i = 0; i < temp.length; i++){
            arr[l + i] = temp[i];
        }
    }
}
