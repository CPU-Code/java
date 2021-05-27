package com.cpucode.principle.simple.responsibility;

/**
 * @author : cpucode
 * @date : 2021/5/27
 * @time : 19:37
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class Course1 {
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

    public static void main(String[] args) {
        Course1 course = new Course1();

        course.study("直播课");
        course.study("录播课");
    }
}
