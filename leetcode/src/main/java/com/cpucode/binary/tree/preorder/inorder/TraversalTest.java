package com.cpucode.binary.tree.preorder.inorder;

import java.util.HashMap;
import java.util.Map;

/**
 * 105. 从前序与中序遍历序列构造二叉树
 *
 * 题目描述
 * 根据一棵树的前序遍历与中序遍历构造二叉树。
 *
 * 注意:
 * 你可以假设树中没有重复的元素。
 *
 * 例如，给出
 * 前序遍历 preorder = [3,9,20,15,7]
 * 中序遍历 inorder = [9,3,15,20,7]
 *
 * 返回如下的二叉树：
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 *
 * 解法
 * 先遍历前序节点，对于前序的根节点，在中序节点 [i1, i2] 中找到根节点的位置 pos，
 * 就可以将中序节点分成：左子树 [i1, pos - 1]、右子树 [pos + 1, i2]。
 *
 * 通过左右子树的区间，可以计算出左、右子树节点的个数，假设为 m、n。
 * 然后在前序节点中，从根节点往后的 m 个节点为左子树，再往后的 n 个节点为右子树。
 *
 * 递归求解即可。
 *
 * 前序遍历：先遍历根节点，再遍历左右子树；
 * 中序遍历：先遍历左子树，再遍历根节点，最后遍历右子树。
 *
 * @author : cpucode
 * @date : 2021/5/17
 * @time : 19:16
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class TraversalTest {
    private Map<Integer, Integer> indexes = new HashMap<>();

    public static void main(String[] args) {
        int[] preorder = {3,9,20,15,7};
        int[] inorder = {9,3,15,20,7};

        TraversalTest traversalTest = new TraversalTest();
        TreeNode treeNode = traversalTest.buildTree(preorder, inorder);

        System.out.println(treeNode.val);
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = inorder.length;

        for (int i = 0; i < n; i++) {
            indexes.put(inorder[i], i);
        }

        return build(preorder, inorder, 0, n - 1, 0, n - 1);
    }

    private TreeNode build(int[] preorder, int[] inorder, int p1, int p2, int i1, int i2) {
        if (p1 > p2 || i1 > i2){
            return null;
        }

        int rootVal = preorder[p1];
        int pos = indexes.get(rootVal);
        TreeNode treeNode = new TreeNode(rootVal);

        // pos==i1，说明只有右子树，左子树为空
        treeNode.left = pos == i1 ? null : build(preorder, inorder, p1 + 1, pos - i1 + p1, i1, pos - 1);
        // pos==i2，说明只有左子树，右子树为空
        treeNode.right  = pos == i2 ? null : build(preorder, inorder, pos - i1 + p1 + 1, p2, pos + 1, i2);

        return treeNode;
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
