package com.cpucode.linked.list.reversal;

/**
 * 递归解决
 *  递归调用是要从当前节点的下一个结点开始递归。
 *  逻辑处理这块是要把当前节点挂到递归之后的链表的末尾
 *
 *  因为递归调用之后 head.next 节点就会成为 节点的尾结点，
 *  我们可以直接让 head.next.next = head;，
 *
 * @author : cpucode
 * @date : 2021/6/3
 * @time : 16:08
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class ReversalTest3 {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);

        listNode.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = null;

        ReversalTest3 reversalTest = new ReversalTest3();
        ListNode listNode1 = reversalTest.ReverseList(listNode);

        while (listNode1 != null){
            System.out.print(listNode1.val + " ");

            listNode1 = listNode1.next;
        }
    }

    public ListNode ReverseList(ListNode head) {
        if (head.next == null || head == null){
            return head;
        }

        //从当前节点的下一个结点开始递归调用
        ListNode listNode = ReverseList(head.next);

        //listNode 是反转之后的链表，因为函数 ReverseList 表示的是对链表的反转，
        // 所以反转完之后 next 肯定是链表 listNode 的尾结点，
        // 然后我们再把当前节点 head 挂到 next.next 节点的后面就 完成了链表的反转。
        head.next.next = head;

        //这里head相当于变成了尾结点，尾结点都是为空的，否则会构成环
        head.next = null;

        return listNode;
    }
}
