package com.cpucode.binary.tree;

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
        PreorderTraversalTest.TreeNode left;
        PreorderTraversalTest.TreeNode right;

        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, PreorderTraversalTest.TreeNode left, PreorderTraversalTest.TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {

    }
}
