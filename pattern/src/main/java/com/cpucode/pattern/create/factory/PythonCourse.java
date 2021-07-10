package com.cpucode.pattern.create.factory;

/**
 * @author : cpucode
 * @date : 2021/5/27
 * @time : 21:12
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class PythonCourse implements Course {
    @Override
    public void record() {
        System.out.println("录制Python课程");
    }
}
