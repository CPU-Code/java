package com.cpucode.tree.path.sum;

import java.util.ArrayList;

/**
 * 二叉树根节点到叶子节点和为指定值的路径
 *
 * 描述
 * 给定一个二叉树和一个值\ sum sum，请找出所有的根节点到叶子节点的节点值之和等于\ sum sum 的路径，
 * 例如：
 * 给出如下的二叉树，\ sum=22 sum=22，
 *
 * 返回
 * [
 * [5,4,11,2],
 * [5,8,9]
 * ]
 * 示例1
 * 输入： {1,2},1
 * 返回值： []
 *
 * 示例2
 * 输入： {1,2},3
 * 返回值：[[1,2]]
 *
 * @author : cpucode
 * @date : 2021/6/15
 * @time : 19:19
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class PathSumTest {
    public static void main(String[] args) {
        TreeNode l1 = new TreeNode(1);
        TreeNode l2 = new TreeNode(2);
        TreeNode l3 = new TreeNode(3);

        l1.left = l2;
        l1.right = l3;

        PathSumTest mirrorTest = new PathSumTest();
        ArrayList<ArrayList<Integer>> arrayLists = mirrorTest.pathSum(l1, 3);

        for (ArrayList<Integer> arrayList : arrayLists) {
            for (Integer integer : arrayList) {
                System.out.print(integer + " ");
            }

            System.out.println();
        }
    }

    /**
     * /用于存储结果
     */
    static ArrayList<ArrayList<Integer>> res = new ArrayList<>();
    /**
     * 用于存储路径
     */
    static ArrayList<Integer> temp =  new ArrayList<>();

    /**
     *
     * @param root TreeNode类
     * @param sum int整型
     * @return int整型ArrayList<ArrayList<>>
     */
    public ArrayList<ArrayList<Integer>> pathSum (TreeNode root, int sum) {
        int tempSum = 0;

        dfs(root, tempSum, sum);

        return res;
    }

    public static void dfs(TreeNode root, int tempSum, int sum){
        if (root == null){
            // 如果节点为空结束当前递归
            return;
        }

        //将当前节点加入tmp数组
        temp.add(root.val);
        //把当前节点加入到路径和中
        tempSum += root.val;

        //当递归到没有子树的时候就需要判断
        if (root.left == null && root.right == null){
            if (tempSum == sum){
                //如果当前节点的路径和等于sum，那么就在res中插入tmp
                res.add(new ArrayList<Integer>(temp));
            }
        }else {
            //递归左子树
            dfs(root.left, tempSum, sum);
            //递归右子树
            dfs(root.right, tempSum, sum);
        }

        temp.remove(temp.size() - 1);
    }
}
