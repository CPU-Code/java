package com.cpucode.java.simple;

/**
 * 题目描述
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 * 示例1
 * 输入
 * 3
 * 返回值
 * 4
 *
 * @author : cpucode
 * @Date : 2021/1/20
 * @Time : 10:44
 * @Github : https://github.com/CPU-Code
 * @CSDN : https://blog.csdn.net/qq_44226094
 */
public class Jz9 {

    public class Solution {
        public int JumpFloorI(int target) {
            if(target == 0) {
                return 0;    //起点没跳，则为0
            }else if(target == 1){
                return 1;    //一次就跳到
            }

            //用于存储num(i)的步数
            int[] num = new int [target + 1];
            num[0] = 1;
            num[1] = 1;

            for(int i = 2; i <= target; i++){
                for(int j = 0; j < i; j++){
                    //累加，从0加到i
                    num[i] += num[j];
                }
            }

            return num[target];
        }

        public int JumpFloorII(int target) {
            /**
             f[n] = f[n-1] + f[n-2] + ... + f[0]
             f[n-1] = f[n-2] + f[n-3] + ... + f[0]
             合并: f[n] = 2*f[n-1]，初始条件 f[1] = 1
             */
            if(target == 0){
                return 0;
            }else if(target == 1){
                return 1;
            }
            int one = 1;
            int sum = 0;

            for(int i = 2; i <= target; i++){
                sum = one << 1;     //  口诀：左移乘2，右移除2
                one = sum;
            }

            return sum;
        }

        public int JumpFloorIII(int target) {
            /**
            f[0] = f[1] = 1
            f[2] = 2 = 21
            f[3] = 4 = 22
            f[4] = 8 = 23
            f[n] = 2 的n-1次方
            */

            if(target == 0){
                return 0;
            }else if(target == 1){
                return 1;
            }

            return (int)(Math.pow(2, target -1));
        }
    }
}
