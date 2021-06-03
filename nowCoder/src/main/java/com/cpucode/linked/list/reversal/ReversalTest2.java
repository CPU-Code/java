package com.cpucode.linked.list.reversal;

/**
 *  双链表求解
 * 双链表求解是把原链表的结点一个个摘掉，每次摘掉的链表都让他成为新的链表的头结点，然后更新新链表。
 *
 * @author : cpucode
 * @date : 2021/6/3
 * @time : 15:41
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class ReversalTest2 {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);

        listNode.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = null;

        ReversalTest2 reversalTest = new ReversalTest2();
        ListNode listNode1 = reversalTest.ReverseList(listNode);

        while (listNode1 != null){
            System.out.print(listNode1.val + " ");

            listNode1 = listNode1.next;
        }
    }

    public ListNode ReverseList(ListNode head) {
        //新链表
        ListNode node = null;
        //临时
        ListNode temp = null;

        while (head != null){
            //先保存访问的节点的下一个节点，保存起来
            //留着下一步访问的
            temp = head.next;

            //每次访问的原链表节点都会成为新链表的头结点，
            //其实就是把新链表挂到访问的原链表节点的
            head.next = node;

            //更新新链表
            node = head;

            //重新赋值，继续访问
            head = temp;
        }

        //返回新链表
        return node;
    }
}
