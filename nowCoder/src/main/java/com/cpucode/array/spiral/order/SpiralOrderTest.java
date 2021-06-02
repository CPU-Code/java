package com.cpucode.array.spiral.order;

import java.util.ArrayList;

/**
 * 螺旋矩阵
 *
 * 描述
 * 给定一个m x n大小的矩阵（m行，n列），按螺旋的顺序返回矩阵中的所有元素。
 * 示例1
 * 输入：
 *      [[1,2,3],[4,5,6],[7,8,9]]
 * 返回值：
 *      [1,2,3,6,9,8,7,4,5]
 *
 * @author : cpucode
 * @date : 2021/6/2
 * @time : 16:38
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class SpiralOrderTest {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        SpiralOrderTest spiralOrderTest = new SpiralOrderTest();
        ArrayList<Integer> integers = spiralOrderTest.spiralOrder(matrix);

        for (Integer integer : integers) {
            System.out.print(integer);
        }
    }

    public ArrayList<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> res = new ArrayList<>();

        if (matrix.length == 0){
            return res;
        }

        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while (top <= ((bottom + 1) >> 1) && left <= ((right + 1) >> 1)){

            for (int i = left; i <= right; i++) {
                res.add(matrix[top][i]);
            }

            for (int i = top + 1; i <= bottom; i++) {
                res.add(matrix[i][right]);
            }

            for (int i = right - 1; i >= left; i--) {
                res.add(matrix[bottom][i]);
            }

            for (int i = bottom - 1; i > top; i--) {
                res.add(matrix[i][top]);
            }

            top++;
            bottom--;
            left++;
            right--;
        }

        return res;
    }
}
