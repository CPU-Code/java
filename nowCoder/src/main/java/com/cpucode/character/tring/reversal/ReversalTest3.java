package com.cpucode.character.tring.reversal;

/**
 * 直接调用库函数
 *
 * @author : cpucode
 * @date : 2021/6/2
 * @time : 16:15
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class ReversalTest3 {
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
        StringBuilder str1 = new StringBuilder(str);

        return str1.reverse().toString();
    }
}
