package com.cpucode.principle.simple.responsibility.optimization;

/**
 * @author : cpucode
 * @date : 2021/5/27
 * @time : 22:05
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class ResponsibilityTest {
    public static void main(String[] args) {
        LiveCourse liveCourse = new LiveCourse();
        liveCourse.study("直播课");

        ReplayCourse replayCourse = new ReplayCourse();
        replayCourse.study("录播课");
    }
}
