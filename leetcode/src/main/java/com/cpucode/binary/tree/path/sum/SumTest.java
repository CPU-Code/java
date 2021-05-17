package com.cpucode.binary.tree.path.sum;

/**
 * 112. 路径总和
 *
 * 题目描述
 * 给你二叉树的根节点 root 和一个表示目标和的整数 targetSum ，
 * 判断该树中是否存在 根节点到叶子节点 的路径，这条路径上所有节点值相加等于 目标 和 targetSum 。
 *
 * 叶子节点 是指没有子节点的节点。
 *
 * 示例 1：
 * 输入：root = [5,4,8,11,null,13,4,7,2,null,null,null,1], targetSum = 22
 * 输出：true
 *
 * 示例 2：
 * 输入：root = [1,2,3], targetSum = 5
 * 输出：false
 *
 * 示例 3：
 * 输入：root = [1,2], targetSum = 0
 * 输出：false
 *
 * 提示：
 *  树中节点的数目在范围 [0, 5000] 内
 *      -1000 <= Node.val <= 1000
 *      -1000 <= targetSum <= 1000
 * 解法
 * 递归求解，递归地询问它的子节点是否能满足条件即可。
 *
 * @author : cpucode
 * @date : 2021/5/17
 * @time : 11:07
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class SumTest {
    public static void main(String[] args) {
        SumTest tree = new SumTest();

        TreeNode treeNode = new TreeNode();
        TreeNode treeNode2 = new TreeNode();
        TreeNode treeNode3 = new TreeNode();
        TreeNode treeNode4 = new TreeNode();

        treeNode.val = 1;
        treeNode2.val = 2;
        treeNode3.val = 3;
        treeNode4.val = 4;

        treeNode.left = treeNode2;
        treeNode2.left = treeNode4;
        treeNode.right = treeNode3;

        /**
         *      1
         *    /   \
         *   2     3
         *  /
         * 4
         */
        boolean integers = tree.hasPathSum(treeNode, 4);

        System.out.println(integers);
    }

    boolean hasPathSum(TreeNode root, int sum) {
        return dfs(root, sum);
    }

    boolean dfs(TreeNode root, int sum) {
        if (root == null) {
            System.out.println(sum);

            return false;
        }
        if (root.val == sum && root.left == null && root.right == null) {
            return true;
        }

        return dfs(root.left, sum - root.val) || dfs(root.right, sum - root.val);
    }
}

class TreeNode {
    int val;

    TreeNode left;
    TreeNode right;

    TreeNode(){}

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
