package com.cpucode.linked.list;


/**
 * @author : cpucode
 * @date : 2021/3/12
 * @time : 18:03
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class DoubleLinkedList {
    public static void main(String[] args) {
        // 测试
        System.out.println("双向链表的测试");

        // 先创建节点
        DoubleHeroNode hero1 = new DoubleHeroNode(1, "宋江", "及时雨");
        DoubleHeroNode hero2 = new DoubleHeroNode(2, "卢俊义", "玉麒麟");
        DoubleHeroNode hero3 = new DoubleHeroNode(3, "吴用", "智多星");
        DoubleHeroNode hero4 = new DoubleHeroNode(4, "林冲", "豹子头");

        // 创建一个双向链表
        DoubleLinked doubleLinked = new DoubleLinked();
        doubleLinked.add(hero1);
        doubleLinked.add(hero2);
        doubleLinked.add(hero3);
        doubleLinked.add(hero4);

        doubleLinked.list();
        System.out.println();

        // 修改
        DoubleHeroNode newHeroNode = new DoubleHeroNode(4, "公孙胜", "入云龙");
        doubleLinked.update(newHeroNode);

        System.out.println("修改后的链表情况");
        doubleLinked.list();

        System.out.println();

        // 删除
        doubleLinked.del(3);
        System.out.println("删除后的链表情况~~");
        doubleLinked.list();
    }
}

/**
 * 创建一个双向链表的类
 */
class DoubleLinked{
    /**
     * 先初始化一个头节点, 头节点不要动, 不存放具体的数据
     */
    private DoubleHeroNode head = new DoubleHeroNode(0, "", "");

    /**
     * 返回头节点
     * @return
     */
    public DoubleHeroNode getHead(){
        return head;
    }

    /**
     * 遍历双向链表的方法
     * 显示链表[遍历]
     */
    public void list(){
        // 判断链表是否为空
        if (head.getNext() == null){
            System.out.println("链表为空");

            return;
        }

        //因为头节点，不能动，因此我们需要一个辅助变量来遍历
        DoubleHeroNode temp = head.getNext();

        while (true){
            if (temp == null){
                break;
            }

            // 输出节点的信息
            System.out.println(temp);

            // 将temp后移， 一定小心
            temp = temp.getNext();
        }
    }

    /**
     * 添加一个节点到双向链表的最后.
     * @param doubleHeroNode
     */
    public void add(DoubleHeroNode doubleHeroNode){
        // 因为head节点不能动，因此我们需要一个辅助遍历 temp
        DoubleHeroNode temp = head;

        // 遍历链表，找到最后
        while (true){
            if (temp.getNext() == null){
                break;
            }

            temp = temp.getNext();
        }

        // 当退出while循环时，temp就指向了链表的最后
        // 形成一个双向链表
        temp.setNext(doubleHeroNode);
        doubleHeroNode.setPre(temp);
    }

    /**
     * 修改一个节点的内容, 可以看到双向链表的节点内容修改和单向链表一样
     * 	只是 节点类型改成 HeroNode2
     * @param newHeroNode
     */
    public void update(DoubleHeroNode newHeroNode){
        // 判断是否空
        if (head.getNext() == null){
            System.out.println("链表为空");

            return;
        }

        /**
         * 找到需要修改的节点, 根据no编号
         *  定义一个辅助变量
         */
        DoubleHeroNode temp = head.getNext();
        // 表示是否找到该节点
        boolean flag = false;

        while (true){
            if (temp == null){
                // 已经遍历完链表
                break;
            }

            if (temp.getNo() == newHeroNode.getNo()){
                // 找到
                flag = true;

                break;
            }
            temp = temp.getNext();
        }

        // 根据flag 判断是否找到要修改的节点
        if (flag){
            temp.setName(newHeroNode.getName());
            temp.setNickname(newHeroNode.getNickname());
        }else {
            // 没有找到
            System.out.printf("没有找到 编号 %d 的节点，不能修改\\n", newHeroNode.getNo());
        }
    }

    /**
     * 从双向链表中删除一个节点,
     * 	说明
     * 	 1 对于双向链表，我们可以直接找到要删除的这个节点
     * 	 2 找到后，自我删除即可
     * @param no
     */
    public void del(int no){
        // 判断当前链表是否为空
        if (head.getNext() == null){
            System.out.println("链表为空，无法删除");

            return;
        }
        // 辅助变量(指针)
        DoubleHeroNode temp = head.getNext();
        // 标志是否找到待删除节点的
        boolean flag = false;

        while (true){
            if (temp == null){
                // 已经到链表的最后
                break;
            }

            if (temp.getNo() == no){
                // 找到的待删除节点的前一个节点temp
                flag = true;

                break;
            }
            // temp后移，遍历
            temp = temp.getNext();
        }

        // 判断flag
        if (flag){
            // 找到
            // 可以删除
            // temp.next = temp.next.next;[单向链表]
            temp.getPre().setNext(temp.getNext());

            // 这里我们的代码有问题?
            // 如果是最后一个节点，就不需要执行下面这句话，否则出现空指针
            if (temp.getNext() != null){
                temp.getNext().setPre(temp.getPre());
            }
        }else {
            System.out.printf("要删除的 %d 节点不存在\n", no);
        }
    }



}

/**
 * 定义DoubleHeroNode ， 每个DoubleHeroNode 对象就是一个节点
 */
class DoubleHeroNode{
    private int no;
    private String name;
    private String nickname;

    /**
     * 指向下一个节点, 默认为null
     */
    private DoubleHeroNode next;
    /**
     * 指向前一个节点, 默认为null
     */
    private DoubleHeroNode pre;

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

    public DoubleHeroNode getNext() {
        return next;
    }

    public void setNext(DoubleHeroNode next) {
        this.next = next;
    }

    public DoubleHeroNode getPre() {
        return pre;
    }

    public void setPre(DoubleHeroNode pre) {
        this.pre = pre;
    }

    /**
     * 构造器
     * @param no
     * @param name
     * @param nickname
     */
    public DoubleHeroNode(int no, String name, String nickname){
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
        return "HeroNode [no=" + no + ", name=" + name + ", nickname=" + nickname + "]";
    }

}