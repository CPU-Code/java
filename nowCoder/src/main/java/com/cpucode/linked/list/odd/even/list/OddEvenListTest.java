package com.cpucode.linked.list.odd.even.list;

import com.cpucode.linked.list.ListNode;

/**
 * 链表的奇偶重排
 *
 *  描述
 * 给定一个单链表，请设定一个函数，将链表的奇数位节点和偶数位节点分别放在一起，重排后输出。
 * 注意是节点的编号而非节点的数值。
 *
 * 示例1
 * 输入：{1,2,3,4,5,6}
 * 返回值：{1,3,5,2,4,6}
 * 说明： 1->2->3->4->5->6->NULL
 *    重排后为 1->3->5->2->4->6->NULL
 *
 * 示例2
 * 输入： {1,4,6,3,7}
 * 返回值： {1,6,7,4,3}
 * 说明： 1->4->6->3->7->NULL
 *   重排后为 1->6->7->4->3->NULL
 *    奇数节点有1,6,7，偶数节点有4,3。重排后为1,6,7,4,3
 *
 * 备注： 链表长度不大于200000。每个数范围均在int内。
 *
 * @author : cpucode
 * @date : 2021/6/21
 * @time : 16:16
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class OddEvenListTest {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);

        listNode.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = null;

        OddEvenListTest oddEvenListTest = new OddEvenListTest();
        ListNode node = oddEvenListTest.oddEvenList(listNode);

        while (node != null){
            System.out.print(node.val + " ");
            node = node.next;
        }
    }

    public ListNode oddEvenList(ListNode head){
        if (head == null || head.next == null){
            return head;
        }

        ListNode odd = head;
        ListNode oddHead = head;

        ListNode even = head.next;
        ListNode evenHead = head.next;

        while (even != null && even.next != null){
            odd.next = even.next;
            odd = odd.next;

            even.next = odd.next;
            even = even.next;
        }

        odd.next = evenHead;

        return oddHead;
    }
}
