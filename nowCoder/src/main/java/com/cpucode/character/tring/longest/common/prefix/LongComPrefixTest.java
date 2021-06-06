package com.cpucode.character.tring.longest.common.prefix;

/**
 * 最长公共前缀
 *
 *  描述
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 *
 * 示例1
 * 输入：
 *   ["abca","abc","abca","abc","abcc"]
 *  返回值：
 *      "abc"
 *
 * @author : cpucode
 * @date : 2021/6/6
 * @time : 22:18
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class LongComPrefixTest {
    public static void main(String[] args) {
        String[] strs = {"abca", "abc", "abca", "abc", "abcc"};

        LongComPrefixTest longComPrefixTest = new LongComPrefixTest();
        String s = longComPrefixTest.longestCommonPrefix(strs);

        System.out.println(s);
    }

    /**
     * @param strs string字符串一维数组
     * @return string字符串
     */
    public String longestCommonPrefix (String[] strs) {
        // write code here
        // 边界条件判断
        if (strs.length == 0 || strs == null){
            return "";
        }

        int i = 1;
        // 默认第一个字符串是他们的公共前缀
        String str = strs[0];

        while (i < strs.length){
            // 不断的截取
            while (strs[i].indexOf(str) != 0){
                str = str.substring(0, str.length() - 1);
            }

            i++;
        }

        return str;
    }
}
