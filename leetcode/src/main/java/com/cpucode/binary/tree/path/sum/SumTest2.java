package com.cpucode.binary.tree.path.sum;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 113. 路径总和 II
 *
 * 题目描述
 * 给你二叉树的根节点 root 和一个整数目标和 targetSum ，找出所有
 * 从根节点到叶子节点 路径总和等于给定目标和的路径。
 *
 * 叶子节点 是指没有子节点的节点。
 *
 * 示例 1：
 * 输入：root = [5,4,8,11,null,13,4,7,2,null,null,5,1], targetSum = 22
 * 输出：[[5,4,11,2],[5,8,4,5]]
 *
 * 示例 2：
 * 输入：root = [1,2,3], targetSum = 5
 * 输出：[]
 *
 * 示例 3：
 * 输入：root = [1,2], targetSum = 0
 * 输出：[]
 *
 *
 * 提示：
 * 树中节点总数在范围 [0, 5000] 内
 * -1000 <= Node.val <= 1000
 * -1000 <= targetSum <= 1000
 *
 * 解法
 * 深度优先搜索+路径记录。
 *
 * @author : cpucode
 * @date : 2021/5/17
 * @time : 13:26
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class SumTest2 {
    private List<List<Integer>> res;
    private List<Integer> path;

    public static void main(String[] args) {
        SumTest2 tree = new SumTest2();

        TreeNode treeNode = new TreeNode();
        TreeNode treeNode2 = new TreeNode();
        TreeNode treeNode3 = new TreeNode();
        TreeNode treeNode4 = new TreeNode();

        treeNode.val = 1;
        treeNode2.val = 2;
        treeNode3.val = 3;
        treeNode4.val = 4;

        treeNode.left = treeNode2;
        treeNode2.left = treeNode4;
        treeNode.right = treeNode3;

        /**
         *      1
         *    /   \
         *   2     3
         *  /
         * 4
         */
        List<List<Integer>> integers = tree.pathSum(treeNode, 4);

        System.out.println(integers);
    }

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        if (root == null){
            return Collections.emptyList();
        }

        res = new ArrayList<>();
        path = new ArrayList<>();

        dfs(root, sum);

        return res;
    }

    private void dfs(TreeNode root, int sum) {
        if (root == null){
            return;
        }

        path.add(root.val);
        if (root.val == sum && root.left == null && root.right == null){
            res.add(new ArrayList<>(path));
        }

        dfs(root.left, sum - root.val);
        dfs(root.right, sum - root.val);

        path.remove(path.size() - 1);
    }
}
