package com.cpucode.array.max.mul;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.Arrays;

/**
 * @author : cpucode
 * @date : 2021/6/11
 * @time : 13:56
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class MaxMulTest {
    public static void main(String[] args) {
        int[] A = {3472,7789,7955,-7098,-9281,6101,5051,7778,3090,7423,-7151,5652,1595,-8094,677,-8324,8347,-2482,9313,-9338,-3157,8559,6945,3618,3087,121,-8468,3225,1356,6939,2799,-7231,-6309,-5453,633,-8689,-4776,2714,-2743,-1409,5918,-3333,1803,8330,-2206,-6117,-4486,-7903,-4375,-3739,2897,8056,-5864,-522,7451,-4541,-2813,5790,-532,-6517,925};

        MaxMulTest maxMulTest = new MaxMulTest();
        long solve = maxMulTest.solve(A);

        System.out.println(solve);
    }

    /**
     * 最大乘积
     * @param A int整型一维数组
     * @return long长整型
     */
    public long solve (int[] A) {
        // write code here
        Arrays.sort(A);

        int length = A.length;
        long max1 = (long)A[length - 3] * A[length - 2] * A[length - 1];
        long max2 = (long)A[0] * A[1] * A[length - 1];

        return Math.max(max1, max2);
    }
}
