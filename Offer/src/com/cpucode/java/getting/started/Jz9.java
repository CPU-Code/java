package com.cpucode.java.getting.started;

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
        public int JumpFloorII(int target) {
            if(target==0){
                return 0;//起点没跳，则为0
            }
            int []dp=new int[target+1];//用于存储f(i)的步数
            dp[0]=1;
            for(int i=1;i<=target;i++){//从1到目标台阶
                for(int j=0;j<i;j++){//累加，从0加到i
                    dp[i]+=dp[j];//存入数组
                }
            }
            return dp[target];
        }

//         if(target <= 1){
//             return 1;
//         }

//         int[] num = new int[target + 1];
//         Arrays.fill(num, 1);
//         num[0] = 0;
//         num[1] = 1;

//         for(int i = 2; i <= target; i++){
//             for(int j = 0; j < i; j++){
//                 num[i] += num[j];
//             }
//         }

//         return num[target];

//         int num = 0;

//         num = test1(target);

//         return num;
//     }

//     private int test1(int target){
//         if(target <= 1){
//             return 1;
//         }

//         int[] num = new int[target + 1];
//         num[0] = 1;
//         num[1] = 1;

//         for(int i = 2; i <= target; i++){
//             for(int j = 0; j < i; j++){
//                 num[i] += num[j];
//             }
//         }

//         return num[target];
//     }
    }
}
