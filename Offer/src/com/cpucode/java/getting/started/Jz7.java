package com.cpucode.java.getting.started;

/**
 * 题目描述
 * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0，第1项是1）。
 * n\leq 39n≤39
 *
 * 示例1
 * 输入
 * 4
 * 返回值
 * 3
 *
 * @author : cpucode
 * @Date : 2021/1/19
 * @Time : 9:46
 * @Github : https://github.com/CPU-Code
 * @CSDN : https://blog.csdn.net/qq_44226094
 */
public class Jz7 {
    public static void main(String[] args) {
        Jz7 test = new Jz7();
        int num = 4;
        int solu = 0;

        solu = test.Fibonacci(num);

        System.out.println(solu);
    }

    public int Fibonacci(int n) {
        int num = 0;

        num = test1(n);
        //num = test2(n);
        //num = test3(n);

        return num;
    }

    private static int test1(int n){
        if(n <= 1){
            return n;
        }

        return test1(n - 1) + test1(n - 2);
    }

    private static int test2(int n){
        if(n <= 1){
            return n;
        }

        int sum = 0;
        int one = 1;
        int two = 0;

        for(int i = 2; i <= n; i++){
            sum = one + two;

            two = one;
            one = sum;
        }

        return sum;
    }

    private static int test3(int n){
        if(n <= 1){
            return n;
        }

        int one = 0;
        int sum = 1;

        for(int i = 2; i <= n; i++){
            sum += one;
            one = sum - one;
        }
        return sum;
    }
}
