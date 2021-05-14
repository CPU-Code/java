package com.cpucode.binary.tree.inorder;

import java.util.ArrayList;
import java.util.List;

/**
 * 94. 二叉树的中序遍历
 *
 * 题目描述
 * 给定一个二叉树的根节点 root ，返回它的 中序 遍历。
 *
 * 示例 1：
 * 输入：root = [1,null,2,3]
 * 输出：[1,3,2]
 *
 * 示例 2：
 * 输入：root = []
 * 输出：[]
 *
 * 示例 3：
 * 输入：root = [1]
 * 输出：[1]
 *
 * 示例 4：
 * 输入：root = [1,2]
 * 输出：[2,1]
 *
 * 示例 5：
 * 输入：root = [1,null,2]
 * 输出：[1,2]
 *
 *
 * 提示：
 * 树中节点数目在范围 [0, 100] 内
 * -100 <= Node.val <= 100
 *
 *
 * 进阶: 递归算法很简单，你可以通过迭代算法完成吗？
 *
 * 解法
 *  递归遍历或利用栈实现非递归遍历。
 *
 * 非递归的思路如下：
 *  定义一个栈
 *  将树的左节点依次入栈
 *  左节点为空时，弹出栈顶元素并处理
 *  重复 2-3 的操作
 *
 * @author : cpucode
 * @date : 2021/5/14
 * @time : 13:47
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class TraversalTest {
    private List<Integer> res;

    public static void main(String[] args) {
        TraversalTest TraversalTest = new TraversalTest();

        TreeNode treeNode = new TreeNode();
        TreeNode treeNode2 = new TreeNode();
        TreeNode treeNode3 = new TreeNode();

        treeNode.val = 1;
        treeNode2.val = 2;
        treeNode3.val = 3;

        treeNode.left = treeNode2;
        treeNode.right = treeNode3;

        List<Integer> integers = TraversalTest.inorderTraversal(treeNode);

        System.out.println(integers);
    }

    public List<Integer> inorderTraversal(TreeNode root){
        res = new ArrayList<>();

        inorder(root);
        return res;
    }

    private void inorder(TreeNode root) {
        if (root != null){
            inorder(root.left);

            res.add(root.val);

            inorder(root.right);
        }
    }
}

class TreeNode {
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