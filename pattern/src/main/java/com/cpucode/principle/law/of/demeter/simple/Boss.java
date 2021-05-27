package com.cpucode.principle.law.of.demeter.simple;

import com.cpucode.principle.law.of.demeter.Course;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : cpucode
 * @date : 2021/5/27
 * @time : 20:17
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class Boss {
    public void commandCheckNumber(TeamLeader teamLeader){
        //模拟 Boss 一页一页往下翻页， TeamLeader 实时统计
        List<Course> courseList = new ArrayList<Course>();

        for (int i= 0; i < 20 ;i ++){
            courseList.add(new Course());
        }

        teamLeader.checkNumberOfCourses(courseList);
    }
}
