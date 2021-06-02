package com.cpucode.pattern.template.course;

/**
 * @author : cpucode
 * @date : 2021/6/2
 * @time : 14:42
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class NetworkCourseTest {
    public static void main(String[] args) {
        System.out.println("---Java 架构师课程---");
        NetworkCourse javaCourse = new JavaCourse();
        javaCourse.createCourse();

        System.out.println("---大数据课程---");
        NetworkCourse bigDataCourse = new BigDataCourse(true);
        bigDataCourse.createCourse();
    }
}
