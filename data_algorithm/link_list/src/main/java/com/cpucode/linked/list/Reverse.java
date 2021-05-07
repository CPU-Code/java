package com.cpucode.linked.list;

/**
 * @author : cpucode
 * @date : 2021/5/7
 * @time : 23:49
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class Reverse {
    public static void main(String[] args) {
        // 链表头结点
        LNode head = new LNode();
        head.next = null;
        LNode tmp = null;
        LNode cur = head;

        // 构造单链表
        for (int i = 0; i < 8; i++) {
            tmp = new LNode();
            tmp.data = i;
            tmp.next = null;
            cur.next = tmp;
            cur = tmp;
        }

        System.out.print("逆序前： ");
        for (cur = head.next; cur != null; cur = cur.next){
            System.out.print(cur.data + " ");
        }

        ReverseTest(head);

        System.out.print("\n逆序后： ");
        for (cur = head.next; cur != null; cur = cur.next){
            System.out.print(cur.data + " ");
        }
    }

    /**
     * 方法功能：对单链表进行逆序输入参数： head:链表头结点
     * @param head
     */
    public static void ReverseTest(LNode head){
        // 判断链表是否为空
        if (head == null || head.next == null){
            return;
        }

        // 前驱结点
        LNode pre = null;
        // 当前结点
        LNode cur = null;
        // 后继结点
        LNode next = null;

        // 把链表首结点变为尾结点
        cur = head.next;
        next = cur.next;
        cur.next = null;
        pre = cur;
        cur = next;

        // 使当前遍历到的结点 cur 指向其前驱结点
        while (cur.next != null){
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        // 结点最后一个结点指向倒数第二个结点
        cur.next = pre;
        // 链表的头结点指向原来链表的尾结点
        head.next = cur;
    }
}

class LNode
{
    /**
     * 数据域
     */
    int data;
    /**
     * 下一个结点的引用
     */
    LNode next;
}