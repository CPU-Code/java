package com.cpucode.recursion.step.jump;

/**
 * @author : cpucode
 * @date : 2021/6/3
 * @time : 16:48
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class StepJumpTest {
    public static void main(String[] args) {
        StepJumpTest stepJumpTest = new StepJumpTest();
        int i = stepJumpTest.jumpFloor(5);

        System.out.println(i);
    }

    public int jumpFloor(int target) {
        if (target <= 1){
            return 1;
        }

        return jumpFloor(target - 1) + jumpFloor(target - 2);
    }
}
