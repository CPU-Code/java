package com.cpucode.java.mathTest;

/**
 * Lambda 表达式
 *
 * @author : cpucode
 * @date : 2021/12/20 16:04
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class MathTest {
    public static void main(String[] args) {
        MathTest mathTest = new MathTest();

        // 类型声明
        MathOperation addition = (int a, int b) -> a + b;

        // 不用类型声明
        MathOperation subtraction = (a, b) -> a - b;

        // 大括号中的返回语句
        MathOperation multiplication = (int a, int b) -> { return a * b; };

        // 没有大括号及返回语句
        MathOperation division = (int a, int b) -> a / b;

        System.out.println("10 + 5 = " + mathTest.operate(10, 5, addition));
        System.out.println("10 - 5 = " + mathTest.operate(10, 5, subtraction));
        System.out.println("10 x 5 = " + mathTest.operate(10, 5, multiplication));
        System.out.println("10 / 5 = " + mathTest.operate(10, 5, division));

        // 不用括号
        GreetingService greetService1 = message -> System.out.println("Hello " + message);

        // 用括号
        GreetingService greetService2 = (message) -> { System.out.println("Hello " + message); };

        greetService1.sayMessage("cpuCode");
        greetService2.sayMessage("code");
    }

    interface MathOperation {
        int operation(int a, int b);
    }

    interface GreetingService {
        void sayMessage(String message);
    }

    private int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operation(a, b);
    }
}
