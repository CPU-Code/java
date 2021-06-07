package com.cpucode.linked.list.sort.in.list;

/**
 * @author : cpucode
 * @date : 2021/6/7
 * @time : 11:12
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(){}

    ListNode(int val){
        this.val = val;
    }


    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }
}
