package com.cpucode.rpc;

import lombok.Data;

/**
 * @author : cpucode
 * @date : 2021/8/11
 * @time : 13:42
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
@Data
public class User {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
