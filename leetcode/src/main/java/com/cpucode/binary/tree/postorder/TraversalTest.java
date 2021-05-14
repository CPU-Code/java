package com.cpucode.binary.tree.postorder;

import java.util.ArrayList;
import java.util.List;

/**
 * 145. 二叉树的后序遍历
 * English Version
 *
 * 题目描述
 * 给定一个二叉树，返回它的 后序 遍历。
 *
 * 示例:
 *
 * 输入: [1,null,2,3]
 *    1
 *     \
 *      2
 *     /
 *    3
 *
 * 输出: [3,2,1]
 * 进阶: 递归算法很简单，你可以通过迭代算法完成吗？
 *
 * 解法
 * 递归遍历或利用栈实现非递归遍历。
 *
 * 非递归的思路如下：
 *
 * 先序遍历的顺序是：头、左、右，如果我们改变左右孩子的顺序，就能将顺序变成：头、右、左。
 *
 * 我们先不打印头节点，而是存放到另一个收集栈 s2 中，最后遍历结束，输出收集栈元素，
 * 即是后序遍历：左、右、头。
 *
 * @author : cpucode
 * @date : 2021/5/14
 * @time : 13:14
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class TraversalTest {
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

    public static void main(String[] args) {
        TraversalTest TraversalTest = new TraversalTest();

        TreeNode treeNode = new TreeNode();
        TreeNode treeNode2 = new TreeNode();
        TreeNode treeNode3 = new TreeNode();

        treeNode.val = 1;
        treeNode2.val = 3;
        treeNode3.val = 2;

        treeNode.right = treeNode2;
        treeNode2.left = treeNode3;

        List<Integer> integers = TraversalTest.postorderTraversal(treeNode);

        System.out.println(integers);
    }

    public List<Integer> postorderTraversal(TreeNode root){
        res = new ArrayList<>();
        postorder(root);

        return res;
    }

    private void postorder(TreeNode root){
        if (root != null){
            postorder(root.left);
            postorder(root.right);

            res.add(root.val);
        }
    }

}
