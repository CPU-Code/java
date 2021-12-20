package com.cpucode.java.greeting;

/**
 *  final 的外层静态局部变量
 *
 * @author : cpucode
 * @date : 2021/12/20 16:14
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class GreetingTest {
    final static String salutation = "cpuCode : ";

    public static void main(String[] args) {
        GreetingService greetingService = message -> System.out.println(salutation + message);

        greetingService.sayMessage("流弊");
    }

    interface GreetingService {
        void sayMessage(String message);
    }
}
