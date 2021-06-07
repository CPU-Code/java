package com.cpucode.linked.list.sort.in.list;

/**
 * 单链表的排序
 *
 *  描述
 *  给定一个无序单链表，实现单链表的排序(按升序排序)。
 *
 * 示例1
 * 输入： [1,3,2,4,5]
 * 返回值： {1,2,3,4,5}
 *
 * @author : cpucode
 * @date : 2021/6/7
 * @time : 11:12
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class SortInListTest {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(3);
        ListNode l3 = new ListNode(2);
        ListNode l4 = new ListNode(5);
        ListNode l5 = new ListNode(4);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;

        SortInListTest mergeListsTest = new SortInListTest();
        ListNode listNode = mergeListsTest.sortInList(l1);

        while (listNode != null){
            System.out.print(listNode.val + " ");
            listNode = listNode.next;
        }
    }

    /**
     * @param head ListNode类 the head node
     * @return ListNode类
     */
    public ListNode sortInList (ListNode head) {
        if (head == null || head.next == null){
            return head;
        }

        ListNode one = head;
        ListNode two = head.next;

        while (two != null && two.next != null){
            one = one.next;
            two = two.next.next;
        }

        ListNode right = one.next;
        one.next = null;

        ListNode l1 = sortInList(head);
        ListNode l2 = sortInList(right);

        ListNode node = new ListNode(0);
        ListNode temp = node;

        while (l1 != null && l2 != null){
            if (l1.val < l2.val){
                temp.next = l1;
                l1 = l1.next;
            }else {
                temp.next = l2;
                l2 = l2.next;
            }

            temp = temp.next;
        }

        temp.next = (l1 == null ? l2 : l1);

        return node.next;
    }
}
