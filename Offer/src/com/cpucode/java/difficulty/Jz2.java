package com.cpucode.java.difficulty;

/**
 * @author : cpucode
 * @date : 2021/5/8
 * @time : 23:48
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class Jz2 {
    static class Solution {
        /**
         * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
         *
         *
         * @param s string字符串
         * @return string字符串
         */
        public String replaceSpace (String s) {
            if(s == null || "".equals(s)){
                return s;
            }

            return s.replaceAll(" ", "%20");
            // write code here
        }
    }

    public static void main(String[] args) {
        String s ="We Are Happy";
        Solution jz2 = new Solution();

        String s1 = jz2.replaceSpace(s);

        System.out.println(s1);
    }
}
