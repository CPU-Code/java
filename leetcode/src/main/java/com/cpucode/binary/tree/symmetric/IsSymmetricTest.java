package com.cpucode.binary.tree.symmetric;

/**
 * 101. 对称二叉树
 *
 * 题目描述
 * 给定一个二叉树，检查它是否是镜像对称的。
 *
 * 例如，二叉树 [1,2,2,3,4,4,3] 是对称的。
 *
 *     1
 *    / \
 *   2   2
 *  / \ / \
 * 3  4 4  3
 *
 * 但是下面这个 [1,2,2,null,3,null,3] 则不是镜像对称的:
 *
 *     1
 *    / \
 *   2   2
 *    \   \
 *    3    3
 *
 * 进阶：
 * 你可以运用递归和迭代两种方法解决这个问题吗？
 *
 * @author : cpucode
 * @date : 2021/5/14
 * @time : 14:28
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class IsSymmetricTest {
    public static void main(String[] args) {
        IsSymmetricTest isSymmetricTest = new IsSymmetricTest();

        TreeNode treeNode = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(2);

        treeNode.left = treeNode2;
        treeNode.right = treeNode3;

        boolean symmetric = isSymmetricTest.isSymmetric(treeNode);
        System.out.println(symmetric);
    }

    public boolean isSymmetric(TreeNode root){
        if (root == null){
            return true;
        }

        return isSymmetric(root.left, root.right);
    }

    private boolean isSymmetric(TreeNode left, TreeNode right) {
        if (left == null && right == null){
            return true;
        }

        if (left == null || right == null || left.val != right.val){
            return false;
        }

        return (isSymmetric(left.left, left.right) && isSymmetric(left.right, left.left));
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}