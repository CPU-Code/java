package com.cpucode.binary.tree.paths;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 257. 二叉树的所有路径
 *
 * 题目描述
 * 给定一个二叉树，返回所有从根节点到叶子节点的路径。
 *  说明: 叶子节点是指没有子节点的节点。
 *
 * 示例:
 *
 * 输入:
 *    1
 *  /   \
 * 2     3
 *  \
 *   5
 *
 * 输出: ["1->2->5", "1->3"]
 *
 * 解释: 所有根节点到叶子节点的路径为: 1->2->5, 1->3
 *
 * 解法
 * 深度优先搜索+路径记录。
 *
 * @author : cpucode
 * @date : 2021/5/17
 * @time : 10:23
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class TreeTest {
    private List<String> res;
    private List<String> path;

    public static void main(String[] args) {
        TreeTest tree = new TreeTest();

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
        treeNode2.right = treeNode5;

        /**
         *      1            <---
         *    /   \
         *   2     3         <---
         *  / \
         * 4   5          <---
         */
        List<String> str = tree.binaryTreePaths(treeNode);

        System.out.println(str);
    }

    List<String> binaryTreePaths(TreeNode root){
        if (root == null){
            return Collections.emptyList();
        }

        res = new ArrayList<>();
        path = new ArrayList<>();

        dfs(root);

        return res;
    }

    private void dfs(TreeNode root) {
        if (root == null){
            return;
        }

        path.add(String.valueOf(root.val));

        if (root.left == null && root.right == null){
            res.add(String.join("->", path));

            System.out.println("res : " + res);
        }

        dfs(root.left);
        dfs(root.right);

        path.remove(path.size() -1 );
    }

}

class TreeNode {
    int val;

    TreeNode left;
    TreeNode right;

    TreeNode(){}

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}