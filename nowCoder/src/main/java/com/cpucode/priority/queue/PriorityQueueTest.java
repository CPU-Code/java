package com.cpucode.priority.queue;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 优先队列不再遵循先入先出的原则，而是分为两种情况：
 *  最大优先队列，无论入队顺序，当前最大的元素优先出队；
 *
 *  最小优先队列，无论入队顺序，当前最小的元素优先出队；
 *
 * 比如有一个最大优先队列，它的最大元素是8，那么虽然元素8并不是队首元素，但出队的时候仍然让元素8首先出队：
 *
 * 优先级队列，也叫二叉堆、堆（不要和内存中的堆区搞混了，一个是内存区域，一个是数据结构）。
 *
 * 堆的本质上是一种完全二叉树，分为：
 *      小根堆：树中每个非叶子结点都不大于其左右孩子结点的值，也就是根节点最小的堆
 *
 *      大根堆：树中每个非叶子结点都不小于其左右孩子结点的值，也就是根节点最大的堆
 *
 * @author : cpucode
 * @date : 2021/5/21
 * @time : 14:02
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class PriorityQueueTest {
    public static void main(String[] args) {
        int[] arr = {5,2,3,1,4};
        int[] ints = MySort(arr);

        for(int i: ints){
            System.out.print(i);
        }
    }

    public static int[] MySort (int[] arr) {
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });

        for (int i = 0; i < arr.length; i++) {
            queue.add(arr[i]);
        }

        int[] newarr = new int[arr.length];

        for (int i = 0; i < newarr.length; i++) {
            newarr[i] = queue.poll();
        }

        return newarr;
    }
}
