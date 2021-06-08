package com.cpucode.character.tring.bracket.sequence;

import java.util.Stack;

/**
 * 括号序列
 *
 *  描述
 * 给出一个仅包含字符'(',')','{','}','['和']',的字符串，判断给出的字符串是否是合法的括号序列
 * 括号必须以正确的顺序关闭，"()"和"()[]{}"都是合法的括号序列，但"(]"和"([)]"不合法。
 *
 * 示例1
 * 输入： "["
 * 返回值： false
 *
 * 示例2
 * 输入： "[]"
 * 返回值： true
 *
 * @author : cpucode
 * @date : 2021/6/8
 * @time : 16:10
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class IsValidTest {
    public static void main(String[] args) {
        String s = "[({})]";
        IsValidTest isValidTest = new IsValidTest();
        boolean valid = isValidTest.isValid(s);

        System.out.println(valid);
    }

    /**
     * @param s string字符串
     * @return bool布尔型
     */
    public boolean isValid (String s) {
        if (s.length() <= 1 || s == null){
            return false;
        }

        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();

        //遍历所有的元素
        for (char c : chars){
            // 如果是左括号，就把他们对应的右括号压栈
            if (c == '{'){
                stack.push('}');
            }else if(c == '('){
                stack.push(')');
            }else if (c == '['){
                stack.push(']');
            }else if (stack.isEmpty() || stack.pop() != c){

                /**
                 * 否则就只能是右括号。
                 *  1，如果栈为空，说明括号无法匹配。
                 *   2，如果栈不为空，栈顶元素就要出栈，和这个右括号比较。
                 *   如果栈顶元素不等于这个右括号，说明无法匹配，直接返回false。
                 */
                return false;
            }
        }

        /**
         * 最后如果栈为空，说明完全匹配，是有效的括号。
         *    否则不完全匹配，就不是有效的括号
         */
        return stack.isEmpty();
    }
}
