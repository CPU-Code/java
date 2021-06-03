package com.cpucode.linked.list.reversal;

/**
 * 这种递归往下传递的时候基本上没有逻辑处理，
 *
 * 当往回反弹的时候才开始处理，也就是从链表的尾端往前开始处理的。
 * 我们还可以再来改一下，在链表递归的时候从前往后处理，
 * 处理完之后直接返回递归的结果，这就是所谓的尾递归，这种运行效率要比上一种好很多
 *
 * @author : cpucode
 * @date : 2021/6/3
 * @time : 16:21
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class ReversalTest4 {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);

        listNode.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = null;

        ReversalTest4 reversalTest = new ReversalTest4();
        ListNode listNode1 = reversalTest.ReverseList(listNode);

        while (listNode1 != null){
            System.out.print(listNode1.val + " ");

            listNode1 = listNode1.next;
        }
    }

    public ListNode ReverseList(ListNode head) {
        ListNode listNode = ReverseList(head , null);

        return listNode;
    }

    public ListNode ReverseList(ListNode head, ListNode newHead) {
        if (head == null){
            return newHead;
        }

        ListNode temp = head.next;
        head.next = newHead;

        return ReverseList(temp , head);
    }
}
