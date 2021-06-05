package com.cpucode.hash.found.once.num;

import com.cpucode.sort.found.once.number.FoundOnceNumberTest;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : cpucode
 * @date : 2021/6/5
 * @time : 19:54
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class FoundOnceNumTest {
    public static void main(String[] args) {
        int[] arr = {5, 4, 1, 1, 5, 1, 5};
        FoundOnceNumberTest foundOnceNumberTest = new FoundOnceNumberTest();

        int i = foundOnceNumberTest.foundOnceNumber(arr, 3);

        System.out.println(i);
    }

    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param arr int一维数组
     * @param k int
     * @return int
     */
    public int foundOnceNumber (int[] arr, int k) {
        Map<Integer, Boolean> map = new HashMap<>();

        for (int num : arr) {
            if (map.containsKey(num)){
                map.put(num, true);
            }else {
                map.put(num, false);
            }
        }

        for (int num : arr) {
            if (map.get(num) == false){
                return num;
            }
        }

        return 0;
    }
}
