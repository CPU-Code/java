package com.cpucode.java.simple;

/**
 * 题目描述
 * 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
 * 示例1
 * 输入
 * {1,3,5},{2,4,6}
 * 返回值
 * {1,2,3,4,5,6}
 *
 * @author : cpucode
 * @Date : 2021/1/20
 * @Time : 13:23
 * @Github : https://github.com/CPU-Code
 * @CSDN : https://blog.csdn.net/qq_44226094
 */
public class Jz16 {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public class Solution {
        public ListNode Merge(ListNode list1,ListNode list2){
            //记录第一位位置
            ListNode h = new ListNode(-1);

            ListNode cur = h;

            while(list1 != null && list2 != null){
                if(list1.val <= list2.val){
                    //把值给cur下一位
                    cur.next = list1;
                    //下移
                    list1 = list1.next;
                }else{
                    cur.next = list2;
                    list2 = list2.next;
                }

                //下移
                cur = cur.next;
            }

            if(list1 != null){
                cur.next = list1;
            }

            if(list2 != null){
                cur.next = list2;
            }

            return h.next;
        }
    }
}
