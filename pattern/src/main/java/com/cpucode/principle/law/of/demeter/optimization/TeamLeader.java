package com.cpucode.principle.law.of.demeter.optimization;

import com.cpucode.principle.law.of.demeter.Course;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : cpucode
 * @date : 2021/5/27
 * @time : 20:20
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class TeamLeader {
    public void checkNumberOfCourses(){
        List<Course> courseList = new ArrayList<Course>();

        for(int i = 0 ; i < 20; i++){
            courseList.add(new Course());
        }

        System.out.println("目前已发布的课程数量是： " + courseList.size());
    }
}
