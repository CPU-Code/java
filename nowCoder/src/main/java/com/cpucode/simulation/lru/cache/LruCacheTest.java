package com.cpucode.simulation.lru.cache;

import java.util.ArrayList;
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
    // 哈希表
    static HashMap<Integer, Node> map = new HashMap<>();

    //头节点
    static Node head = new Node(-1, -1);
    //尾节点
    static Node tail = new Node(-1, -1);

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

        ArrayList<Integer> list = new ArrayList<>();
        head.next = tail;
        tail.next = head;

        for(int[] oper : operators){
            if(oper[0] == 1){
                set(oper[1], oper[2], k);
            }else if(oper[0] == 2){
                list.add(get(oper[1]));
            }
        }

        int [] res = new int[list.size()];

        for(int i = 0; i < list.size(); i++){
            res[i] = list.get(i);
        }

        return res;
    }

    /**
     * 添加 或 修改
     * @param key
     * @param value
     */
    private void set(int key, int value, int k){
        Node node = null;

        if(map.containsKey(key)){
            node = map.get(key);

            // 删除
            map.remove(key);

            // 删除该节点
            node.next.pre = node.pre;
            node.pre.next = node.next;
        }else if(map.size() >= k){
            int removeKey = tail.pre.key;
            map.remove(removeKey);

            // 删除尾节点
            tail.pre = tail.pre.pre;
            tail.pre.next = tail;
        }

        node = new Node(key, value);
        moveToFirst(node);
        map.put(key, node);
    }

    /**
     * 获取数据
     * @param key
     * @return
     */
    private int get(int key){
        if(!map.containsKey(key)){
            // 不存在
            return -1;
        }

        Node node = map.get(key);

        // 删除该节点
        node.next.pre = node.pre;
        node.pre.next = node.next;

        moveToFirst(node);

        return map.get(key).val;
    }

    /**
     * 将节点插入到表头
     * @param node
     */
    private void moveToFirst(Node node){
        head.next.pre = node;
        node.next = head.next;

        head.next = node;
        node.pre = node;
    }
}

class Node{
    public int val;
    public int key;
    public Node pre;
    public Node next;

    Node(){}

    Node(int key, int val){
        this.val = val;
        this.key = key;
    }
}