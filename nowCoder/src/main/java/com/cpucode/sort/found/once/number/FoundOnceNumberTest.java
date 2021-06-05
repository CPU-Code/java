package com.cpucode.sort.found.once.number;

import java.util.Arrays;

/**
 * 数组中只出现一次的数（其它数出现k次）
 * 排序
 *
 * @author : cpucode
 * @date : 2021/6/5
 * @time : 19:37
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class FoundOnceNumberTest {
    public static void main(String[] args) {
        int[] arr = {5, 4, 1, 1, 5, 1, 5};
        FoundOnceNumberTest foundOnceNumberTest = new FoundOnceNumberTest();

        int i = foundOnceNumberTest.foundOnceNumber(arr, 3);

        System.out.println(i);
    }

    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * @param arr int一维数组
     * @param k int
     * @return int
     */
    public int foundOnceNumber (int[] arr, int k) {
        //排序
        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]){
                //相同 , 直接跳到另外一个值
                i += k - 1;
            }else {
                // 只有一个
                return arr[i];
            }
        }

        return arr[arr.length - 1];
    }
}
