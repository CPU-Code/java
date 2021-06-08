package com.cpucode.tree.is.symmetric;

/**
 * 判断二叉树是否对称
 *
 *  描述
 * 给定一棵二叉树，判断其是否是自身的镜像（即：是否对称）
 * 例如：下面这棵二叉树是对称的
 *     1
 *    /  \
 *   2    2
 *  / \    / \
 * 3  4   4  3
 * 下面这棵二叉树不对称。
 *    1
 *   / \
 *  2   2
 *  \    \
 *   3    3
 * 备注： 希望你可以用递归和迭代两种方法解决这个问题
 *
 * @author : cpucode
 * @date : 2021/6/8
 * @time : 18:47
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class IsSymmetricTest {
    public static void main(String[] args) {
        TreeNode l1 = new TreeNode(1);
        TreeNode l2 = new TreeNode(2);
        TreeNode l3 = new TreeNode(2);

        l1.left = l2;
        l1.right = l3;

        IsSymmetricTest isSymmetricTest = new IsSymmetricTest();
        boolean is = isSymmetricTest.isSymmetric(l1);

        System.out.println(is);
    }

    /**
     * @param root TreeNode类
     * @return bool布尔型
     */
    public boolean isSymmetric (TreeNode root) {
        if (root == null){
            return true;
        }

        boolean is = isSymmetric(root.left, root.right);

        return is;
    }

    public boolean isSymmetric (TreeNode left, TreeNode right) {
        if (left == null && right == null){
            return true;
        }

        if (left == null || right == null){
            return false;
        }

        return (left.val == right.val) &&
                (left.left == right.right) &&
                (left.right == right.left);
    }
}
