package com.cpucode.binary.tree.level.order;

import java.util.*;

/**
 * 107. 二叉树的层序遍历 II
 *
 * 题目描述
 * 给定一个二叉树，返回其节点值自底向上的层序遍历。 （即按从叶子节点所在层到根节点所在的层，逐层从左向右遍历）
 *
 * 例如：
 * 给定二叉树 [3,9,20,null,null,15,7],
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 *
 * 返回其自底向上的层序遍历为：
 * [
 *   [15,7],
 *   [9,20],
 *   [3]
 * ]
 *
 * @author : cpucode
 * @date : 2021/5/16
 * @time : 23:30
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class TraversalTest2 {
    public static void main(String[] args) {
        TraversalTest2 traversalTest = new TraversalTest2();

        TreeNode treeNode = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);

        treeNode.left = treeNode2;
        treeNode.right = treeNode3;

        List<List<Integer>> treeNode1 = traversalTest.levelOrderBottom(treeNode);

        System.out.println(treeNode1);
    }

    public List<List<Integer>> levelOrderBottom(TreeNode root){
        if (root == null){
            return Collections.emptyList();
        }

        Deque<TreeNode> q = new ArrayDeque<>();
        List<List<Integer>> res = new ArrayList<>();

        q.offer(root);
        while (!q.isEmpty()){
            int size = q.size();

            List<Integer> t = new ArrayList<>();
            while (size-- > 0){
                TreeNode node = q.poll();
                t.add(node.val);

                if (node.left != null){
                    q.offer(node.left);
                }

                if (node.right != null){
                    q.offer(node.right);
                }
            }
            //每次插在第一个
            res.add(0, t);
        }

        return res;
    }
}
