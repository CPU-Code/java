package com.cpucode.recursion.max.depth;

/**
 *  二叉树的最大深度
 *
 *  描述
 * 求给定二叉树的最大深度，
 * 最大深度是指树的根结点到最远叶子结点的最长路径上结点的数量。
 *
 * 示例1
 * 输入：{1,2}
 * 返回值：2
 *
 * 示例2
 * 输入： {1,2,3,4,#,#,5}
 * 返回值：3
 *
 * @author : cpucode
 * @date : 2021/6/9
 * @time : 15:17
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class MaxDepthTest {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode root2 = new TreeNode(2);
        TreeNode root3 = new TreeNode(3);
        TreeNode root4 = new TreeNode(4);

        root.right = root2;
        root2.left = root3;
        root.left = root4;

        MaxDepthTest maxDepthTest = new MaxDepthTest();

        int res = maxDepthTest.maxDepth(root);

        System.out.println(res);
    }

    /**
     * @param root TreeNode类
     * @return int整型
     */
    public int maxDepth (TreeNode root) {
        if (root == null){
            return 0;
        }

        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}
