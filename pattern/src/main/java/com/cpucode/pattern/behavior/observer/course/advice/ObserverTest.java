package com.cpucode.pattern.behavior.observer.course.advice;

/**
 * @author : cpucode
 * @date : 2021/7/11
 * @time : 23:37
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class ObserverTest {
    public static void main(String[] args){
        Course course = Course.getInstance();
        Teacher cpucode = new Teacher("cpucode");
        Teacher tom = new Teacher("tom");

        Question question = new Question();
        question.setUserName("露露");
        question.setContent("观察者设计模式适用于哪些场景？");

        course.addObserver(cpucode);
        course.addObserver(tom);
        course.publishQuestion(question);
    }

}
