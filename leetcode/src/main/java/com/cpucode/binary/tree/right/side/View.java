package com.cpucode.binary.tree.right.side;

import java.util.*;

/**
 * 199. 二叉树的右视图
 * 题目描述
 *  给定一棵二叉树，想象自己站在它的右侧，按照从顶部到底部的顺序，返回从右侧所能看到的节点值。
 *
 * 示例:
 * 输入: [1,2,3,null,5,null,4]
 * 输出: [1, 3, 4]
 *
 * 解释:
 *    1            <---
 *  /   \
 * 2     3         <---
 *  \     \
 *   5     4       <---
 *
 * @author : cpucode
 * @date : 2021/5/16
 * @time : 23:38
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class View {
    public static void main(String[] args) {
        View view = new View();

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
        List<Integer> integers = view.rightSideView(treeNode);

        System.out.println(integers);
    }

    public List<Integer> rightSideView(TreeNode root) {
        if(root == null){
            return Collections.emptyList();
        }

        Deque<TreeNode> q = new ArrayDeque<>();
        q.offer(root);
        List<Integer> res = new ArrayList<>();

        while (!q.isEmpty()){
            int size = q.size();

            res.add(q.peek().val);

            while (size-- > 0){
                TreeNode node = q.poll();

                if (node.right != null){
                    q.offer(node.right);
                }

                if (node.left != null){
                    q.offer(node.left);
                }
            }
        }

        return res;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}