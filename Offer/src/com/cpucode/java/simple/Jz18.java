package com.cpucode.java.simple;

import java.util.*;

/**
 * 题目描述
 * 操作给定的二叉树，将其变换为源二叉树的镜像。
 * 输入描述:
 * 二叉树的镜像定义：源二叉树
 *     	    8
 *     	   /  \
 *     	  6   10
 *     	 / \  / \
 *     	5  7 9 11
 *     	镜像二叉树
 *     	    8
 *     	   /  \
 *     	  10   6
 *     	 / \  / \
 *     	11 9 7  5
 *
 * @author : cpucode
 * @Date : 2021/1/20
 * @Time : 13:28
 * @Github : https://github.com/CPU-Code
 * @CSDN : https://blog.csdn.net/qq_44226094
 */
public class Jz18 {

     public class TreeNode {
         int val = 0;
         TreeNode left = null;
         TreeNode right = null;

         public TreeNode(int val) {
         this.val = val;

         }
     }

    public class test1 {
        public void Mirror(TreeNode root) {
            // 空树
            if (root == null) {
                return;
            }
            // 左右均为空
            if (root.left == null && root.right == null) {
                return;
            }

            // 用来遍历的栈
            Stack<TreeNode> stack = new Stack<TreeNode>();

            stack.push(root);

            TreeNode curNode;
            TreeNode tempNode;

            // 深度优先
            while (!stack.isEmpty()) {
                curNode = stack.pop();
                if(curNode == null) {
                    continue;
                }
                if(curNode.left == null && curNode.right==null) {
                    continue;
                }
                // 交换
                tempNode = curNode.left;
                curNode.left = curNode.right;
                curNode.right = tempNode;

                stack.push(curNode.left);
                stack.push(curNode.right);
            }
        }
    }

    /**
     public class TreeNode {
     int val = 0;
     TreeNode left = null;
     TreeNode right = null;

     public TreeNode(int val) {
     this.val = val;

     }

     }
     */
    public class test2 {
        public void Mirror(TreeNode root) {
            // 空树
            if(root == null){
                return;
            }

            // 左右均为空
            if (root.left == null && root.right == null) {
                return;
            }

            LinkedList<TreeNode> q = new LinkedList<>();
            q.add(root);

            while(!q.isEmpty()){
                TreeNode curr = q.poll();

                TreeNode t = curr.left;
                curr.left = curr.right;
                curr.right = t;

                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null) {
                    q.add(curr.right);
                }

            }
        }
    }
}
