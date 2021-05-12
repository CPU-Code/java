package com.cpucode.longest;

import org.omg.CosNaming.IstringHelper;

/**
 * LeetCode: 最长回文子串 给定一个字符串 s，找到 s 中最长的回文子串。
 * 你可以假设 s 的最大长度为1000。
 *
 * 示例 1：
 *
 * 输入: "babad"
 * 输出: "bab"
 * 注意: "aba"也是一个有效答案。
 * Copy to clipboardErrorCopied
 * 示例 2：
 *
 * 输入: "cbbd"
 * 输出: "bb"
 * Copy to clipboardErrorCopied
 * 以某个元素为中心，分别计算偶数长度的回文最大长度和奇数长度的回文最大长度。
 *
 * @author : cpucode
 * @date : 2021/5/12
 * @time : 22:30
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class LongestPalindromeTest {
    private int index, len;

    public static void main(String[] args) {
        LongestPalindromeTest longestPalindromeTest = new LongestPalindromeTest();
        String s = "babad";
        String s1 = longestPalindromeTest.longestPalindrome(s);

        System.out.println(s1);
    }

    public String longestPalindrome(String s) {
        if (s.length() < 2){
            return s;
        }

        for (int i = 0; i < s.length() - 1; i++) {
            PalindromeHelper(s, i, i);
            PalindromeHelper(s, i, i + 1);
        }

        return s.substring(index, index + len);
    }

    public void PalindromeHelper(String s, int l, int r) {
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)){
            l--;
            r++;
        }

        if (len < r - l - 1){
            index = l + 1;
            len = r - l -1;
        }
    }

}
