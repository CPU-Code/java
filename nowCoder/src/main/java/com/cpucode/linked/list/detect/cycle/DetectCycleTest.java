package com.cpucode.linked.list.detect.cycle;

import java.util.HashSet;

/**
 * 链表中环的入口节点
 *
 *  描述
 * 对于一个给定的链表，返回环的入口节点，如果没有环，返回null
 * 拓展：
 * 你能给出不利用额外空间的解法么？
 *
 * @author : cpucode
 * @date : 2021/6/15
 * @time : 22:27
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class DetectCycleTest {
    public static void main(String[] args) {
        ListNode pHead1 = new ListNode(9);
        ListNode pHead2 = new ListNode(3);
        ListNode pHead3 = new ListNode(7);
        pHead1.next = pHead2;
        pHead2.next = pHead3;
        pHead3.next = pHead1;

        DetectCycleTest detectCycleTest = new DetectCycleTest();
        ListNode listNode = detectCycleTest.detectCycle(pHead1);

        System.out.println(listNode.val);
    }

    public ListNode detectCycle(ListNode head) {
        HashSet<ListNode> set = new HashSet<>();

        while (head != null){
            if (set.contains(head)){
                return head;
            }
            set.add(head);
            head = head.next;
        }

        return null;
    }
}
