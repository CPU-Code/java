package com.cpucode.pattern.create.factory;

/**
 * @author : cpucode
 * @date : 2021/5/27
 * @time : 21:11
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class JavaCourse implements Course {
    @Override
    public void record() {
        System.out.println("录制Java课程");
    }
}
