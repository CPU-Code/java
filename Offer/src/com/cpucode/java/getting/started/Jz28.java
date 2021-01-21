package com.cpucode.java.getting.started;

import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

/**
 * 题目描述
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。
 * 由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。
 * 示例1
 * 输入
 * [1,2,3,2,2,2,5,4,2]
 * 返回值
 * 2
 *
 * @author : cpucode
 * @Date : 2021/1/20
 * @Time : 14:41
 * @Github : https://github.com/CPU-Code
 * @CSDN : https://blog.csdn.net/qq_44226094
 */
public class Jz28 {
    public int MoreThanHalfNum_Solution(int [] array) {
        Map<Integer, Integer> map = new HashMap<>(array.length + 1);

        for(int i = 0; i < array.length; i++){
            /**
             * 查询是否有这个key
             * */
            if(map.containsKey(array[i])){
                /**
                 * 有出现就加一
                 * */
                map.put(array[i], map.get(array[i]) + 1);
            } else{
                /**
                 * 第一次出现这个key
                 * */
                map.put(array[i], 1);
            }

            /**
             * 查询是否大于数组一半
             * */
            if(map.get(array[i]) > (array.length/2)){
                return array[i];
            }
        }

        return 0;
    }

    public int MoreThanHalfNum_Solution1(int [] array) {
        /**
         * 排序
         * */
        Arrays.sort(array);

        int count = 0;
        /**
         * 中间下标, 如果众数大于一半, 就绝对在中间
         * */
        int half = array.length/2;

        for(int num : array){
            if(num == array[half]){
                /**
                 * 记录中间值的数量
                 * */
                count++;
            }
        }

        if(count > half){
            return array[half];
        }else{
            return 0;
        }
    }

    public int MoreThanHalfNum_Solution2(int [] array) {
        int cond = -1;
        int cnt = 0;

        for(int num : array){

            if(cnt == 0){
                /**
                 * 找到新的众数
                 * */
                cond = num;
                cnt++;
            }else{
                if(cond == num){
                    /**
                     * 和众数一样
                     * */
                    cnt++;
                }else{
                    /**
                     * 和众数不一样
                     * */
                    cnt--;
                }
            }
        }

        cnt = 0;

        for(int num : array){
            if(num == cond){
                cnt++;
            }
            if(cnt > array.length/2){
                return cond;
            }
        }

        return 0;
    }
}
