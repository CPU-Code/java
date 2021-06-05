package com.cpucode.hash.two.sum;

import java.util.HashMap;
import java.util.Map;

/**
 * 两数之和
 *
 * 描述
 * 给出一个整数数组，请在数组中找出两个加起来等于目标值的数，
 * 你给出的函数twoSum 需要返回这两个数字的下标（index1，index2），
 * 需要满足 index1 小于index2.。注意：下标是从1开始的 , 假设给出的数组中只存在唯一解
 * 例如：
 * 给出的数组为 {20, 70, 110, 150},目标值为90
 * 输出 index1=1, index2=2
 *
 * 示例1
 * 输入：
 * [3,2,4],6
 *
 * 返回值：
 * [2,3]
 * 说明：
 * 因为 2+4=6 ，而 2的下标为2 ， 4的下标为3 ，又因为 下标2 < 下标3 ，所以输出[2,3]
 *
 * @author : cpucode
 * @date : 2021/6/5
 * @time : 22:35
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class TwoSumTest {
    public static void main(String[] args) {
        int[] numbers = {3, 2, 4};

        TwoSumTest twoSumTest = new TwoSumTest();
        int[] ints = twoSumTest.twoSum(numbers, 6);

        for (int anInt : ints) {
            System.out.print(anInt + " ");
        }
    }

    /**
     * @param numbers int整型一维数组
     * @param target int整型
     * @return int整型一维数组
     */
    public int[] twoSum (int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] res = new int[2];

        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(target - numbers[i])){
                res[0] = map.get(target - numbers[i]);
                res[1] = i + 1;

                return res;
            }else{
                map.put(numbers[i], i + 1);
            }
        }

        return res;
    }
}
