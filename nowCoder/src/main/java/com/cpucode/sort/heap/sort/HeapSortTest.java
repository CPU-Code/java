package com.cpucode.sort.heap.sort;

/**
 * 堆排序，也可以理解为二叉树排序，这里的堆分为两种，一种是大顶堆，一种是小顶堆，
 * 我们所有的排序方法都以升序为主，其实倒序原理也都差不多，所以这里我们主要分析的是大顶堆。
 * 大顶堆就是根节点不小于他的两个子节点，
 *
 * @author : cpucode
 * @date : 2021/5/21
 * @time : 0:01
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class HeapSortTest {
    public static void main(String[] args) {
        int[] arr = {5,2,3,1,4};
        int[] ints = MySort(arr);

        for (int i: ints) {
            System.out.print(i);
        }
    }

    public static int[] MySort (int[] arr) {
        buildMaxHeap(arr, arr.length - 1);

        for (int i = 0; i < arr.length - 1; i++) {
            swap(arr, 0, arr.length - 1 - i);
            maxHeapfy(arr, 0, arr.length - 1 - i);
        }

        return arr;
    }

    private static void buildMaxHeap(int[] arr, int heapSize){
        for (int i = ((heapSize - 2) >> 1); i >= 0; i--) {
            maxHeapfy(arr, i, heapSize);
        }
    }

    private static void maxHeapfy(int[] arr,int i, int heapSize){
        int left = i * 2 + 1;
        int right = i * 2 + 2;
        int largest = i;

        if (left < heapSize && arr[left] > arr[largest]){
            largest = left;
        }

        if (right < heapSize && arr[right] > arr[largest]){
            largest = right;
        }

        if (largest != i){
            swap(arr, largest, i);

            maxHeapfy(arr, largest, heapSize);
        }
    }

    private static void swap(int[] arr, int i, int j){
        if (i != j){
            arr[i] ^= arr[j];
            arr[j] ^= arr[i];
            arr[i] ^= arr[j];
        }
    }
}
