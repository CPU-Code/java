package com.cpucode.principle.simple.responsibility;

/**
 * @author : cpucode
 * @date : 2021/5/27
 * @time : 19:41
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public interface CourseTopInfo {
    /**
     * 获得基本信息
     * @return
     */
    String getCourseName();

    /**
     * 获得视频流
     * @return
     */
    byte[] getCourseVideo();
}
