package com.cpucode.tree.has.path.sum;

/**
 *  二叉树中是否存在节点和为指定值的路径
 *
 *  描述
 * 给定一个二叉树和一个值 sum，判断是否有从根节点到叶子节点的节点值之和等于 sum 的路径，
 * 例如：
 * 给出如下的二叉树，sum=22 ,
 *
 * 返回true，因为存在一条路径 5 -> 4 -> 11 -> 的节点值之和为 22
 * 示例1
 * 输入： {1,2},0
 * 返回值： false
 *
 * 示例2
 * 输入： {1,2},3
 * 返回值： true
 *
 * @author : cpucode
 * @date : 2021/6/11
 * @time : 13:12
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class hasPathSumTest {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        treeNode.right = treeNode2;

        hasPathSumTest hasPathSumTest = new hasPathSumTest();
        boolean b = hasPathSumTest.hasPathSum(treeNode, 3);

        System.out.println(b);
    }

    /**
     * @param root TreeNode类
     * @param sum int整型
     * @return bool布尔型
     */
    public boolean hasPathSum (TreeNode root, int sum) {
        if (root == null){
            return false;
        }

        int count = 0;

        return hasPathSum(root, sum, count);
    }

    public boolean hasPathSum (TreeNode root, int sum, int count) {
        if (root == null){
            return false;
        }
        count += root.val;

        if (count == sum && root.left == null && root.right == null){
            return true;
        }

        return hasPathSum(root.left, sum, count) || hasPathSum(root.right, sum, count);
    }
}
