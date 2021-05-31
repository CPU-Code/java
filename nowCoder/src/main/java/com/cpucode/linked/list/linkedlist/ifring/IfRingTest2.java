package com.cpucode.linked.list.linkedlist.ifring;

import java.util.HashSet;
import java.util.Set;

/**
 * 描述
 * 判断给定的链表中是否有环。如果有环则返回true，否则返回false。
 * 你能给出空间复杂度的解法么？
 *
 * 存放到集合中
 * 这题还可以把节点存放到集合set中，每次存放的时候判断当前节点是否存在，
 * 如果存在，说明有环，直接返回true，比较容易理解
 *
 * @author : cpucode
 * @date : 2021/5/31
 * @time : 17:58
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class IfRingTest2 {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        node1.next = node2;

        ListNode node3 = new ListNode(3);
        node2.next = node3;
        //node3.next = node1;

        boolean flag = hasCycle(node1);

        System.out.println(flag);
    }

    public static boolean hasCycle(ListNode head){
        Set<ListNode> set = new HashSet<>();

        while (head != null){
            if (set.contains(head)){
                //如果重复出现说明有环
                return true;
            }

            //否则就把当前节点加入到集合中
            set.add(head);
            head = head.next;
        }

        return false;
    }
}
