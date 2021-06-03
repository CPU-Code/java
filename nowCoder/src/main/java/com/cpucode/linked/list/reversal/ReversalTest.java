package com.cpucode.linked.list.reversal;

import java.util.Stack;

/**
 * 反转链表
 *
 * 描述
 * 输入一个链表，反转链表后，输出新链表的表头。
 * 示例1
 * 输入：
 *    {1,2,3}
 * 返回值：
 *    {3,2,1}
 *
 *  使用栈解决
 * 链表的反转是老生常谈的一个问题了，同时也是面试中常考的一道题。
 * 最简单的一种方式就是使用栈，因为栈是先进后出的。
 * 实现原理 :
 *    把链表节点一个个入栈，当全部入栈完之后再一个个出栈，出栈的时候在把出栈的结点串成一个新的链表
 *
 *
 * @author : cpucode
 * @date : 2021/6/3
 * @time : 14:56
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class ReversalTest {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);

        listNode.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = null;

        ReversalTest reversalTest = new ReversalTest();
        ListNode listNode1 = reversalTest.ReverseList(listNode);

        while (listNode1 != null){
            System.out.print(listNode1.val + " ");

            listNode1 = listNode1.next;
        }
    }

    public ListNode ReverseList(ListNode head) {
        Stack<ListNode> stack = new Stack<>();

        // 把链表节点全部摘掉放到栈中
        while (head != null){
            stack.push(head);
            head = head.next;
        }

        if (stack.isEmpty()){
            return null;
        }

        ListNode node = stack.pop();
        ListNode res = node;

        while (!stack.isEmpty()){
            // 栈中的结点全部出栈，然后重新连成一个新的链表
            node.next = stack.pop();
            node = node.next;
        }

        //最后一个结点就是反转前的头结点，一定要让他的next
        //等于空，否则会构成环
        node.next = null;

        return res;
    }
}
