package com.cpucode.character.tring.reversal;

/**
 * 使用一个指针
 *
 * 原地交换，str[i] = str[len - 1 - i],注意：交换进行的次数是 len /2次
 * 时间复杂度 O(n), 额外空间复杂度 O(1)
 *
 * @author : cpucode
 * @date : 2021/6/2
 * @time : 16:06
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class ReversalTest2 {
    public static void main(String[] args) {
        String str = "abcd";

        ReversalTest reversalTest = new ReversalTest();
        String solve = reversalTest.solve(str);

        System.out.println(solve);
    }

    /**
     * 反转字符串
     * @param str string字符串
     * @return string字符串
     */
    public String solve (String str) {
        char[] chars = str.toCharArray();

        int length = str.length();

        for (int i = 0; i < (length >> 1); i++) {
            char temp = chars[i];
            chars[i] = chars[length - 1 - i];
            chars[length - 1 - i] = temp;
        }

        return new String(chars);
    }
}
