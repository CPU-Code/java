package com.cpucode.principle.dependence.inversion.optimization;

import com.cpucode.principle.dependence.inversion.optimization.Course;

/**
 * @author : cpucode
 * @date : 2021/5/27
 * @time : 19:24
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class JavaCourse implements Course {
    @Override
    public void study() {
        System.out.println("Tom 在学习 Java 课程");
    }
}
