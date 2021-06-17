package com.cpucode.linked.list.remove.nth.from.end;

import com.cpucode.linked.list.ListNode;

/**
 * @author : cpucode
 * @date : 2021/6/17
 * @time : 14:36
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class RemoveEndTest {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        ListNode listNode2 = new ListNode(2);

        listNode.next = listNode2;

        RemoveEndTest removeEndTest = new RemoveEndTest();
        ListNode listNode1 = removeEndTest.removeNthFromEnd(listNode, 2);

        while (listNode1 != null){
            System.out.print(listNode1.val + " ");
            listNode1 = listNode1.next;
        }
    }

    /**
     *
     * @param head ListNode类
     * @param n int整型
     * @return ListNode类
     */
    public ListNode removeNthFromEnd (ListNode head, int n) {
        ListNode fast = head;
        ListNode slow = head;

        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        if (fast == null){
            return head.next;
        }

        while (fast != null){
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        return head;
    }
}
