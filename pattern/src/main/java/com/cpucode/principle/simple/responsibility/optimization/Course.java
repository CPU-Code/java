package com.cpucode.principle.simple.responsibility.optimization;

import com.cpucode.principle.simple.responsibility.optimization.LiveCourse;
import com.cpucode.principle.simple.responsibility.optimization.ReplayCourse;

/**
 * @author : cpucode
 * @date : 2021/5/27
 * @time : 19:40
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class Course {
    private void modifyUserName(String userName){
        userName = "Tom";
    }

    private void modifyAddress(String address){
        address = "Changsha";
    }

}
