package com.cpucode.pattern.behavior.observer.course.advice;

/**
 * @author : cpucode
 * @date : 2021/7/11
 * @time : 23:29
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class Question {
    private String userName;
    private String content;

    public String getUserName(){
        return userName;
    }

    public void setUserName(String userName){
        this.userName = userName;
    }

    public String getContent(){
        return  content;
    }

    public void setContent(String content){
        this.content = content;
    }

}
