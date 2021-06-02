package com.cpucode.array.judge.palindrome;

/**
 * 使用StringBuffer
 *  这题还可以使用StringBuffer，接着反转，最后在判断是否相等。
 *
 * @author : cpucode
 * @date : 2021/6/2
 * @time : 23:01
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class PalindromeTest2 {
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

        if(str == null){
            return false;
        }

        String res = new StringBuilder(str).reverse().toString();

        return str.equals(res);
    }
}
