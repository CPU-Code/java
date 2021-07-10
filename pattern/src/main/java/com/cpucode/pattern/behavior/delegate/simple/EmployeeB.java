package com.cpucode.pattern.behavior.delegate.simple;

/**
 * @author : cpucode
 * @date : 2021/5/30
 * @time : 21:02
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class EmployeeB implements IEmployee {
    @Override
    public void doing(String command) {
        System.out.println("我是员工 B， 我现在开始干" + command + "工作");
    }
}
