package com.cpucode.principle.simple.responsibility;

/**
 * @author : cpucode
 * @date : 2021/5/27
 * @time : 19:40
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class Course2 {
    public static void main(String[] args) {
        LiveCourse liveCourse = new LiveCourse();
        liveCourse.study("直播课");

        ReplayCourse replayCourse = new ReplayCourse();
        replayCourse.study("录播课");
    }
}
