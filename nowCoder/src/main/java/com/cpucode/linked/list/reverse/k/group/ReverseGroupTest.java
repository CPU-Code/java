package com.cpucode.linked.list.reverse.k.group;

import com.cpucode.linked.list.ListNode;

import java.util.List;

/**
 * 链表中的节点每k个一组翻转
 *
 * 描述
 * 将给出的链表中的节点每 k 个一组翻转，返回翻转后的链表
 * 如果链表中的节点数不是 k 的倍数，将最后剩下的节点保持原样
 * 你不能更改节点中的值，只能更改节点本身。
 * 要求空间复杂度 O(1)
 *
 * 例如：
 * 给定的链表是 1→2→3→4→5
 * 对于 k = 2 k=2, 你应该返回 2→1→4→3→5
 * 对于 k = 3 k=3, 你应该返回 3→2→1→4→5
 *
 * 示例1
 * 输入： {1,2,3,4,5},2
 * 返回值：{2,1,4,3,5}
 *
 * @author : cpucode
 * @date : 2021/6/17
 * @time : 15:17
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class ReverseGroupTest {
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

        ReverseGroupTest reverseGroupTest = new ReverseGroupTest();
        ListNode listNode = reverseGroupTest.reverseKGroup(l1, 2);

        while (listNode != null){
            System.out.print(listNode.val + " ");

            listNode = listNode.next;
        }
    }

    /**
     * @param head ListNode类
     * @param k int整型
     * @return ListNode类
     */
    public ListNode reverseKGroup (ListNode head, int k) {
        //先创建一个哑节点
        ListNode res = new ListNode(0);
        //让哑节点的指针指向链表的头
        res.next = head;

        //开始反转的前一个节点，比如反转的节点范围是[link1，link2],
        //那么pre就是link1的前一个节点
        ListNode curr = res;
        ListNode end = res;

        while (end != null){
            //每k个反转，end是每k个链表的最后一个
            for (int i = 0; i < k && end != null; i++) {
                end = end.next;
            }

            //如果end是空，说明不够k个，就不需要反转了，直接退出循环。
            if (end == null){
                break;
            }

            //反转开始的节点
            ListNode start = curr.next;
            //next是下一次反转的头结点，先把他记录下来
            ListNode next = end.next;
            end.next = null;

            // pre是反转链表的前一个节点，我们把小链表[start,end]反转之后，
            // 让pre的指针指向这个反转的小链表
            curr.next = reserve(start);

            // 经过上一步反转之后，start反转到链表的尾部了，就是已经反转之后的尾结点了，
            // 让他之前下一次反转的头结点即可（上面分析过，next就是下一次反转的头结点
            start.next = next;

            //前面反转完了，要进入下一波了，pre和end都有重新赋值
            curr = start;
            end = start;
        }

        return res.next;
    }

    /**
     * 链表的反转
     * @param root
     * @return
     */
    public static ListNode reserve(ListNode root){
        ListNode res = null;
        ListNode node = root;

        while (node != null){
            ListNode temp = node.next;
            node.next = res;
            res = node;

            node = temp;
        }

        return res;
    }
}
