package com.cpucode.array.min.path.sum;

import java.util.Arrays;

/**
 * 矩阵的最小路径和
 *
 * 描述
 * 给定一个 n * m 的矩阵 a，从左上角开始每次只能向右或者向下走，最后到达右下角的位置，
 * 路径上所有的数字累加起来就是路径和，输出所有的路径中最小的路径和。
 *
 * 示例1
 * 输入：[[1,3,5,9],[8,1,3,4],[5,0,6,1],[8,8,4,0]]
 * 返回值：12
 *
 * 备注：
 * 1≤n, m≤2000
 * 1≤arr ≤100
 *
 * @author : cpucode
 * @date : 2021/6/21
 * @time : 10:38
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class MinPathSumTest {
    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,9},
                {8,1,3,4},
                {5,0,6,1},
                {8,8,4,0}};

        MinPathSumTest minPathSumTest = new MinPathSumTest();
        int i = minPathSumTest.minPathSum(matrix);

        System.out.println(i);
    }

    /**
     * @param matrix int整型二维数组 the matrix
     * @return int整型
     */
    public int minPathSum (int[][] matrix) {
        if (matrix == null){
            return 0;
        }

        int rowLen = matrix.length;
        int colLen = matrix[0].length;

        int [] res = new int[colLen + 1];

        // 所有赋值最大
        Arrays.fill(res, Integer.MAX_VALUE);

        res[0] = 0;

        for (int i = 1; i <= rowLen; i++) {
            for (int j = 1; j <= colLen; j++) {
                // res[j] 为 上行 的 j位值
                // res[j - 1] 为该行 左 的 j - 1 位 值
                res[j] = Math.min(res[j] , res[j - 1]) + matrix[i - 1][j - 1];
            }
        }

        return res[colLen];
    }
}
