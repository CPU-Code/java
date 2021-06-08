package com.cpucode.linked.list.linked.is.pail;

/**
 * 判断一个链表是否为回文结构
 *
 * 描述
 * 给定一个链表，请判断该链表是否为回文结构。
 * 示例1
 * 输入： [1,2,2,1]
 *
 * 返回值： true
 * 备注： 1 <= n <= 10^6
 *
 * @author : cpucode
 * @date : 2021/6/8
 * @time : 11:21
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class IsPailTest {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(2);
        ListNode l5 = new ListNode(1);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;

        IsPailTest isPailTest = new IsPailTest();

        System.out.println(isPailTest.isPail(l1));
    }

    /**
     * @param head ListNode类 the head
     * @return bool布尔型
     */
    public boolean isPail (ListNode head) {
        if (head == null || head.next == null){
            return false;
        }

        ListNode one = head;
        ListNode two = head;

        // 通过快慢指针找到中点
        while (two != null && two.next != null){
            one = one.next;
            two = two.next.next;
        }

        //反转后半部分链表
        ListNode node = reverse(one);
        one = head;

        while (node != null && one != null){
            //然后比较，判断节点值是否相等
            if (node.val != one.val){
                return false;
            }

            node = node.next;
            one = one.next;
        }

        return true;
    }

    /**
     * 反转链表
     * @param one
     * @return
     */
    private static ListNode reverse(ListNode one){
        ListNode node = null;
        ListNode temp = null;

        while (one != null){
            temp = one.next;
            one.next = node;
            node = one;
            one = temp;
        }

        return node;
    }

}
