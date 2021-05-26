package com.cpucode.sort.min.k.num;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author : cpucode
 * @date : 2021/5/26
 * @time : 16:47
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class MinNumTest {
    public static void main(String[] args) {
        int[] input = {4,5,1,6,2,7,3,8};

        ArrayList<Integer> num = GetLeastNumbers_Solution(input, 4);

        for (Integer i : num) {
            System.out.print(i + " ");
        }
    }

    public static ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k){
        ArrayList<Integer> list = new ArrayList<>();

        //根据题意要求，如果K>数组的长度，返回一个空的数组
        if (k > input.length){
            return list;
        }

        //先排序，然后选择前k个即可
        Arrays.sort(input);

        for (int i = 0; i < k; i++) {
            list.add(input[i]);
        }

        return list;
    }
}
