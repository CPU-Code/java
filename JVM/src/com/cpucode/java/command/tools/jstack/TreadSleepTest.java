package com.cpucode.java.command.tools.jstack;

/**
 * 演示线程：TIMED_WAITING
 *
 * @author : cpucode
 * @date : 2021/2/6
 * @time : 14:32
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class TreadSleepTest {
    public static void main(String[] args) {
        System.out.println("cpuCode");

        try{
            Thread.sleep(1000 * 60 * 10);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("cpuCode over");
    }
}
