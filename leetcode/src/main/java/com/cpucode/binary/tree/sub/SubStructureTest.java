package com.cpucode.binary.tree.sub;

/**
 * 面试题 26. 树的子结构
 * 题目描述
 * 输入两棵二叉树 A 和 B，判断 B 是不是 A W 的子结构。(约定空树不是任意一个树的子结构)
 *
 * B 是 A 的子结构， 即 A 中有出现和 B 相同的结构和节点值。
 *
 * 例如:
 * 给定的树 A:
 *
 *      3
 *     / \
 *    4   5
 *   / \
 *  1   2
 *
 * 给定的树 B：
 *
 *    4
 *   /
 *  1
 *
 * 返回 true，因为 B 与 A 的一个子树拥有相同的结构和节点值。
 *
 * 示例 1：
 *  输入：A = [1,2,3], B = [3,1]
 *  输出：false
 *
 * 示例 2：
 *  输入：A = [3,4,5,1,2], B = [4,1]
 *  输出：true
 *
 * 限制：
 *  0 <= 节点个数 <= 10000
 *
 * @author : cpucode
 * @date : 2021/5/14
 * @time : 14:59
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class SubStructureTest {
    public static void main(String[] args) {
        SubStructureTest subStructure = new SubStructureTest();

        TreeNode A = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode5 = new TreeNode(5);

        A.left = treeNode2;
        A.right = treeNode3;
        treeNode2.left = treeNode4;
        treeNode4.left = treeNode5;

        TreeNode B = new TreeNode(1);
        TreeNode treeNode6 = new TreeNode(4);

        B.left = treeNode2;
        treeNode2.left = treeNode6;

        boolean subStructure1 = subStructure.isSubStructure(A, B);

        System.out.println(subStructure1);
    }

    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if (B == null || A == null){
            return false;
        }

        if (A.val != B.val){
            return isSubStructure(A.left, B) || isSubStructure(A.right, B);
        }

        return sub(A, B) || isSubStructure(A.left, B) || isSubStructure(A.right, B);
    }

    private boolean sub(TreeNode A, TreeNode B) {
        // 判断从当前A节点开始，是否包含B
        if (B == null){
            return true;
        }

        if (A == null){
            return false;
        }

        return A.val == B.val && sub(A.left, B.left) && sub(A.right, B.right);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}