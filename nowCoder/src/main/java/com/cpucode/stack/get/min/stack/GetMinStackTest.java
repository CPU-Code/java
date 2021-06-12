package com.cpucode.stack.get.min.stack;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @author : cpucode
 * @date : 2021/6/12
 * @time : 14:52
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class GetMinStackTest {

    public static void main(String[] args) {
        int[][] op = {{1, 3}, {1, 2}, {1, 1}, {3}, {2}, {3}};

        GetMinStackTest getMinStackTest = new GetMinStackTest();
        int[] minStack = getMinStackTest.getMinStack(op);

        for (int num : minStack) {
            System.out.print(num + " ");
        }
    }

    static Stack<Integer> s = new Stack<>();
    static Stack<Integer> min_s = new Stack<>();

    /**
     * return a array which include all ans for op3
     * @param op int整型二维数组 operator
     * @return int整型一维数组
     */
    public int[] getMinStack (int[][] op) {
        int length = op.length;
        List<Integer> list = new LinkedList<>();

        for (int i = 0; i < length; i++) {
            if (op[i][0] == 1){
                push(op[i][1]);
            }else if (op[i][0] == 2){
                pop();
            }else if(op[i][0] == 3){
                list.add(getMin());
            }
        }

        int[] res = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }

        return res;
    }

    public static void push(int res){
        s.push(res);

        if (min_s.empty() || min_s.peek() >= res){
            min_s.push(res);
        }
    }

    public static void pop(){
        if (!s.empty()){
            if (!min_s.empty() && min_s.peek().equals(s.peek())){
                min_s.pop();
            }

            s.pop();
        }
    }

    public static int getMin(){
        return min_s.pop();
    }
}
