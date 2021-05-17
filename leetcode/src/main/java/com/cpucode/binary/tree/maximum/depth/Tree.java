package com.cpucode.binary.tree.maximum.depth;

/**
 * 104. 二叉树的最大深度
 *
 * 题目描述
 * 给定一个二叉树，找出其最大深度。
 *
 * 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
 *
 * 说明: 叶子节点是指没有子节点的节点。
 *
 * 示例：
 * 给定二叉树 [3,9,20,null,null,15,7]，
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回它的最大深度 3 。
 *
 * 解法
 * 递归遍历左右子树，求左右子树的最大深度 +1 即可。
 *
 * @author : cpucode
 * @date : 2021/5/17
 * @time : 9:49
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class Tree {
    public static void main(String[] args) {
        Tree tree = new Tree();

        TreeNode treeNode = new TreeNode();
        TreeNode treeNode2 = new TreeNode();
        TreeNode treeNode3 = new TreeNode();
        TreeNode treeNode4 = new TreeNode();
        TreeNode treeNode5 = new TreeNode();

        treeNode.val = 1;
        treeNode2.val = 2;
        treeNode3.val = 3;
        treeNode4.val = 4;
        treeNode5.val = 5;

        treeNode.left = treeNode2;
        treeNode2.left = treeNode4;

        treeNode.right = treeNode3;
        //treeNode3.right = treeNode5;

        /**
         *      1            <---
         *    /   \
         *   2     3         <---
         *  /
         * 4             <---
         */
        int integers = tree.maxDepth(treeNode);

        System.out.println(integers);
    }

    public int maxDepth(TreeNode root) {
        if (root == null){
            return 0;
        }

        int l = maxDepth(root.left);
        int r = maxDepth(root.right);

        return 1 + Math.max(l, r);
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
