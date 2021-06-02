package com.cpucode.character.tring.reversal;

/**
 * 反转字符串
 *
 * 开辟一个和str长度大小相同的一个字符串ans，把传入的str倒序赋值到ans字符串上，
 * 时间复杂度O(n), 额外空间复杂度O(n)
 *
 * @author : cpucode
 * @date : 2021/6/2
 * @time : 15:58
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class ReversalTest {
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
        // write code here
        char[] chars = str.toCharArray();

        int length = str.length();

        for (int i = 0; i < length; i++) {
            chars[i] = str.charAt(length - 1 - i);
        }

        return new String(chars);
    }
}
