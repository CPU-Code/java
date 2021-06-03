package com.cpucode.array.merge.ordered;

import java.util.Arrays;

/**
 * 合并两个有序的数组
 *
 *  描述
 *  给出两个有序的整数数组 A 和 B ，请将数组 B 合并到数组 A 中，变成一个有序的数组
 * 注意：
 *   可以假设 A 数组有足够的空间存放 B 数组的元素，A 和 B 中初始的元素数目分别为 m 和 n
 *
 * @author : cpucode
 * @date : 2021/6/3
 * @time : 21:54
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class MergeTest {
    public static void main(String[] args) {
    }

    public void merge(int A[], int m, int B[], int n) {
        int[] C = new int[m + n + 1];
        int i = 0;
        int j = 0;
        int index = 0;

        while (i < m && j < n){
            if (A[i] < B[j]){
                C[index] = A[i];
                index++;
                i++;
            }else {
                C[index] = B[j];
                index++;
                j++;
            }
        }

        while (i < m){
            C[index] = A[i];
            index++;
            i++;
        }

        while (j < n){
            C[index] = B[j];
            index++;
            j++;
        }

        i = 0;

        while (i < index){
            A[i] = C[i];
            i++;
        }
    }
}
