package com.cpucode.dfs.island.num;

/**
 * 岛屿数量
 *
 * 描述
 * 给一个01矩阵，1代表是陆地，0代表海洋， 如果两个1相邻，那么这两个1属于同一个岛。我们只考虑上下左右为相邻。
 * 岛屿: 相邻陆地可以组成一个岛屿（相邻:上下左右） 判断岛屿个数。
 *
 * 示例1
 * 输入：[[1,1,0,0,0],[0,1,0,1,1],[0,0,0,1,1],[0,0,0,0,0],[0,0,1,1,1]]
 * 返回值：3
 * 备注： 01矩阵范围<=200*200
 *
 * @author : cpucode
 * @date : 2021/6/21
 * @time : 11:29
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class IslandNumTest {
    public static void main(String[] args) {
        char[][] grid = {{1,1,0,0,0}, {0,1,0,1,1}, {0,0,0,1,1},
                {0,0,0,0,0},
                {0,0,1,1,1}};
        
        IslandNumTest islandNumTest = new IslandNumTest();
        int solve = islandNumTest.solve(grid);

        System.out.println(solve);
    }

    /**
     * 判断岛屿数量
     * @param grid char字符型二维数组
     * @return int整型
     */
    public int solve (char[][] grid) {
        if (grid.length == 0){
            return 0;
        }

        int res = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                // 只有当前格子是1才开始计算
                if (grid[i][j] == 1){

                    //岛屿的数量加1
                    res++;

                    dfs(grid, i, j);
                }
            }
        }

        return res;
    }

    public static void dfs(char[][] grid, int i, int j){
        // 边界条件判断，不能越界
        if (i < 0 || i >= grid.length ||
            j < 0 || j >= grid[0].length ||
            grid[i][j] == 0){
            return;
        }

        //把当前格子置为0
        grid[i][j] = 0;

        // 从他的上下左右4个方向继续遍历
        dfs(grid, i + 1, j);
        dfs(grid, i - 1, j);
        dfs(grid, i, j + 1);
        dfs(grid, i, j - 1);
    }
}
