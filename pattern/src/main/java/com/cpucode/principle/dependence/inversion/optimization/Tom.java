package com.cpucode.principle.dependence.inversion.optimization;

/**
 * @author : cpucode
 * @date : 2021/5/27
 * @time : 19:25
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class Tom {
    private Course course;

    public Tom(){}

    public Tom(Course course){
        this.course = course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public void study(Course course){
        course.study();
    }

    public void study(){
        this.course.study();
    }
}
