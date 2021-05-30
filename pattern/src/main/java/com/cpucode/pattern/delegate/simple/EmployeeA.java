package com.cpucode.pattern.delegate.simple;

/**
 * 员工 EmployeeA 类
 *
 * @author : cpucode
 * @date : 2021/5/30
 * @time : 21:01
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class EmployeeA implements IEmployee {
    @Override
    public void doing(String command) {
        System.out.println("我是员工 A， 我现在开始干" + command + "工作");
    }
}
