package com.cpucode.tree.lowest.common.ancestor;

/**
 * 在二叉树中找到两个节点的最近公共祖先
 *
 * 描述
 * 给定一棵二叉树(保证非空)以及这棵树上的两个节点对应的val值 o1 和 o2，请找到 o1 和 o2 的最近公共祖先节点。
 * 注：本题保证二叉树中每个节点的val值均不相同。
 *
 * 示例1
 * 输入： [3,5,1,6,2,0,8,#,#,7,4],5,1
 * 返回值： 3
 * @author : cpucode
 * @date : 2021/6/13
 * @time : 16:19
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class LowestTest {
    public static void main(String[] args) {
        TreeNode l1 = new TreeNode(2);
        TreeNode l2 = new TreeNode(1);
        TreeNode l3 = new TreeNode(3);

        l1.left = l2;
        l1.right = l3;

        LowestTest lowestTest = new LowestTest();

        int num = lowestTest.lowestCommonAncestor(l1, 1, 3);

        System.out.println(num);
    }

    public TreeNode lowest(TreeNode root, int o1, int o2) {
        if (root == null){
            return null;
        }

        if (root.val == o1 || root.val == o2){
            return root;
        }

        TreeNode left = lowest(root.left, o1, o2);
        TreeNode right = lowest(root.right, o1, o2);

        if (left != null && right != null){
            return root;
        }

        return left != null ? left : right;
    }

    /**
     * @param root TreeNode类
     * @param o1 int整型
     * @param o2 int整型
     * @return int整型
     */
    public int lowestCommonAncestor (TreeNode root, int o1, int o2) {
        return lowest(root, o1, o2).val;
    }
}
