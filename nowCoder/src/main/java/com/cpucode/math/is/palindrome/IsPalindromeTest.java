package com.cpucode.math.is.palindrome;

/**
 * 回文数字
 *
 *  描述
 * 在不使用额外的内存空间的条件下判断一个整数是否是回文数字
 *
 * 提示：
 * 负整数可以是回文吗？（比如-1）
 * 如果你在考虑将数字转化为字符串的话，请注意一下不能使用额外空间的限制
 * 你可以将整数翻转。但是，如果你做过题目“反转数字”，你会知道将整数翻转可能会出现溢出的情况，你怎么处理这个问题？
 *
 * 示例1
 * 输入：
 * 121
 * 返回值：
 * true
 *
 * @author : cpucode
 * @date : 2021/6/10
 * @time : 9:16
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class IsPalindromeTest {
    public static void main(String[] args) {
        IsPalindromeTest isPalindromeTest = new IsPalindromeTest();
        boolean palindrome = isPalindromeTest.isPalindrome(121);

        System.out.println(palindrome);
    }

     /**
     * @param x int整型
     * @return bool布尔型
     */
    public boolean isPalindrome (int x) {
        if (x < 0){
            return false;
        }

        int temp = x;
        int y = 0;

        while(temp > 0){
            y = y * 10 + temp % 10;
            temp /= 10;
        }

        return (y == x);
    }
}
