package com.cpucode.linked.list.linkedlist.ifring;

/**
 * 描述
 *  判断给定的链表中是否有环。如果有环则返回true，否则返回false。
 *  你能给出空间复杂度 O(1) 的解法么？
 *
 * 快慢指针解决
 *
 * @author : cpucode
 * @date : 2021/5/31
 * @time : 17:47
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class IfRingTest {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        node1.next = node2;

        ListNode node3 = new ListNode(3);
        node2.next = node3;
        //node3.next = node1;

        boolean flag = hasCycle(node1);

        System.out.println(flag);
    }

    public static boolean hasCycle(ListNode head){
        if (head == null){
            return false;
        }

        //快慢两个指针
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null){
            //慢指针每次走一步
            slow = slow.next;
            //快指针每次走两步
            fast = fast.next.next;


            if (slow == fast){
                //相遇 就是有环
                return true;
            }
        }
        // 否则就是没环
        return false;
    }
}


/**
 * Definition for singly-linked list.
 */
class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int x) {
        val = x;
        next = null;
    }
}