package com.cpucode.longest;

import java.util.HashSet;

/**
 * LeetCode: 给定一个包含大写字母和小写字母的字符串，
 * 找到通过这些字母构造成的最长的回文串。在构造过程中，请注意区分大小写。
 * 比如"Aa"不能当做一个回文字符串。注 意:假设字符串的长度不会超过 1010。
 *
 *  回文串：“回文串”是一个正读和反读都一样的字符串，比如“level”或者“noon”等等就是回文串
 *
 * 示例 1:
 *
 * 输入:
 * "abccccdd"
 *
 * 输出:
 * 7
 *
 * 解释:
 * 我们可以构造的最长的回文串是"dccaccd", 它的长度是 7。
 *
 * @author : cpucode
 * @date : 2021/5/10
 * @time : 22:27
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class PalindromeTest {
    public static void main(String[] args) {
        String str = "abccccdd";

        int num = longestPalindrome(str);

        System.out.println(num);
    }

    public static int longestPalindrome(String s){
        if (s.length() == 0){
            return 0;
        }

        // 用于存放字符
        HashSet characterHashSet = new HashSet<Character>();

        char[] chars = s.toCharArray();
        int count = 0;

        for (int i = 0; i < chars.length; i++) {
            if (characterHashSet.contains(chars[i])){
                // 如果有,就让count++（说明找到了一个成对的字符），然后把该字符移除
                characterHashSet.remove(chars[i]);
                count++;
            } else {
                // 如果hashset没有该字符就保存进去
                characterHashSet.add(chars[i]);
            }
        }

        return characterHashSet.isEmpty() ? count * 2 : count * 2 + 1;
    }
}
