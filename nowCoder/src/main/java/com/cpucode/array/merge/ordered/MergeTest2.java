package com.cpucode.array.merge.ordered;

/**
 * 合并两个有序的数组
 *
 * nums1有足够的空间容纳nums2，所以我们可以认为nums1的长度肯定大于nums2。
 * 正常的归并都是从小往大开始，这里我们可以换种思路，从大往小开始
 *
 * @author : cpucode
 * @date : 2021/6/4
 * @time : 16:52
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class MergeTest2 {
    public static void main(String[] args) {

    }

    public void merge(int A[], int m, int B[], int n) {
        int i = m - 1;
        int j = n - 1;
        int end = m + n -1;

        while (j >= 0){
            if (i >= 0 && A[i] > A[j]){
                A[end] = A[i];
                end--;
                i--;
            }else {
                A[end] = B[j];
                end--;
                j--;
            }
        }
    }
}
