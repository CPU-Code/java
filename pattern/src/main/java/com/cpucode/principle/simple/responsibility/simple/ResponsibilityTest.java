package com.cpucode.principle.simple.responsibility.simple;

/**
 * @author : cpucode
 * @date : 2021/5/27
 * @time : 22:03
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class ResponsibilityTest {
    public static void main(String[] args) {
        Course course = new Course();

        course.study("直播课");
        course.study("录播课");
    }
}
