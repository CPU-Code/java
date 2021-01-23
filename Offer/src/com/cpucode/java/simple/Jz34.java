package com.cpucode.java.simple;

/**
 * 题目描述
 * 在一个字符串(0<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,并返回它的位置,
 * 如果没有则返回 -1（需要区分大小写）.（从0开始计数）
 *
 * 示例1
 * 输入
 * "google"
 * 返回值
 * 4
 *
 * @author : cpucode
 * @Date : 2021/1/23
 * @Time : 11:48
 * @Github : https://github.com/CPU-Code
 * @CSDN : https://blog.csdn.net/qq_44226094
 */
public class Jz34 {
    public int FirstNotRepeatingChar(String str) {
        if(str == null){
            return -1;
        }

        int[] count = new int[128];
        char[] strs = str.toCharArray();

        for(char s : strs){
            count[s]++;
        }

        for(int i = 0; i < strs.length; i++){
            if(count[strs[i]] == 1){
                return i;
            }
        }

        return -1;
    }
}
