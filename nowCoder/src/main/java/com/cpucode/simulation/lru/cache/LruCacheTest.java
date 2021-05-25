package com.cpucode.simulation.lru.cache;

import java.util.Arrays;
import java.util.HashMap;

/**
 * 题目描述
 * 设计LRU缓存结构，该结构在构造时确定大小，假设大小为K，并有如下两个功能
 * set(key, value)：将记录(key, value)插入该结构
 * get(key)：返回key对应的value值
 *
 * [要求]
 *  1. set和get方法的时间复杂度为O(1)
 *  2. 某个key的set或get操作一旦发生，认为这个key的记录成了最常使用的。
 *  3. 当缓存的大小超过K时，移除最不经常使用的记录，即set或get最久远的。
 *
 * 若opt=1，接下来两个整数x, y，表示set(x, y)
 * 若opt=2，接下来一个整数x，表示get(x)，若x未出现过或已被移除，则返回-1
 * 对于每个操作2，输出一个答案
 *
 *
 * @author : cpucode
 * @date : 2021/5/24
 * @time : 23:24
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class LruCacheTest {
    private HashMap<Integer, Node> map = new HashMap<>();
    //头节点
    private Node head = new Node(-1, -1);
    //尾节点
    private Node tail = new Node(-1, -1);
    private int k =  0;

    public static void main(String[] args) {
        LruCacheTest lruCacheTest = new LruCacheTest();

        int[][] operators = {{1,1,1}, {1,2,2},
                             {1,3,2}, {2,1},
                             {1,4,4}, {2,2}};
        int[] lru = lruCacheTest.LRU(operators, 3);

        for (int i: lru) {
            System.out.print(i + " ");
        }
    }

    public int[] LRU(int[][] operators, int k) {
        // write code here
        this.k = k;
        head.setNext(tail);
        tail.setPre(head);
        //获取数组中开头为2（get操作）的元素个数
        int len = (int) Arrays.stream(operators).filter(x->x[0]==2).count();
        int res[] = new int[len];

        for(int i = 0, j = 0; i < operators.length; i++){

            if(operators[i][0] == 1){
                //获取数组中开头为1（set操作）的元素个数

                //set(key,val)
                set(operators[i][1], operators[i][2]);
            }else{
                //获取数组中开头为2（get操作）的元素个数

                //get(key)
                res[j++] = get(operators[i][1]);
            }
        }

        return res;
    }

    /**
     * 添加 或 修改
     * @param key
     * @param val
     */
    private void set(int key, int val){
        Node node = null;

        if (map.containsKey(key)){
            //key存在
            node = map.get(key);
            node.setVal(val);

            node.getNext().setPre(node.getPre());
            node.getPre().setNext(node.getNext());

            moveToFirst(node);
        }else {

            if (map.size() >= k){
                //在map中删除映射到最后一个节点的key
                int removeKey = tail.getPre().getKey();

                map.remove(removeKey);

                //在链表中删除最后一个节点
                tail.setPre(tail.getPre().getPre());
                tail.getPre().setNext(tail);
            }

            node = new Node(key,val);
            //在map中添加对新节点的映射
            map.put(key, node);
            //将节点插入到表头
            moveToFirst(node);
        }
    }

    /**
     * 获取数据
     * @param key
     * @return
     */
    private int get(int key){
        if (map.containsKey(key)){
            //存在key
            Node node = map.get(key);

            //删除该结点
            node.getNext().setPre(node.getPre());
            node.getPre().setNext(node.getNext());
            //插入到表头
            moveToFirst(node);

            return node.getVal();
        }else {
            //不存在key
            return -1;
        }
    }

    /**
     * 将节点插入到表头
     * @param node
     */
    private void moveToFirst(Node node){
        head.getNext().setPre(node);
        node.setNext(head.getNext());

        head.setNext(node);
        node.setPre(head);
    }


}

class Node{
    private int val;
    private int key;
    private Node pre;
    private Node next;

    Node(){}

    Node(int key, int val){
        this.val = val;
        this.key = key;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public Node getPre() {
        return pre;
    }

    public void setPre(Node pre) {
        this.pre = pre;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "val=" + val +
                ", key=" + key +
                ", pre=" + pre +
                ", next=" + next +
                '}';
    }
}