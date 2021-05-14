package com.cpucode.binary.tree.inorder;

import java.lang.reflect.Array;
import java.util.*;

/**
 * @author : cpucode
 * @date : 2021/5/14
 * @time : 14:04
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class TraversalTest2 {
    public static void main(String[] args) {
        TraversalTest2 TraversalTest = new TraversalTest2();

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
        if (root == null){
            return Collections.emptyList();
        }

        List<Integer> res = new ArrayList<>();
        Deque<TreeNode> s = new ArrayDeque<>();

        while (root != null || !s.isEmpty()){
            if (root != null){
                s.push(root);

                root = root.left;
            }else {
                root = s.pop();
                res.add(root.val);

                root = root.right;
            }
        }

        return res;
    }
}
