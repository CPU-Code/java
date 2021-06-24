package com.cpucode.tree.zigzag.level.order;

import com.cpucode.tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author : cpucode
 * @date : 2021/6/24
 * @time : 11:28
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class ZigzagOrderTest {
    public static void main(String[] args) {
        TreeNode l1 = new TreeNode(1);
        TreeNode l2 = new TreeNode(2);

        l1.setRight(l2);

        ZigzagOrderTest zigzagOrderTest = new ZigzagOrderTest();
        ArrayList<ArrayList<Integer>> arrayLists = zigzagOrderTest.zigzagLevelOrder(l1);

        for (ArrayList<Integer> arrayList : arrayLists) {
            System.out.println(arrayList);
        }
    }

    /**
     *
     * @param root TreeNode类
     * @return int整型ArrayList<ArrayList<>>
     */
    public ArrayList<ArrayList<Integer>> zigzagLevelOrder (TreeNode root) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        if (root == null){
            return res;
        }

        queue.add(root);

        while (!queue.isEmpty()){
            // 存储每一层节点
            ArrayList<Integer> temp = new ArrayList<>();

            // 遍历当前层的节点
            for (int i = queue.size(); i > 0; i--) {
                // 弹出队列中的节点
                TreeNode node = queue.poll();

                // res.size()+1：当前的层数，从1开始
                if ((res.size() + 1) % 2 == 0){
                    // 偶数层 -> 头插
                    temp.add(0, node.val);
                }else {
                    // 奇数层 -> 尾插
                    temp.add(node.val);
                }

                if (node.left != null){
                    // 如果左子节点不为空，则将其加入到队列中
                    queue.add(node.left);
                }
                if (node.right != null){
                    // 如果右子节点不为空，则将其加入到队列中
                    queue.add(node.right);
                }
            }

            res.add(temp);
        }

        // 将这一层的节点加入到res中
        return res;
    }
}
