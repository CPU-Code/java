package com.cpucode.pattern.factory.abstractfactory.python;

import com.cpucode.pattern.factory.abstractfactory.Video;

/**
 * @author : cpucode
 * @date : 2021/5/27
 * @time : 22:44
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class PythonVideo implements Video {
    @Override
    public void record() {
        System.out.println("录制 Python 视频");
    }
}
