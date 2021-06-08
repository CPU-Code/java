package com.cpucode.tree.mirror;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 二叉树的镜像
 *
 *  描述
 * 操作给定的二叉树，将其变换为源二叉树的镜像。
 * 比如：    源二叉树
 *             8
 *            /  \
 *           6   10
 *          / \  / \
 *         5  7 9 11
 *
 *         镜像二叉树
 *             8
 *            /  \
 *           10   6
 *          / \  / \
 *         11 9 7  5
 * 示例1
 * 输入：{8,6,10,5,7,9,11}
 * 返回值：{8,10,6,11,9,7,5}
 *
 * @author : cpucode
 * @date : 2021/6/8
 * @time : 19:35
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class MirrorTest {
    public static void main(String[] args) {
        TreeNode l1 = new TreeNode(1);
        TreeNode l2 = new TreeNode(2);
        TreeNode l3 = new TreeNode(3);

        l1.left = l2;
        l1.right = l3;

        MirrorTest mirrorTest = new MirrorTest();
        mirrorTest.treeBFS(l1);

        System.out.println();

        TreeNode node = mirrorTest.Mirror(l1);

        mirrorTest.treeBFS(node);
    }
    public void treeBFS (TreeNode pRoot) {
        if (pRoot == null){
            return ;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(pRoot);

        while (!queue.isEmpty()){
            TreeNode poll = queue.poll();

            System.out.print(poll.val + " ");

            if (poll.left != null){
                queue.offer(poll.left);
            }

            if (poll.right != null){
                queue.offer(poll.right);
            }
        }
    }

    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     * @param pRoot TreeNode类
     * @return TreeNode类
     */
    public TreeNode Mirror (TreeNode pRoot) {

        if (pRoot == null){
            return null;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(pRoot);

        while (!queue.isEmpty()){
            TreeNode poll = queue.poll();
            TreeNode temp = null;

            temp = poll.left;
            poll.left = poll.right;
            poll.right = temp;

            if (poll.right != null){
                queue.offer(poll.right);
            }

            if (poll.left != null){
                queue.offer(poll.left);
            }
        }

        return pRoot;
    }
}
