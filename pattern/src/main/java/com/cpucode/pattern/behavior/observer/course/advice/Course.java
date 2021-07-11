package com.cpucode.pattern.behavior.observer.course.advice;

import java.util.Observable;

/**
 * @author : cpucode
 * @date : 2021/7/11
 * @time : 23:26
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class Course extends Observable {
    private String name = "课程";
    private static Course course = null;

    private Course(){}

    public static Course getInstance(){
        if (null == course){
            course = new Course();
        }

        return course;
    }


    public String getName(){
        return name;
    }

    public void publishQuestion(Question question){
        System.out.println(question.getUserName() + "在" + this.name + "上提交了一个问题。");

        setChanged();
        notifyObservers(question);
    }
}