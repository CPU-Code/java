package com.cpucode.tree.kth.node;

/**
 *  二叉搜索树的第k个结点
 *
 *  描述
 * 给定一棵二叉搜索树，请找出其中的第k小的TreeNode结点。
 *
 * 示例1
 * 输入：{5,3,7,2,4,6,8},3
 * 返回值：{4}
 * 说明：
 *   按结点数值大小顺序第三小结点的值为4
 *
 * @author : cpucode
 * @date : 2021/6/10
 * @time : 23:28
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class KthNodeTest {
    TreeNode res = null;
    int count = 0;

    public static void main(String[] args) {
        TreeNode l1 = new TreeNode(2);
        TreeNode l2 = new TreeNode(1);
        TreeNode l3 = new TreeNode(3);
        
        l1.left = l2;
        l1.right = l3;

        KthNodeTest kthNodeTest = new KthNodeTest();
        TreeNode res = kthNodeTest.KthNode(l1, 2);

        System.out.println(res.val);
    }

    TreeNode KthNode(TreeNode pRoot, int k){
        node(pRoot, k);
        
        return res;
    }
    
    void node(TreeNode pRoot, int k){
        if (pRoot == null){
            return;
        }
        
        node(pRoot.left, k);
        
        count++;
        
        if (count == k){
            res = pRoot;
            
            return;
        }
        
        if (k > count){
            node(pRoot.right, k);
        }else {
            return;
        }
    }
}
