package com.cpucode.tree.level.order;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 求二叉树的层序遍历
 *  描述
 * 给定一个二叉树，返回该二叉树层序遍历的结果，（从左到右，一层一层地遍历）
 * 例如：
 * 给定的二叉树是{3,9,20,#,#,15,7},
 *
 * 该二叉树层序遍历的结果是
 * [
 * [3],
 * [9,20],
 * [15,7]
 * ]
 *
 * 示例1
 * 输入： {1,2}
 * 返回值：  [[1],[2]]
 *
 * 示例2
 * 输入： {1,2,3,4,#,#,5}
 * 返回值： [[1],[2,3],[4,5]]
 *
 * @author : cpucode
 * @date : 2021/6/13
 * @time : 13:40
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class LevelOrderTest {
    public static void main(String[] args) {
        TreeNode l1 = new TreeNode(2);
        TreeNode l2 = new TreeNode(1);
        TreeNode l3 = new TreeNode(3);

        l1.left = l2;
        l1.right = l3;

        LevelOrderTest levelOrderTest = new LevelOrderTest();
        ArrayList<ArrayList<Integer>> res = levelOrderTest.levelOrder(l1);

        for (ArrayList<Integer> re : res) {
            for (Integer integer : re) {
                System.out.print(integer + " ");
            }
            System.out.println();
        }
    }

    /**
     * @param root TreeNode类 
     * @return int整型ArrayList<ArrayList<>>
     */
    public ArrayList<ArrayList<Integer>> levelOrder (TreeNode root) {
        //边界条件判断
        if (root == null){
            return null;
        }

        //队列
        Queue<TreeNode> queue = new LinkedList<>();
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        //根节点入队
        queue.add(root);

        while (!queue.isEmpty()){
            //BFS打印，levelNum表示的是每层的结点数
            int size = queue.size();
            //subList存储的是每层的结点值
            ArrayList<Integer> list = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                //出队
                TreeNode node = queue.poll();
                list.add(node.val);

                //左右子节点如果不为空就加入到队列中
                if (node.left != null){
                    queue.add(node.left);
                }

                if (node.right != null){
                    queue.add(node.right);
                }
            }

            //把每层的结点值存储在res中
            res.add(list);
        }

        return res;
    }
}
