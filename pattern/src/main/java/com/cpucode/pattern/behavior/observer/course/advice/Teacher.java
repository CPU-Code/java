package com.cpucode.pattern.behavior.observer.course.advice;

import java.util.Observable;
import java.util.Observer;
import java.util.Queue;

/**
 * @author : cpucode
 * @date : 2021/7/11
 * @time : 23:33
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class Teacher implements Observer {
    private String name;

    public Teacher(String name){
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        Course course = (Course) o;
        Question question = (Question) arg;

        System.out.println("=========================");
        System.out.println(name + "老师，你好！\\n 您收到了一个来自“" +
                course.getName() + "”的提问，希望您解答，问题内容如下：\n" +
                question.getContent() + "\n 提问者：" +
                question.getUserName());

    }
}
