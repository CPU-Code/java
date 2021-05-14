package com.cpucode.binary.tree.postorder;

import java.util.*;

/**
 * @author : cpucode
 * @date : 2021/5/14
 * @time : 13:22
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class TraversalTest2 {
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
        TraversalTest2 traversalTest2 = new TraversalTest2();

        TreeNode treeNode = new TreeNode();
        TreeNode treeNode2 = new TreeNode();
        TreeNode treeNode3 = new TreeNode();

        treeNode.val = 1;
        treeNode2.val = 3;
        treeNode3.val = 2;

        treeNode.right = treeNode2;
        treeNode2.left = treeNode3;

        List<Integer> integers = traversalTest2.postorderTraversal(treeNode);

        System.out.println(integers);
    }

    public List<Integer> postorderTraversal(TreeNode root){
        if (root == null){
            return Collections.emptyList();
        }

        Deque<TreeNode> s1 = new ArrayDeque<>();
        List<Integer> s2 = new ArrayList<>();

        s1.push(root);

        while (!s1.isEmpty()){
            TreeNode node = s1.pop();
            s2.add(node.val);

            if (node.left != null){
                s1.push(node.left);
            }
            if (node.right != null){
                s1.push(node.right);
            }
        }

        Collections.reverse(s2);

        return s2;
    }

}
