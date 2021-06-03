package com.cpucode.character.tring.judge.palindrome;

/**
 * 判断回文
 *  描述
 *    给定一个字符串，请编写一个函数判断该字符串是否回文。如果回文请返回true，否则返回false。
 *
 * @author : cpucode
 * @date : 2021/6/2
 * @time : 22:31
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class PalindromeTest {
    public static void main(String[] args) {
        String str = "absba";

        PalindromeTest palindromeTest = new PalindromeTest();

        boolean judge = palindromeTest.judge(str);

        System.out.println(judge);
    }

    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * @param str string字符串 待判断的字符串
     * @return bool布尔型
     */
    public boolean judge (String str) {
        // write code here
        int left = 0;
        int right = str.length() - 1;

        while (left < right){
            if (str.charAt(left) != str.charAt(right)){
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
