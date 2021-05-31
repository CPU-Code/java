package com.cpucode.linked.list.linkedlist.ifring;

/**
 * 逐个删除
 * 一个链表从头节点开始一个个删除，所谓删除就是让他的next指针指向他自己。
 * 如果没有环，从头结点一个个删除，最后肯定会删完
 *
 * @author : cpucode
 * @date : 2021/5/31
 * @time : 19:12
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class IfRingTest3 {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        node1.next = node2;

        ListNode node3 = new ListNode(3);
        node2.next = node3;
        node3.next = node1;

        boolean flag = hasCycle(node1);

        System.out.println(flag);
    }

    public static boolean hasCycle(ListNode head){
        if (head == null || head.next == null){
            // head为空，或者他的next指向为空，直接返回false
            return false;
        }

        if (head.next == head){
            //如果出现head.next = head表示有环
            return true;
        }
        ListNode node = head.next;

        //当前节点的next指向他自己，相当于把它删除了
        head.next = head;

        //然后递归，查看下一个节点
        return hasCycle(node);
    }
}
