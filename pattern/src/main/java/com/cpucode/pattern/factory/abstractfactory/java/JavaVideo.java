package com.cpucode.pattern.factory.abstractfactory.java;

import com.cpucode.pattern.factory.abstractfactory.Video;

/**
 * 创建 Java 产品族
 *
 * @author : cpucode
 * @date : 2021/5/27
 * @time : 22:42
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class JavaVideo implements Video {
    @Override
    public void record() {
        System.out.println("录制 Java 视频");
    }
}
