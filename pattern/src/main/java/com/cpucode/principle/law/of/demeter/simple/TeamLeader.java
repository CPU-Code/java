package com.cpucode.principle.law.of.demeter.simple;

import com.cpucode.principle.law.of.demeter.Course;

import java.util.List;

/**
 * @author : cpucode
 * @date : 2021/5/27
 * @time : 20:16
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class TeamLeader {
    public void checkNumberOfCourses(List<Course> courseList){
        System.out.println("目前已发布的课程数量是： " + courseList.size());
    }
}
