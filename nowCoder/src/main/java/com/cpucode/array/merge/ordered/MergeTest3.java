package com.cpucode.array.merge.ordered;

import java.util.Arrays;

/**
 * @author : cpucode
 * @date : 2021/6/4
 * @time : 17:39
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class MergeTest3 {
    public static void main(String[] args) {

    }

    public void merge(int A[], int m, int B[], int n) {
        System.arraycopy(B, 0, A, m, n);

        Arrays.sort(A);
    }
}
