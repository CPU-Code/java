package com.cpucode.binary.tree.preorder;

import java.util.*;

/**
 * @author : cpucode
 * @date : 2021/5/13
 * @time : 23:37
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class TraversalTest2 {
    public static void main(String[] args) {
        TraversalTest2 preorder = new TraversalTest2();

        TreeNode treeNode = new TreeNode();
        TreeNode treeNode2 = new TreeNode();
        TreeNode treeNode3 = new TreeNode();

        treeNode.val = 1;
        treeNode2.val = 2;
        treeNode3.val = 3;

        treeNode.left = treeNode2;
        treeNode.right = treeNode3;


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
