package com.cpucode.character.tring.max.add;

/**
 * 大数加法
 *
 * 描述
 * 以字符串的形式读入两个数字，编写一个函数计算它们的和，以字符串形式返回。
 * （字符串长度不大于100000，保证字符串仅由'0'~'9'这10种字符组成）
 *
 * 示例1
 * 输入： "1","99"
 * 返回值： "100"
 * 说明： 1+99=100
 *
 * @author : cpucode
 * @date : 2021/6/15
 * @time : 21:34
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class MaxAddTest {
    public static void main(String[] args) {
        String s = "1";
        String t = "99";
        MaxAddTest maxAddTest = new MaxAddTest();
        String solve = maxAddTest.solve(s, t);

        System.out.println(solve);
    }

    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     * 计算两个数之和
     * @param s string字符串 表示第一个整数
     * @param t string字符串 表示第二个整数
     * @return string字符串
     */
    public String solve (String s, String t) {
        int s_i = s.length() - 1;
        int t_i = t.length() - 1;
        int cut = 0;
        StringBuilder str = new StringBuilder();

        while (s_i >= 0 || t_i >= 0 || cut != 0){
            int num1 = s_i < 0 ? 0 : s.charAt(s_i--) - '0';
            int num2 = t_i < 0 ? 0 : t.charAt(t_i--) - '0';

            int sum = num1 + num2 + cut;
            cut = sum /10;

            str.insert(0, sum % 10);
        }

        return str.toString();
    }
}
