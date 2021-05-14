package com.cpucode.binary.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * 144. 二叉树的前序遍历
 *
 * 题目描述
 * 给你二叉树的根节点 root ，返回它节点值的 前序 遍历。
 *
 * 示例 1：
 *  输入：root = [1,null,2,3]
 *  输出：[1,2,3]
 *
 * 示例 2：
 *  输入：root = []
 *  输出：[]
 *
 * 示例 3：
 *  输入：root = [1]
 *  输出：[1]
 *
 * 示例 4：
 *  输入：root = [1,2]
 *  输出：[1,2]
 * 示例 5：
 *  输入：root = [1,null,2]
 *  输出：[1,2]
 *
 * 提示：
 *
 * 树中节点数目在范围 [0, 100] 内
 * -100 <= Node.val <= 100
 *
 * 进阶：递归算法很简单，你可以通过迭代算法完成吗？
 *
 * 解法
 *  递归遍历或利用栈实现非递归遍历。
 *
 * 非递归的思路如下：
 *      定义一个栈，先将根节点压入栈
 *      若栈不为空，每次从栈中弹出一个节点
 *      处理该节点
 *      先把节点右孩子压入栈，接着把节点左孩子压入栈（如果有孩子节点）
 *      重复 2-4
 *      返回结果
 *
 * @author : cpucode
 * @date : 2021/5/13
 * @time : 23:20
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class PreorderTraversalTest {
    /**
     * Definition for a binary tree node.
     */
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

    private List<Integer> res;

    public List<Integer> preorderTraversal(TreeNode root){
        res = new ArrayList();

        preorder(root);

        return res;
    }

    private void preorder(TreeNode root) {
        if (root != null){
            res.add(root.val);

            preorder(root.left);
            preorder(root.right);
        }
    }


    public static void main(String[] args) {
        PreorderTraversalTest preorderTraversalTest = new PreorderTraversalTest();

        TreeNode treeNode = new TreeNode();
        TreeNode treeNode2 = new TreeNode();
        TreeNode treeNode3 = new TreeNode();

        treeNode.val = 1;
        treeNode2.val = 3;
        treeNode3.val = 2;

        treeNode.right = treeNode2;
        treeNode2.left = treeNode3;

        List<Integer> integers = preorderTraversalTest.preorderTraversal(treeNode);

        System.out.println(integers);
    }
}



