package com.cpucode.binary.tree;

import java.util.*;

/**
 * @author : cpucode
 * @date : 2021/5/13
 * @time : 23:37
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class PreorderTraversalTest2 {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {
        PreorderTraversalTest2 preorder = new PreorderTraversalTest2();

        TreeNode treeNode = new TreeNode();
        TreeNode treeNode2 = new TreeNode();
        TreeNode treeNode3 = new TreeNode();

        treeNode.val = 1;
        treeNode2.val = 3;
        treeNode3.val = 2;

        treeNode.right = treeNode2;
        treeNode2.left = treeNode3;

        List<Integer> integers = preorder.preorderTraversal(treeNode);

        System.out.println(integers);
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        if (root == null){
            return Collections.emptyList();
        }

        List<Integer> res = new ArrayList<>();
        Deque<TreeNode> s = new ArrayDeque<>();

        s.push(root);

        while (!s.isEmpty()){
            TreeNode node = s.pop();

            res.add(node.val);

            if (node.right != null){
                s.push(node.right);
            }

            if (node.left != null){
                s.push(node.left);
            }
        }

        return res;
    }
}
