package com.cpucode.recursion.max.depth;

/**
 * @author : cpucode
 * @date : 2021/6/9
 * @time : 15:18
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class TreeNode {
    int val = 0;

    TreeNode left = null;
    TreeNode right = null;

    TreeNode(){}

    TreeNode(int val){
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }
}
