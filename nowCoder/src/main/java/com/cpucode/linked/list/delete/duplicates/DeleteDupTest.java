package com.cpucode.linked.list.delete.duplicates;

/**
 * @author : cpucode
 * @date : 2021/6/17
 * @time : 14:17
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class DeleteDupTest {
    public static void main(String[] args) {
        ListNode pHead1 = new ListNode(1);
        ListNode pHead2 = new ListNode(2);
        ListNode pHead3 = new ListNode(2);
        pHead1.next = pHead2;
        pHead2.next = pHead3;

        DeleteDupTest deleteDupTest = new DeleteDupTest();
        ListNode listNode = deleteDupTest.deleteDuplicates(pHead1);

        while ( listNode != null){
            System.out.print(listNode.val + " ");
            listNode = listNode.next;
        }
    }

    /**
     * @param head ListNode类
     * @return ListNode类
     */
    public ListNode deleteDuplicates (ListNode head) {
        //设置伪结点，方便处理
        ListNode res = new ListNode(0);
        res.next = head;

        ListNode prev = res;
        ListNode curr = head;

        while (curr != null && curr.next != null){
            if (curr.val == curr.next.val){
                ListNode temp = curr.next;
                // 遇到当前节点值和下一节点值相等的节点时，
                // 进行while循环找到下一个不相等的节点，挂到prev节点上
                while (temp != null && temp.val == curr.val){
                    temp = temp.next;
                }

                prev.next = temp;
                curr = temp;
            }else {
                // 当前节点值和下一节点值不相等的节点时，prev和curr都移动到下一个节点
                prev = prev.next;
                curr = curr.next;
            }
        }

        return res.next;
    }
}
