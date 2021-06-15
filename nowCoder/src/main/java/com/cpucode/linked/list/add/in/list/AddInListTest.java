package com.cpucode.linked.list.add.in.list;

/**
 * 两个链表生成相加链表
 *
 * 描述
 * 假设链表中每一个节点的值都在 0 - 9 之间，那么链表整体就可以代表一个整数。
 * 给定两个这种链表，请生成代表两个整数相加值的结果链表。
 * 例如：链表 1 为 9->3->7，链表 2 为 6->3，最后生成新的结果链表为 1->0->0->0。
 *
 * 示例1
 * 输入：[9,3,7],[6,3]
 * 返回值：{1,0,0,0}
 * 备注： 1≤n,m≤106
 *
 * @author : cpucode
 * @date : 2021/6/15
 * @time : 20:34
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class AddInListTest {
    public static void main(String[] args) {
        ListNode pHead1 = new ListNode(9);
        ListNode pHead2 = new ListNode(3);
        ListNode pHead3 = new ListNode(7);
        pHead1.next = pHead2;
        pHead2.next = pHead3;

        ListNode pHead21 = new ListNode(6);
        ListNode pHead22 = new ListNode(3);
        pHead21.next = pHead22;

        AddInListTest addInListTest = new AddInListTest();
        ListNode node = addInListTest.addInList(pHead1, pHead21);

        while (node != null){
            System.out.print(node.val + " ");

            node = node.next;
        }

    }

    /**
     * @param head1 ListNode类
     * @param head2 ListNode类
     * @return ListNode类
     */
    public ListNode addInList (ListNode head1, ListNode head2) {
        ListNode h1 = reverse(head1);
        ListNode h2 = reverse(head2);
        ListNode res = null;

        int cut = 0;

        while (h1 != null || h2 != null){
            int num1 = h1 == null ? 0 : h1.val;
            int num2 = h2 == null ? 0 : h2.val;

            int sum = num1 + num2 + cut;

            cut = sum / 10;

            ListNode temp = new ListNode(sum % 10);

            temp.next = res;
            res = temp;

            h1 = h1 == null ? null : h1.next;
            h2 = h2 == null ? null : h2.next;
        }

        if (cut > 0){
            ListNode temp = new ListNode(cut);

            temp.next = res;
            res = temp;
        }

        return res;
    }

    public static ListNode reverse(ListNode head){
        ListNode res = null;
        ListNode node = head;

        while (node != null){
            ListNode temp = node.next;

            node.next = res;
            res = node;

            node = temp;
        }

        return res;
    }
}
