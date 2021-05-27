package com.cpucode.pattern.factory.abstractfactory.python;

import com.cpucode.pattern.factory.abstractfactory.*;

/**
 * @author : cpucode
 * @date : 2021/5/27
 * @time : 22:45
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class PythonCourseFactory implements CourseFactory {
    @Override
    public Note createNote() {
        return new PythonNote();
    }

    @Override
    public Video createVideo() {
        return new PythonVideo();
    }
}
