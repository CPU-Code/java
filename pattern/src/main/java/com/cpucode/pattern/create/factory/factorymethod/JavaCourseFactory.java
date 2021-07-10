package com.cpucode.pattern.create.factory.factorymethod;

import com.cpucode.pattern.create.factory.Course;
import com.cpucode.pattern.create.factory.JavaCourse;

/**
 * @author : cpucode
 * @date : 2021/5/27
 * @time : 22:20
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class JavaCourseFactory implements CourseFactory {
    @Override
    public Course create() {
        return new JavaCourse();
    }
}
