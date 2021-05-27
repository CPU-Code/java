package com.cpucode.principle.simple.responsibility.simple;

/**
 * @author : cpucode
 * @date : 2021/5/27
 * @time : 19:37
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class Course {
    /**
     * Course 类承担了两种处理逻辑
     *
     * @param courseName
     */
    public void study(String courseName){
        if("直播课".equals(courseName)){
            System.out.println(courseName + "不能快进");
        }else{
            System.out.println(courseName + "可以反复回看");
        }
    }
}
