package com.cpucode.java.getting.started;

import java.util.Stack;

/**
 * 题目描述
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 *
 * @author : cpucode
 * @Date : 2021/1/19
 * @Time : 10:54
 * @Github : https://github.com/CPU-Code
 * @CSDN : https://blog.csdn.net/qq_44226094
 */
public class Jz5 {
    public class Solution {
        Stack<Integer> stack1 = new Stack<Integer>();
        Stack<Integer> stack2 = new Stack<Integer>();

        public void push(int node) {
            //当插入时，直接插入 stack1
            stack1.push(node);
        }

        public int pop() {
            //当 stack2 不为空，弹出 stack2 栈顶元素
            // 当 stack2 为空，将 stack1 中的全部出栈到入栈 stack2，再弹出 stack2 栈顶元素
            if(stack2.size() <= 0){
                while(stack1.size() != 0){
                    stack2.push(stack1.pop());
                }
            }

            return stack2.pop();
        }
    }
}
