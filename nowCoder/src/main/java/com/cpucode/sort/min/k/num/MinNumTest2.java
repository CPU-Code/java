package com.cpucode.sort.min.k.num;

import java.util.ArrayList;
import java.util.PriorityQueue;

/**
 * 保证堆的大小不能超过K，然后遍历数组，因为是最大堆，也就是堆顶元素是堆中最大的，
 * 如果遍历的元素小于堆顶元素，就把堆顶元素给移除，然后再把当前遍历的元素加入到堆中，
 * 最后在把堆中元素转化为数组即可
 *
 * @author : cpucode
 * @date : 2021/5/26
 * @time : 17:42
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class MinNumTest2 {
    public static void main(String[] args) {
        int[] input = {4,5,1,6,2,7,3,8};

        ArrayList<Integer> num = GetLeastNumbers_Solution(input, 4);

        for (Integer i : num) {
            System.out.print(i + " ");
        }
    }

    public static ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k){
        ArrayList<Integer> res = new ArrayList<>();

        //如果K>数组的长度，返回一个空的数组
        if (input.length < k || k == 0){
            return res;
        }

        //创建最大堆
        PriorityQueue<Integer> queue = new PriorityQueue<>((num1, num2) -> num2 - num1);

        //先在堆中放数组的前k个元素
        for (int i = 0; i < k; i++) {
            queue.offer(input[i]);
        }

        //因为是最大堆，也就是堆顶的元素是堆中最大的，
        for (int i = k; i < input.length; i++) {
            //遍历数组后面元素的时候，当前元素比较堆顶元素
            if (queue.peek() > input[i]){
                //堆顶元素给移除
                queue.poll();

                //当前元素放到堆中
                queue.offer(input[i]);
            }
        }

        //最后再把堆中元素转化为数组
        for (int i = 0; i < k; i++) {
            res.add(queue.poll());
        }

        return res;
    }
}
