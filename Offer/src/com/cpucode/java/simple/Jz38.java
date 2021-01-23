package com.cpucode.java.simple;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 题目描述
 * 输入一棵二叉树，求该树的深度。从根结点到叶结点依次经过的结点（含根、叶结点）形成树的一条路径，最长路径的长度为树的深度。
 * 示例1
 * 输入
 * {1,2,3,4,5,#,6,#,#,7}
 * 返回值
 * 4
 *
 * @author : cpucode
 * @Date : 2021/1/23
 * @Time : 11:52
 * @Github : https://github.com/CPU-Code
 * @CSDN : https://blog.csdn.net/qq_44226094
 */
public class Jz38 {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }
    }

    public int TreeDepth(TreeNode root) {
        if(root == null){
            return 0;
        }

        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);

        //深度
        int depth = 0;
        //当前遍历的数
        int count = 0;
        //当层遍历的总数
        int nextcount = q.size();

        while(q.size() > 0){
            TreeNode node = q.poll();

            if(node.left != null){
                q.add(node.left);
            }
            if(node.right != null){
                q.add(node.right);
            }

            count++;

            if(count == nextcount){
                depth++;
                count = 0;
                nextcount = q.size();
            }
        }

        return depth;
    }
}

