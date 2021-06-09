package com.cpucode.linked.list.find.first.common.node;

import java.util.*;

/**
 * @author : cpucode
 * @date : 2021/6/9
 * @time : 14:55
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class FindComNodeTest {
    public static void main(String[] args) {
        ListNode pHead1 = new ListNode(1);
        ListNode pHead2 = new ListNode(2);

        ListNode pHead11 = new ListNode(11);
        ListNode pHead12 = new ListNode(12);

        ListNode pHead23 = new ListNode(23);

        pHead1.next = pHead11;
        pHead11.next = pHead12;
        pHead12.next = pHead23;

        ListNode pHead21 = new ListNode(21);
        ListNode pHead22 = new ListNode(22);

        pHead2.next = pHead21;
        pHead21.next = pHead22;
        pHead22.next = pHead23;


        FindComNodeTest findComNodeTest = new FindComNodeTest();
        ListNode node = findComNodeTest.FindFirstCommonNode(pHead1, pHead2);

        System.out.println(node.val);
    }

    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        Set<Integer> set = new HashSet<>();

        while (pHead1 != null){
            set.add(pHead1.val);
            pHead1 = pHead1.next;
        }

        while (pHead2 != null){
            if (set.contains(pHead2.val)){
                return pHead2;
            }

            pHead2 = pHead2.next;
        }

        return null;
    }
}
