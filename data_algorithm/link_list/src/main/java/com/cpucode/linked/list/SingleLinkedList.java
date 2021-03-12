package com.cpucode.linked.list;

import java.util.Stack;

/**
 * @author : cpucode
 * @date : 2021/3/12
 * @time : 14:43
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class SingleLinkedList {
    public static void main(String[] args) {
        //test1();

        //test2();

        //test3();

        test4();
    }

    static void test1(){
        //先创建节点
        HeroNode hero1 = new HeroNode(1, "宋江", "及时雨");
        HeroNode hero2 = new HeroNode(2, "卢俊义", "玉麒麟");
        HeroNode hero3 = new HeroNode(3, "吴用", "智多星");
        HeroNode hero4 = new HeroNode(4, "林冲", "豹子头");

        //创建要给链表
        LinkedList linkedList = new LinkedList();

        //加入
        linkedList.add(hero1);
        linkedList.add(hero4);
        linkedList.add(hero2);
        linkedList.add(hero3);

        System.out.println("原来链表的情况~~");
        linkedList.list();
    }

    static void test2(){
        //先创建节点
        HeroNode hero1 = new HeroNode(1, "宋江", "及时雨");
        HeroNode hero2 = new HeroNode(2, "卢俊义", "玉麒麟");
        HeroNode hero3 = new HeroNode(3, "吴用", "智多星");
        HeroNode hero4 = new HeroNode(4, "林冲", "豹子头");

        //创建要给链表
        LinkedList linkedList = new LinkedList();

        //加入按照编号的顺序
        linkedList.addByOrder(hero1);
        linkedList.addByOrder(hero4);
        linkedList.addByOrder(hero2);
        linkedList.addByOrder(hero3);

        //显示一把
        linkedList.list();

        //测试修改节点的代码
        HeroNode newHeroNode = new HeroNode(2, "小卢", "玉麒麟~~");
        linkedList.update(newHeroNode);

        System.out.println("修改后的链表情况~~");
        linkedList.list();
    }

    static void test3(){
        //先创建节点
        HeroNode hero1 = new HeroNode(1, "宋江", "及时雨");
        HeroNode hero2 = new HeroNode(2, "卢俊义", "玉麒麟");
        HeroNode hero3 = new HeroNode(3, "吴用", "智多星");
        HeroNode hero4 = new HeroNode(4, "林冲", "豹子头");

        //创建要给链表
        LinkedList linkedList = new LinkedList();

        //加入
        linkedList.add(hero1);
        linkedList.add(hero4);
        linkedList.add(hero2);
        linkedList.add(hero3);

        //删除一个节点
        linkedList.del(1);
        linkedList.del(4);

        System.out.println("删除后的链表情况~~");
        linkedList.list();

        //测试一下 求单链表中有效节点的个数
        System.out.println("有效的节点个数=" + getLength(linkedList.getHead()));

        //测试一下看看是否得到了倒数第K个节点
        HeroNode res = findLastIndexNode(linkedList.getHead(), 3);

        System.out.println("res=" + res);
    }

    static void test4(){
        //先创建节点
        HeroNode hero1 = new HeroNode(1, "宋江", "及时雨");
        HeroNode hero2 = new HeroNode(2, "卢俊义", "玉麒麟");
        HeroNode hero3 = new HeroNode(3, "吴用", "智多星");
        HeroNode hero4 = new HeroNode(4, "林冲", "豹子头");

        //创建要给链表
        LinkedList linkedList = new LinkedList();

        //加入
        linkedList.add(hero1);
        linkedList.add(hero4);
        linkedList.add(hero2);
        linkedList.add(hero3);

        // 测试一下单链表的反转功能
        System.out.println("原来链表的情况~~");

        linkedList.list();

		System.out.println("反转单链表~~");

		reversetList(linkedList.getHead());
        linkedList.list();

        System.out.println("测试逆序打印单链表, 没有改变链表的结构~~");
        reversePrint(linkedList.getHead());
    }

    /**
     * 方式2：可以利用栈这个数据结构，将各个节点压入到栈中，然后利用栈的先进后出的特点，就实现了逆序打印的效果
     */
    static void reversePrint(HeroNode head){
        if(head.getNext() == null) {

            //空链表，不能打印
            return;
        }

        //创建要给一个栈，将各个节点压入栈
        Stack<HeroNode> stack = new Stack<HeroNode>();

        HeroNode cur = head.getNext();

        //将链表的所有节点压入栈
        while (cur != null){
            stack.push(cur);

            //cur后移，这样就可以压入下一个节点
            cur = cur.getNext();
        }

        //将栈中的节点进行打印,pop 出栈
        while (stack.size() > 0){
            //stack的特点是先进后出
            System.out.println(stack.pop());
        }

    }

    /**
     * 将单链表反转
     * @param head
     */
    static void reversetList(HeroNode head){
        //如果当前链表为空，或者只有一个节点，无需反转，直接返回
        if (head.getNext() == null || head.getNext().getNext() == null){
            return;
        }

        //定义一个辅助的指针(变量)，帮助我们遍历原来的链表
        HeroNode cur = head.getNext();
        //指向当前节点[cur]的下一个节点
        HeroNode next = null;
        HeroNode reverseHead = new HeroNode(0, "", "");

        //遍历原来的链表，每遍历一个节点，就将其取出，并放在新的链表reverseHead 的最前端
        while (cur != null){
            //先暂时保存当前节点的下一个节点，因为后面需要使用
            next = cur.getNext();

            //将cur的下一个节点指向新的链表的最前端
            cur.setNext(reverseHead.getNext());

            //将cur 连接到新的链表上
            reverseHead.setNext(cur);

            cur = next;
        }

        //将head.next 指向 reverseHead.next , 实现单链表的反转
        head.setNext(reverseHead.getNext());
    }

    /**
     * 查找单链表中的倒数第k个结点 【新浪面试题】
     * 	思路
     * 	  1. 编写一个方法，接收head节点，同时接收一个index
     * 	  2. index 表示是倒数第index个节点
     * 	  3. 先把链表从头到尾遍历，得到链表的总的长度 getLength
     * 	  4. 得到size 后，我们从链表的第一个开始遍历 (size-index)个，就可以得到
     * 	  5. 如果找到了，则返回该节点，否则返回nulll
     * @param head
     * @param index
     * @return
     */
    static HeroNode findLastIndexNode(HeroNode head, int index) {
        //判断如果链表为空，返回null
        if (head.getNext() == null){
            //没有找到
            return null;
        }

        //第一个遍历得到链表的长度(节点个数)
        int size = getLength(head);

        //第二次遍历  size-index 位置，就是我们倒数的第K个节点
        //先做一个index的校验
        if (index <= 0 || index > size){
            return null;
        }

        //定义给辅助变量， for 循环定位到倒数的index
        HeroNode cur = head.getNext();

        for (int i = 0; i < size - index; i++) {
            cur = cur.getNext();
        }

        return cur;
    }

    /**
     * 方法：获取到单链表的节点的个数(如果是带头结点的链表，需求不统计头节点)
     * @param head  链表的头节点
     * @return    返回的就是有效节点的个数
     */
    static int getLength(HeroNode head){
        if (head.getNext() == null){
            //空链表
            return 0;
        }

        int length = 0;

        //定义一个辅助的变量, 这里我们没有统计头节点
        HeroNode cur = head.getNext();

        while (cur != null){
            length++;

            cur = cur.getNext();
        }

        return length;
    }
}



