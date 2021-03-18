package com.cpucode.linked.list;

/**
 * @author : cpucode
 * @date : 2021/3/13
 * @time : 10:37
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class Josephu {
    public static void main(String[] args) {

    }
}

/**
 * 创建一个环形的单向链表
 */
class CircleSingleLinkedList{
    /**
     * 创建一个first节点,当前没有编号
     */
    private Boy first = null;


    /**
     * 添加小孩节点，构建成一个环形的链表
     * @param nums
     */
    public void addBoy(int nums){
        // nums 做一个数据校验
        if (nums < 1){
            System.out.println("nums的值不正确");

            return;
        }

        // 辅助指针，帮助构建环形链表
        Boy curBoy = null;

        // 使用for来创建我们的环形链表
        for (int i = 1; i < nums; i++) {
            // 根据编号，创建小孩节点
            Boy boy = new Boy(i);

            // 如果是第一个小孩
            if (i == 1){
                first = boy;
                // 构成环
                first.setNext(first);
                // 让curBoy指向第一个小孩
                curBoy = first;
            }else {
                curBoy.setNext(boy);
                boy.setNext(first);
                curBoy = boy;
            }
        }
    }


    /**
     * 遍历当前的环形链表
     */
    public void showBoy(){
        // 如果是第一个小孩
        if (first == null){
            System.out.println("没有任何小孩~~");

            return;
        }

        // 因为first不能动，因此我们仍然使用一个辅助指针完成遍历
        Boy curBoy = first;

        while (true){
            System.out.printf("小孩的编号 %d \\n", curBoy.getNo());

            // 说明已经遍历完毕
            if (curBoy.getNext() == first){
                break;
            }

            // curBoy后移
            curBoy = curBoy.getNext();
        }
    }


    /**
     * 根据用户的输入，计算出小孩出圈的顺序
     * @param starNo     表示从第几个小孩开始数数
     * @param countNum  表示数几下
     * @param nums      表示最初有多少小孩在圈中
     */
    public void countBoy(int starNo, int countNum, int nums){
        // 先对数据进行校验
        if (first == null || starNo < 1 || starNo > nums){
            System.out.println("参数输入有误， 请重新输入");

            return;
        }
        // 创建要给辅助指针,帮助完成小孩出圈
        Boy helper = first;

        // 需求创建一个辅助指针(变量) helper , 事先应该指向环形链表的最后这个节点
        while (true){
            if (helper.getNext() == first){
                break;
            }
        }

    }
}

/**
 * 创建一个Boy类，表示一个节点
 */
 class Boy{
    /**
     * 编号
     */
    private int no;
    /**
     *  指向下一个节点,默认null
     */
    private Boy next;

    public Boy(int no){
        this.no = no;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public Boy getNext() {
        return next;
    }

    public void setNext(Boy next) {
        this.next = next;
    }


    @Override
    public String toString() {
        return "Boy{" +
                "no=" + no +
                '}';
    }
}