package com.cpucode.java;

import java.util.function.Supplier;

public class jdk88 {
    public static void main(String[] args) {
        int arr[] = {3, 5, 5, 10};

        //调用getMax方法,参数传递Lambda
        int maxNum = getMax(() -> {
            //计算数组的最大值
            int max = arr[0];

            for(int i : arr) {
                if(i > max) {
                    max = i;
                }
            }

            return max;
        });

        System.out.println(maxNum);
    }

    /**
     * 定一个方法,方法的参数传递Supplier,泛型使用Integer
     * @param sup
     * @return
     */
    private static int getMax(Supplier<Integer> sup) {
        return sup.get();
    }
}