/**
 * 定义LinkedList 管理我们的英雄
 */
class LinkedList{
    /**
     * 先初始化一个头节点, 头节点不要动, 不存放具体的数据
     */
    private HeroNode head = new HeroNode(0, "", "");

    /**
     * 返回头节点
     * @return
     */
    public HeroNode getHead(){
        return head;
    }

    /**
     * 添加节点到单向链表
     * 思路，当不考虑编号顺序时
     * 	 1. 找到当前链表的最后节点
     * 	 2. 将最后这个节点的next 指向 新的节点
     * @param headNode
     */
    public void add(HeroNode headNode){
        //因为head节点不能动，因此我们需要一个辅助遍历 temp
        HeroNode temp = head;

        //遍历链表，找到最后
        while (true){
            //找到链表的最后
            if (temp.getNext() == null){
                break;
            }

            //如果没有找到最后, 将将temp后移
            temp = temp.getNext();
        }

        /**
         * 当退出while循环时，temp就指向了链表的最后
         *  将最后这个节点的next 指向 新的节点
         */
        temp.setNext(headNode);
    }

    /**
     * 第二种方式在添加英雄时，根据排名将英雄插入到指定位置
     *   (如果有这个排名，则添加失败，并给出提示)
     * @param heroNode
     */
    public void addByOrder(HeroNode heroNode){
        /**
         * 因为头节点不能动，因此我们仍然通过一个辅助指针(变量)来帮助找到添加的位置
         * 因为单链表，因为我们找的temp 是位于 添加位置的前一个节点，否则插入不了
         */
        HeroNode temp = head;

        // flag标志添加的编号是否存在，默认为false
        boolean flag = false;

        while (true){
            if (temp.getNext() == null){
                //说明temp已经在链表的最后
                break;
            }

            if (temp.getNext().getNo() > heroNode.getNo()){
                //位置找到，就在temp的后面插入
                break;
            }else if (temp.getNext().getNo() == heroNode.getNo()){
                //说明希望添加的heroNode的编号已然存在
                //说明编号存在
                flag = true;

                break;
            }

            //后移，遍历当前链表
            temp = temp.getNext();
        }

        //判断flag 的值
        if (flag){
            //不能添加，说明编号存在
            System.out.printf("准备插入的英雄的编号 %d 已经存在了, 不能加入\\n", heroNode.getNo());
        }else {
            //插入到链表中, temp的后面
            heroNode.setNext(temp.getNext());
            temp.setNext(heroNode);
        }
    }

