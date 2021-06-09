package com.cpucode.simulation.is.continuous;

import java.util.TreeSet;

/**
 *  扑克牌顺子
 *
 *  描述
 * 现在有2副扑克牌，从扑克牌中随机五张扑克牌，我们需要来判断一下是不是顺子。
 * 有如下规则：
 *      1. A为1，J为11，Q为12，K为13，A不能视为14
 *      2. 大、小王为 0，0可以看作任意牌
 *      3. 如果给出的五张牌能组成顺子（即这五张牌是连续的）就输出true，否则就输出false。
 * 例如：给出数据[6,0,2,0,4]
 * 中间的两个0一个看作3，一个看作5 。即：[6,3,2,5,4]
 * 这样这五张牌在[2,6]区间连续，输出true
 * 数据保证每组5个数字，每组最多含有4个零，数组的数取值为 [0, 13]
 *
 * 示例1
 * 输入： [6,0,2,0,4]
 * 返回值： true
 *
 * 示例2
 * 输入：[0,3,2,6,4]
 * 返回值： true
 *
 * 示例3
 * 输入： [1,0,0,1,0]
 * 返回值： false
 *
 * 示例4
 * 输入： [13,12,11,0,1]
 * 返回值： false
 *
 * @author : cpucode
 * @date : 2021/6/9
 * @time : 15:33
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class IsContinuousTest {
    public static void main(String[] args) {
        int[]  numbers = {6,0,2,0,4};

        IsContinuousTest isContinuousTest = new IsContinuousTest();
        boolean b = isContinuousTest.IsContinuous(numbers);

        System.out.println(b);
    }

    public boolean IsContinuous(int [] numbers) {
        if (numbers.length != 5){
            return false;
        }
        TreeSet<Integer> set = new TreeSet<>();
        int cur = 0;

        for (int number : numbers) {
            if (number == 0){
                cur++;
            }else {
                set.add(number);
            }
        }

        if ((cur + set.size()) != 5){
            return false;
        }

        if ((set.last() - set.first()) < 5){
            return true;
        }

        return false;
    }
}
