package com.cpucode.linked.list.merge.two.lists;

/**
 * 合并有序链表
 *
 *  描述
 * 将两个有序的链表合并为一个新链表，要求新的链表是通过拼接两个链表的节点来生成的，且合并后新链表依然有序。
 *
 * 示例1
 * 输入：
 *   {1},{2}
 * 返回值：
 *     {1,2}
 * 示例2
 * 输入：
 *    {2},{1}
 * 返回值：
 *    {1,2}
 *
 * @author : cpucode
 * @date : 2021/6/7
 * @time : 10:12
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class MergeListsTest {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);

        MergeListsTest mergeListsTest = new MergeListsTest();
        ListNode listNode = mergeListsTest.mergeTwoLists(l1, l2);

        while (listNode != null){
            System.out.print(listNode.val + " ");
            listNode = listNode.next;
        }
    }

    /**
     * @param l1 ListNode类
     * @param l2 ListNode类
     * @return ListNode类
     */
    public ListNode mergeTwoLists (ListNode l1, ListNode l2) {
        // 下面是空判断
        if (l1 == null){
            return l2;
        }
        if (l2 == null){
            return l1;
        }

        ListNode node = new ListNode();
        ListNode temp = node;

        while (l1 != null && l2 != null){
            //比较一下，哪个小就把哪个放到新的链表中
            if (l1.val <l2.val){
                temp.next = l1;
                l1 = l1.next;
            }else {
                temp.next = l2;
                l2 = l2.next;
            }

            temp = temp.next;
        }

        //然后把那个不为空的链表挂到新的链表中
        temp.next = ( l1 == null ? l2 : l1 );

        return node.next;
    }
}
