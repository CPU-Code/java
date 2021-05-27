package com.cpucode.principle.simple.responsibility.optimization;

/**
 * @author : cpucode
 * @date : 2021/5/27
 * @time : 19:41
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public interface CourseInfo {
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
