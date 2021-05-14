package com.cpucode.binary.tree.invert;

/**
 * 226. 翻转二叉树
 *
 * 题目描述
 * 翻转一棵二叉树。
 *
 * 示例：
 *
 * 输入：
 *      4
 *    /   \
 *   2     7
 *  / \   / \
 * 1   3 6   9
 *
 * 输出：
 *      4
 *    /   \
 *   7     2
 *  / \   / \
 * 9   6 3   1
 *
 * @author : cpucode
 * @date : 2021/5/14
 * @time : 15:47
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class InvertTreeTest {
    public static void main(String[] args) {
        InvertTreeTest invertTreeTest = new InvertTreeTest();

        TreeNode treeNode = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);

        treeNode.left = treeNode2;
        treeNode.right = treeNode3;

        TreeNode treeNode1 = invertTreeTest.invertTree(treeNode);

        System.out.println(treeNode1.val);
        System.out.println(treeNode1.left.val);
        System.out.println(treeNode1.right.val);
    }

    public TreeNode invertTree(TreeNode root){
        if (root == null){
            return null;
        }

        TreeNode left = root.left;
        root.left = root.right;
        root.right = left;

        invertTree(root.left);
        invertTree(root.right);

        return root;
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
