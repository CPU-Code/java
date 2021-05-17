package com.cpucode.binary.tree.minimum.depth;

/**
 * 111. 二叉树的最小深度
 *
 * 题目描述
 * 给定一个二叉树，找出其最小深度。
 * 最小深度是从根节点到最近叶子节点的最短路径上的节点数量。
 *
 * 说明：叶子节点是指没有子节点的节点。
 *
 * 示例 1：
 * 输入：root = [3,9,20,null,null,15,7]
 * 输出：2
 *
 * 示例 2：
 * 输入：root = [2,null,3,null,4,null,5,null,6]
 * 输出：5
 *
 * 提示：
 * 树中节点数的范围在 [0, 105] 内
 * -1000 <= Node.val <= 1000
 *
 * @author : cpucode
 * @date : 2021/5/17
 * @time : 9:58
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
        int integers = tree.minDepth(treeNode);

        System.out.println(integers);
    }

    public int minDepth(TreeNode root) {
        if (root == null){
            return 0;
        }

        if (root.left == null && root.right == null){
            return 1;
        }

        int l = minDepth(root.left);
        int r = minDepth(root.right);

        if (root.left == null || root.right == null){
            return l + r + 1;
        }

        return Math.min(l, r) + 1;
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
