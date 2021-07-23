package com.cpucode.java.zookeeper.demo;

/**
 * @author : cpucode
 * @date : 2021/7/23
 * @time : 22:47
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class Request {
    private String name;

    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Request{" +
                "name='" + name + '\'' +
                '}';
    }
}
