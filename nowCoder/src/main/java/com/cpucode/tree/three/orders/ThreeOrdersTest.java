package com.cpucode.tree.three.orders;

import java.util.ArrayList;

/**
 * @author : cpucode
 * @date : 2021/6/14
 * @time : 10:26
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class ThreeOrdersTest {
    public static void main(String[] args) {
        TreeNode l1 = new TreeNode(1);
        TreeNode l2 = new TreeNode(2);
        TreeNode l3 = new TreeNode(3);

        l1.left = l2;
        l1.right = l3;

        ThreeOrdersTest threeOrdersTest = new ThreeOrdersTest();
        int[][] ints = threeOrdersTest.threeOrders(l1);

        for (int[] anInt : ints) {
            for (int i : anInt) {
                System.out.print(i + " ");
            }

            System.out.println();
        }

    }

    /**
     * @param root TreeNode类 the root of binary tree
     * @return int整型二维数组
     */
    public int[][] threeOrders (TreeNode root) {

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        firstOrder(root, list);
        midOrder(root, list2);
        lastOrder(root, list3);

        int[][] res = new int[3][list.size()];

        for (int i = 0; i < list.size(); i++) {
            res[0][i] = list.get(i);
            res[1][i] = list2.get(i);
            res[2][i] = list3.get(i);
        }

        return res;
    }

    public static void firstOrder(TreeNode root, ArrayList<Integer> list){
        if (root != null){
            list.add(root.val);
            firstOrder(root.left, list);
            firstOrder(root.right, list);
        }
    }

    public static void midOrder(TreeNode root, ArrayList<Integer> list){
        if (root != null){
            midOrder(root.left, list);
            list.add(root.val);
            midOrder(root.right, list);
        }
    }

    public static void lastOrder(TreeNode root, ArrayList<Integer> list){
        if (root != null){
            lastOrder(root.left, list);
            lastOrder(root.right, list);
            list.add(root.val);
        }
    }

}
