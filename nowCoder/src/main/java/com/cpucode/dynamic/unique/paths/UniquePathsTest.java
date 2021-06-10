package com.cpucode.dynamic.unique.paths;

/**
 * 求路径
 *
 *  描述
 * 一个机器人在m×n大小的地图的左上角（起点）。
 * 机器人每次向下或向右移动。机器人要到达地图的右下角（终点）。
 * 可以有多少种不同的路径从起点走到终点？
 *
 * 备注：m和n小于等于100,并保证计算结果在int范围内
 *
 * 示例1
 * 输入： 2,1
 * 返回值：1
 *
 * 示例2
 * 输入：2,2
 * 返回值：2
 *
 * @author : cpucode
 * @date : 2021/6/10
 * @time : 8:44
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class UniquePathsTest {
    public static void main(String[] args) {
        UniquePathsTest uniquePathsTest = new UniquePathsTest();
        int i1 = uniquePathsTest.uniquePaths(2, 1);

        System.out.print(i1);
    }

    /**
     * @param m int整型
     * @param n int整型
     * @return int整型
     */
    public int uniquePaths (int m, int n) {
        if (m <= 0 || n <= 0){
            return 0;
        }

        int[][] dp = new int[m][n];

        for (int i = 0; i < m; i++) {
            dp[i][0] = 1;
        }

        for (int i = 0; i < n; i++) {
            dp[0][i] = 1;
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }

        return dp[m - 1][n - 1];
    }
}
