package com.cpucode.recursion.step.jump;

/**
 * @author : cpucode
 * @date : 2021/6/3
 * @time : 16:58
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class StepJumpTest2 {
    public static void main(String[] args) {
        StepJumpTest2 stepJumpTest = new StepJumpTest2();
        int i = stepJumpTest.jumpFloor(5);

        System.out.println(i);
    }

    public int jumpFloor(int target) {
        if (target <= 1){
            return target;
        }

        int one = 1;
        int two = 2;
        int sum = 0;

        for (int i = 3; i < target; i++) {
            sum = one + two;

            one = two;
            two = sum;
        }

        return sum;
    }
}
