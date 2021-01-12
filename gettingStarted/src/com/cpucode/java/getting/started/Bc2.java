package com.cpucode.java.getting.started;

/**
 * 题目描述
 * 每个人都想成为大V (VIP：Very Important Person)，但要一点一点积累才行，先从小v做起。要求输出由小写字母v组成的大V。
 * 输入描述:
 * 无
 * 输出描述:
 * v   v
 *
 *  v v
 *
 *   v
 *
 * 备注:
 * 换行使用转义字符‘\n’
 *
 * @author : cpucode
 * @Date : 2021/1/8
 * @Time : 19:30
 * @Github : https://github.com/CPU-Code
 * @CSDN : https://blog.csdn.net/qq_44226094
 */
public class Bc2 {
    public static void main(String[] args){
        Bc2.solution(3);
    }

    static void solution(int n){
        //第一层的总输出
        int count = n + (n - 1);
        //第一个v
        int start = 1;
        //最后一个v
        int end = count;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= end; j++) {
                //判断当前是不是最后一v或 第一v
                if (j == start || end == j) {
                    System.out.print("v");
                }else {
                    System.out.print(" ");
                }
            }
            //每层结束回车
            System.out.println();
            //第一位v后退
            start++;
            //最后一位v前进
            end--;
        }
    }
}

/*
v   v
 v v
  v
* */