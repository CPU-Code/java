package com.cpucode.longpublic;

import java.util.Arrays;

/**
 * Leetcode: 编写一个函数来查找字符串数组中的最长公共前缀。如果不存在公共前缀，返回空字符串 ""。
 *
 * 示例 1:
 *
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 * Copy to clipboardErrorCopied
 *
 * 示例 2:
 *
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 *
 * 先利用Arrays.sort(strs)为数组排序，再将数组第一个元素和最后一个元素的字符从前往后对比即可！
 *
 * @author : cpucode
 * @date : 2021/5/10
 * @time : 22:05
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class SpaceTest {
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        String[] strs1 = {"cog", "dacecar", "car"};

        String s = replaceSpace(strs1);

        System.out.println(s);
    }

    public static String replaceSpace(String[] strs){
        // 如果检查值不合法及就返回空串
        if (!checkStrs(strs)){
            return "错误";
        }

        // 数组长度
        int length = strs.length;

        // 用于保存结果
        StringBuilder stringBuilder = new StringBuilder();

        // 给字符串数组的元素按照升序排序(包含数字的话，数字会排在前面)
        Arrays.sort(strs);

        int m = strs[0].length();
        int n = strs[length - 1].length();

        int min = Math.min(m, n);

        for (int i = 0; i < min; i++) {
            if (strs[0].charAt(i) == strs[length - 1].charAt(i)){
                stringBuilder.append(strs[0].charAt(i));
            }else {
                break;
            }
        }

        return stringBuilder.toString();
    }

    private static boolean checkStrs(String[] strs){
        boolean flag = false;

        if (strs != null){
            flag = true;

            // 遍历strs检查元素值
            for (int i = 0; i < strs.length; i++) {
                if (strs[i] == null || strs[i].length() == 0){
                    flag = false;

                    break;
                }
            }
        }

        return flag;
    }
}
