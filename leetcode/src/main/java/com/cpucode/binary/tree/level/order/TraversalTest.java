package com.cpucode.binary.tree.level.order;

import java.util.*;

/**
 * 102. 二叉树的层序遍历
 *
 * 题目描述
 * 给你一个二叉树，请你返回其按 层序遍历 得到的节点值。 （即逐层地，从左到右访问所有节点）。
 *
 * 示例：
 * 二叉树：[3,9,20,null,null,15,7],
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回其层序遍历结果：
 *
 * [
 *   [3],
 *   [9,20],
 *   [15,7]
 * ]
 *
 * @author : cpucode
 * @date : 2021/5/16
 * @time : 22:23
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class TraversalTest {
    public static void main(String[] args) {
        TraversalTest traversalTest = new TraversalTest();

        TreeNode treeNode = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);

        treeNode.left = treeNode2;
        treeNode.right = treeNode3;

        List<List<Integer>> treeNode1 = traversalTest.levelOrder(treeNode);

        System.out.println(treeNode1);
    }

    public List<List<Integer>> levelOrder(TreeNode root){
        //判断是否为空
        if (root == null){
            return Collections.emptyList();
        }

        //创建双端队列
        Deque<TreeNode> q = new ArrayDeque<>();

        //添加节点
        q.offer(root);

        //创建二维链表
        List<List<Integer>> res = new ArrayList<>();

        //判断队列是否为空
        while (!q.isEmpty()){
            //队列大小, 下面循环遍历全部
            int size = q.size();

            List<Integer> t = new ArrayList<>();

            while (size -- > 0){
                //出队列
                TreeNode node = q.poll();
                t.add(node.val);

                if (node.left != null){
                    //左入队列
                    q.offer(node.left);
                }

                if (node.right != null){
                    //右入队列
                    q.offer(node.right);
                }
            }
            res.add(t);
        }

        return res;
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
