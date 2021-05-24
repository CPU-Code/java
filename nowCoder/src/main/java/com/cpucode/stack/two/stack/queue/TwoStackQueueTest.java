package com.cpucode.stack.two.stack.queue;

import java.util.Stack;

/**
 * 题目描述
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 *
 * 队列的特性是：“先入先出” ，栈的特性是：“先入后出”
 *
 * 当插入时，直接插入 stack1
 *
 * 当弹出时，当 stack2 不为空，弹出 stack2 栈顶元素，
 * 如果 stack2 为空，将 stack1 中的全部数逐个出栈入栈 stack2，再弹出 stack2 栈顶元素
 *
 * @author : cpucode
 * @date : 2021/5/24
 * @time : 23:07
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class TwoStackQueueTest {
    public static void main(String[] args) {
        Solution solution = new Solution();

        solution.push(0);
        solution.push(1);
        solution.push(2);

        System.out.println(solution.pop());
        System.out.println(solution.pop());
        System.out.println(solution.pop());

        System.out.println(solution.pop());
    }

}

class Solution{
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node){
        //当插入时，直接插入 stack1
        stack1.push(node);
    }

    public Integer pop(){
        if (stack2.size() <=0){
            // 当 stack2 为空，将 stack1 中的全部出栈到入栈 stack2
            while (stack1.size() > 0){
                stack2.push(stack1.pop());
            }

            //再弹出 stack2 栈顶元素
        }

        //当 stack2 不为空，弹出 stack2 栈顶元素
        if (stack2.size() > 0){
            return stack2.pop();
        }

        return null;
    }
}
