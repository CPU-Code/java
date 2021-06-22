package com.cpucode.simulation.lru.cache;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 描述
 * 设计LRU缓存结构，该结构在构造时确定大小，假设大小为K，并有如下两个功能
 *      set(key, value)：将记录(key, value)插入该结构
 *      get(key)：返回key对应的value值
 *
 * [要求]
 * set和get方法的时间复杂度为O(1)
 *   某个key的set或get操作一旦发生，认为这个key的记录成了最常使用的。
 *   当缓存的大小超过K时，移除最不经常使用的记录，即set或get最久远的。
 *     若opt=1，接下来两个整数x, y，表示set(x, y)
 *     若opt=2，接下来一个整数x，表示get(x)，若x未出现过或已被移除，则返回-1
 *  对于每个操作2，输出一个答案
 *
 * 示例1
 * 输入：[[1,1,1],[1,2,2],[1,3,2],[2,1],[1,4,4],[2,2]],3
 * 返回值：[1,-1]
 *
 * 说明：
 * 第一次操作后：最常使用的记录为("1", 1)
 * 第二次操作后：最常使用的记录为("2", 2)，("1", 1)变为最不常用的
 * 第三次操作后：最常使用的记录为("3", 2)，("1", 1)还是最不常用的
 * 第四次操作后：最常用的记录为("1", 1)，("2", 2)变为最不常用的
 * 第五次操作后：大小超过了3，所以移除此时最不常使用的记录("2", 2)，
 * 加入记录("4", 4)，并且为最常使用的记录，然后("3", 2)变为最不常使用的记录
 *
 * 备注：
 * 1≤K≤N≤10^5
 * −2×10^9 ≤ x, y ≤ 2×10^9
 *
 * @author : cpucode
 * @date : 2021/6/22
 * @time : 20:59
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class LruCache2Test {
    public static void main(String[] args) {
        int[][] operators = {{1, 1, 1},
                {1, 2, 2},
                {1, 3, 2},
                {2, 1},
                {1, 4, 4},
                {2, 2}};

        int k = 3;

        LruCache2Test lruCache2Test = new LruCache2Test();

        int[] lru = lruCache2Test.LRU(operators, k);

        for (int i : lru) {
            System.out.print(i + " ");
        }
    }

    static LinkedHashMap<Integer, Integer> map = new LinkedHashMap();

    /**
     * lru design
     * @param operators int整型二维数组 the ops
     * @param k int整型 the k
     * @return int整型一维数组
     */
    public int[] LRU (int[][] operators, int k) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int[] oper : operators) {
            if (oper[0] == 1){
                set(oper[1], oper[2], k);
            }else if (oper[0] == 2){
                list.add(get(oper[1]));
            }
        }

        int[] res = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }

        return res;
    }

    public static void set(int key, int value, int k){
        if (map.containsKey(key)){
            // 存在
            //删除
            map.remove(key);
            // 加入到队列
            map.put(key, value);

            return;
        }

        if (map.size() >= k){
            // 查找到 队首 key
            int removeKey = map.keySet().iterator().next();
            // 删除
            map.remove(removeKey);
        }

        // 加入到队列
        map.put(key, value);
    }

    public static int get(int key){
        if (!map.containsKey(key)){
            // 不存在
            return -1;
        }

        int value = map.get(key);

        //删除key
        map.remove(key);
        // 重新加入到队尾
        map.put(key, value);

        return value;
    }
}
