package com.cpucode.pointer.two.max.in.windows;

import java.util.ArrayList;

/**
 *
 * 滑动窗口的最大值

 描述

 >   给定一个数组和滑动窗口的大小，找出所有滑动窗口里数值的最大值。
 >
 >   例如，如果输入数组{2,3,4,2,6,2,5,1}及滑动窗口的大小3，那么一共存在6个滑动窗口，
        他们的最大值分别为{4,4,6,6,6,5}； 针对数组{2,3,4,2,6,2,5,1}的滑动窗口
 >
 >   有以下6个： {[2,3,4],2,6,2,5,1}， {2,[3,4,2],6,2,5,1}， {2,3,[4,2,6],2,5,1}，
            {2,3,4,[2,6,2],5,1}， {2,3,4,2,[6,2,5],1}， {2,3,4,2,6,[2,5,1]}。
 >
 >   窗口大于数组长度的时候，返回空

 示例1

 >   输入：[2,3,4,2,6,2,5,1],3
 >
 >   返回值：[4,4,6,6,6,5]

 * @author : cpucode
 * @date : 2021/6/24
 * @time : 10:06
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class MaxInWinTest {
    public static void main(String[] args) {
        int[] num = {2,3,4,2,6,2,5,1};
        int size = 3;

        MaxInWinTest maxInWinTest = new MaxInWinTest();
        ArrayList<Integer> integers = maxInWinTest.maxInWindows(num, size);

        System.out.println(integers);

    }

    public ArrayList<Integer> maxInWindows(int [] num, int size) {
        ArrayList<Integer> res = new ArrayList<>();

        if (num.length < size || num.length < 1 || size < 1){
            return res;
        }

        int maxIndex = -1;

        for (int i = 0; i <= num.length - size; i++) {
            if (maxIndex < i){
                // 最大值 , 没有在窗口里

                maxIndex = i;

                // 在窗口里找最大值
                for (int j = i + 1; j < i + size; j++) {
                    if (num[j] > num[maxIndex]){
                        maxIndex = j;
                    }
                }
            }else {
                // 最大值, 在窗口里, 只要与最后一个比较就可
                if (num[i + size - 1] > num[maxIndex]){
                    maxIndex = i + size - 1;
                }
            }

            res.add(num[maxIndex]);
        }

        return res;
    }
}
