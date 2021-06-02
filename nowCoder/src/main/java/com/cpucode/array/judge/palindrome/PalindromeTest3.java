package com.cpucode.array.judge.palindrome;

/**
 * @author : cpucode
 * @date : 2021/6/2
 * @time : 23:15
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class PalindromeTest3 {
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
        return isJudge(str, 0, str.length() - 1);
    }

    public boolean isJudge(String str, int left, int right){
        if(left >= right){
            return true;
        }

        return (str.charAt(left++) == str.charAt(right--)) && isJudge(str, left, right);
    }
}