    /**
     * 修改节点的信息, 根据no编号来修改，即no编号不能改.
     * 	说明
     * 	    1. 根据 newHeroNode 的 no 来修改即可
     * @param newHeroNode
     */
    public void update(HeroNode newHeroNode){
        //判断是否空
        if (head.getNext() == null){
            System.out.println("链表为空~");

            return;
        }

        //找到需要修改的节点, 根据no编号
        //定义一个辅助变量
        HeroNode temp = head.getNext();

        //表示是否找到该节点
        boolean flag = false;

        while (true){
            if (temp == null){
                //已经遍历完链表
                break;
            }

            if (temp.getNo() == newHeroNode.getNo()){
                flag = true;

                break;
            }

            temp = temp.getNext();
        }

        //根据flag 判断是否找到要修改的节点
        if (flag){
            temp.setName(newHeroNode.getName());
            temp.setNickname(newHeroNode.getNickname());
        }else {
            //没有找到
            System.out.printf("没有找到 编号 %d 的节点，不能修改\\n", newHeroNode.getNo());
        }
    }

    /**
     * 删除节点
     * 	思路
     * 	1. head 不能动，因此我们需要一个temp辅助节点找到待删除节点的前一个节点
     * 	2. 说明我们在比较时，是temp.next.no 和  需要删除的节点的no比较
     */
    /**
     * 删除节点
     * 	思路
     * 	1. head 不能动，因此我们需要一个temp辅助节点找到待删除节点的前一个节点
     * 	2. 说明我们在比较时，是temp.next.no 和  需要删除的节点的no比较
     * @param no
     */
    public void del(int no){
        HeroNode temp = head;
        // 标志是否找到待删除节点的
        boolean flag = false;

        while (true){
            if (temp.getNext() == null){
                //已经到链表的最后
                break;
            }

            if (temp.getNext().getNo() == no){
                //找到的待删除节点的前一个节点temp
                flag = true;

                break;
            }

            //temp后移，遍历
            temp = temp.getNext();
        }

        //判断flag
        if (flag) {
            //找到
            //可以删除
            temp.setNext(temp.getNext().getNext());
        }else {
            System.out.printf("要删除的 %d 节点不存在\n", no);
        }
    }

    /**
     * 显示链表[遍历]
     */
    public void list(){
        //判断链表是否为空
        if (head.getNext() == null){
            System.out.println("链表为空");

            return;
        }

        //因为头节点，不能动，因此我们需要一个辅助变量来遍历
        HeroNode temp = head.getNext();

        while (true){
            //判断是否到链表最后
            if (temp == null){
                break;
            }

            //输出节点的信息
            System.out.println(temp);

            //输出节点的信息
            temp = temp.getNext();
        }
    }

}

/**
 * 定义HeroNode ， 每个HeroNode 对象就是一个节点
 */
class HeroNode{
    private int no;
    private String name;
    private String nickname;
    /**
     * 指向下一个节点
     */
    private HeroNode next;

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public HeroNode getNext() {
        return next;
    }

    public void setNext(HeroNode next) {
        this.next = next;
    }

    /**
     * 构造器
     * @param no
     * @param name
     * @param nickname
     */
    public HeroNode(int no, String name, String nickname){
        this.no = no;
        this.name = name;
        this.nickname = nickname;
    }

    /**
     * 为了显示方法，我们重新toString
     * @return
     */
    @Override
    public String toString() {
        return "HeroNode{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';
    }
}