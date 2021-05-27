package com.cpucode.pattern.factory.abstractfactory.java;

import com.cpucode.pattern.factory.abstractfactory.*;

/**
 * @author : cpucode
 * @date : 2021/5/27
 * @time : 22:43
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class JavaCourseFactory implements CourseFactory {
    @Override
    public Note createNote() {
        return new JavaNote();
    }

    @Override
    public Video createVideo() {
        return new JavaVideo();
    }
}
